package com.party.board.service;

import com.party.alram.entity.Alarm;
import com.party.alram.service.AlarmService;
import com.party.board.entity.Applicant;
import com.party.board.repository.ApplicantRepository;
import com.party.board.repository.BoardRepository;
import com.party.exception.BusinessLogicException;
import com.party.exception.ExceptionCode;
import com.party.member.entity.Member;
import com.party.member.repository.MemberRepository;
import com.party.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final MemberService memberService;
    private final MemberRepository memberRepository;
    private final ApplicantRepository applicantRepository;
    private final AlarmService alarmService;

    //모임글 등록
    public Board createBoard(BoardDto.Post postDto) {

        Member member = findMember(extractMemberId());
        Board board = processCreateBoard(postDto, member);
        saveApplicantForBoardCreat(board, member);
        System.out.println("[모임글 생성에 들어가는 날짜]"+ postDto.getDate());
        //알림 발송
        alarmService.sendAlarm(member,board, Alarm.AlarmStatus.BOARD_CREATED,"["+board.getTitle()+"] 모임이 등록되었습니다!🔥");

        return boardRepository.save(board);
    }


    //작성한 모임 참여 처리
    private void saveApplicantForBoardCreat(Board board, Member member) {
        Applicant applicant = new Applicant();
        applicant.setBoard(board);
        applicant.setJoin(true);
        applicant.setMember(member);
        applicant.setMemberImageUrl(member.getImageUrl());
        applicant.setBoardImageUrl(board.getImageUrl());
        applicantRepository.save(applicant);

    }

    //날짜지난 모임 마감처리
    @Scheduled(cron = "0 0 0 * * *")
    public void checkDate(){
        LocalDate today = LocalDate.now();
        List<Board> closedList = findEventsScheduledForDate(today.plus(2, ChronoUnit.DAYS));

        for (Board board : closedList){
            board.setStatus(Board.BoardStatus.BOARD_STATUS);
            String rootImagePath = board.getImageUrl();
            String cutPath = rootImagePath.substring(0, rootImagePath.length()-4);
            System.out.println(cutPath);
            board.setImageUrl(cutPath+"-closed.png");
            boardRepository.save(board);
            //알림 발송
            alarmService.sendAlarm(board.getMember(), board, Alarm.AlarmStatus.BOARD_CLOSED, "["+board.getTitle()+"] 모임이 모집 마감되었습니다 💖");
        }
    }
