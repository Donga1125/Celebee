# Celebee: 하루단위 모임을 함께할 사람을 모집하는 서비스 
담당하여 작업한 부분만 간추린 저장소입니다. 전체 코드가 궁금하시면 아래 링크를 참고해주세요! <br/> 
프로젝트 메인 저장소 주소: https://github.com/codestates-seb/seb45_main_004  <br/> 

<br/> 

## 프로젝트 소개

좋아하는 가수의 콘서트를 함께 갈 사람, 이번주 주말에 맛집 투어를 함께할 사람 등 하루 단위의 간단한 모임을 함께할 인연을 모집하는 서비스를 제공합니다. 

주최자가 모임의 카테고리, 희망 인원과 장소, 금액 등을 작성하여 게시하면, 참여 신청하여 모임에 함께 합니다. 
- **프로젝트 기간** : 2023년 8월 24일(금) ~ 2023년 9월 22일(수) <br/> 
  현재 프로젝트 진행 기간 동안 해결하지 못했거나, 작업 시간이 부족했던 항목들을 프로젝트 데모데이 이후에 작업했으며 현재도 꾸준하게 리팩토링 작업 중에 있습니다.
- **개발 인원** : 6명 (백엔드 3명, 프론트엔드 3명)
  
- **배포 주소**: https://celebee.kro.kr

- **프로젝트 구조**:
![시스템 아키텍처](https://github.com/Donga1125/Celebee/assets/96361421/c840fba6-4d58-4b16-8d3a-03a6f3f0f6dd)

- **ERD:** <br/> 
![2023-09-18_14 45 50](https://github.com/Donga1125/Celebee/assets/96361421/d407fe10-5712-48a6-be50-fb514f9634c4)

- **API 명세서**:
   <a href="https://documenter.getpostman.com/view/27566438/2s9Y5YT3fE#2f0b370e-db00-4398-ad98-30c515d21887"> Postman API Documentation  </a>


- **프로젝트 노션 링크** :
  <a href="https://rune-ship-1f2.notion.site/6f2bd5a0a6c24b67996a13271f9bcb03"> Team Notion Link  </a>

<br/> 

  ## 서비스 설명
  
|메인페이지|글 상세 페이지|
|:---:|:---:|
|<img src = "https://github.com/codestates-seb/seb45_main_004/assets/129840158/6c06f272-beee-4c30-9078-3b938e958e47" width = "475" height="250">|<img src = "https://github.com/codestates-seb/seb45_main_004/assets/129840158/47e1169c-5528-47ac-9fc2-109565daf31d" width = "475" height="250">|
|<b>글 작성 페이지</b>|<b>마이페이지</b>|
|<img src = "https://github.com/27Lia/fe-sprint-coz-shopping/assets/117743861/d26394d1-6a03-4773-9b62-bc45a1ab1f35" width = "475" height="250">|<img src = "https://github.com/codestates-seb/seb45_main_004/assets/129840158/a6aec436-671e-4c6f-9a62-4ac750004f92" width = "475" height="250">|
<br/> 
<details>
  <summary> 메인페이지 설명 </summary>
   <div markdown="1">
    <ul>
      <li> 최신순 > 마감 전 > 마감 완료 순서로 우선순위를 설정하여 메인화면 모임 정렬</li>
      <li> 'ALL' 카테고리를 기본으로 하며, 카테고리 변경 시 해당하는 모임 출력</li>
      <li> 무한 스코롤으로 구현하여 많은 모임을 노출시킴 </li>
      <li> 모임 이미지에 전환 애니메이션을 적용해 생동감있는 메인 화면을 구성함 </li>
      </ul>
  </div>
</details>

<details>
  <summary> 글 상세 페이지 설명 </summary>
   <div markdown="1">
    <ul>
    <li> </li>
      </ul>
  </div>
</details>

<details>
  <summary> 글 작성 설명 </summary>
   <div markdown="1">
    <ul>
    <li> </li>
      </ul>
  </div>
</details>

<details>
  <summary> 마이페이지 설명 </summary>
   <div markdown="1">
    <ul>
    <li> </li>
      </ul>
  </div>
</details>


## 프로젝트 핵심기술 및 기능

### Back-end
![Spring](https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/spring_boot_jpa-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/spring_security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Mysql](https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/apachetomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white)
![Ngrok](https://img.shields.io/badge/ngrok-1F1E37?style=for-the-badge&logo=ngrok&logoColor=white)
![Amazon AWS](https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Amazon S3](https://img.shields.io/badge/amazons3-569A31?style=for-the-badge&logo=amazons3&logoColor=white)
![Amazon rds](https://img.shields.io/badge/amazonrds-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white)
![Amazon route53](https://img.shields.io/badge/amazonroute53-8C4FFF?style=for-the-badge&logo=amazonroute53&logoColor=white)
![amazonec2](https://img.shields.io/badge/amazonec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white)
![docker](https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![githubactions](https://img.shields.io/badge/githubactions-2088FF?style=for-the-badge&logo=githubactions&logoColor=white)


### Front-end

![HTML](https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![styledcomponents](https://img.shields.io/badge/styledcomponents-DB7093?style=for-the-badge&logo=styledcomponents&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![NodeJS](https://img.shields.io/badge/node.js-339933?style=for-the-badge&logo=nodedotjs&logoColor=black)
![React](https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![React Router](https://img.shields.io/badge/react_router-CA4245?style=for-the-badge&logo=reactrouter&logoColor=black)
![Redux](https://img.shields.io/badge/redux-764ABC?style=for-the-badge&logo=redux&logoColor=white)
![axios](https://img.shields.io/badge/axios-5A29E4?style=for-the-badge&logo=axios&logoColor=white)

### 협업툴

![Github](https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white)
![Discord](https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white)
![Notion](https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white)
![Zoom](https://img.shields.io/badge/zoom-2D8CFF?style=for-the-badge&logo=zoom&logoColor=white)

<br/> 

## 규칙

