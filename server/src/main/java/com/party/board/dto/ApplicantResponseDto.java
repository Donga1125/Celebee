package com.party.board.dto;


import com.party.member.entity.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantResponseDto {

    private Long id;
    private String memberImageUrl;
    private Long memberId;
    private String memberNickname;
    private Long boardId;
    private String boardImageUrl;

}
