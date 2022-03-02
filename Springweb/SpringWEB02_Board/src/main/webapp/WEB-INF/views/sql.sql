select * from board;

insert into board(num, userid, email, pass, title, content)
values( board_seq.nextVal, 'hong', 'abc@naver.com', '1234', '첫 방문입니다.', '반갑습니다. 앞으로 많은 격려와 지도 편달 부탁드립니다.');
insert into board(num, userid, email, pass, title, content)
values( board_seq.nextVal, 'somi', 'somi@naver.com', '1234', '돼지골 삽겹살', '맛있네요 다음엔 목살을 먹어봐야겠어요.');
insert into board(num, userid, email, pass, title, content)
values( board_seq.nextVal, 'hong3', 'h3h3@naver.com', '1234', '배가 고픈데.', '삽겹살 글이라니 배가 두배로 고파지네요');
insert into board(num, userid, email, pass, title, content)
values( board_seq.nextVal, 'user', 'user@naver.com', '1234', '벌써 3월입니다', '시간이 빠르네요 다들 3월도 행복하시길...');
insert into board(num, userid, email, pass, title, content)
values( board_seq.nextVal, 'light', 'light@naver.com', '1234', '코로나 바이러스.', '이제 지긋지긋하네요 언제 끝날런지...');

select * from member;

create table member( 
	name varchar2(30),
	userid varchar2(30) primary key,
	pwd varchar2(30), --게시물 수정 삭제를 위한 비밀번호
	email varchar2(30),
	phone varchar2(30),
	admin char(1) default0,
	zip_num varchar2(10),
	address varchar2(100)
);

select * from reply;

create table reply(
	num number(7) primary key, --댓글 순번
	boardnum number(5), --댓글의 해당 게시물 번호
	userid varchar2(20), --댓글 쓴 사람
	writedate date default sysdate, --작성일
	content varchar2(1000) --작성내용
);

create sequence board_seq start with 1 increment by 1;
create sequence reply_seq start with 1 increment by 1;