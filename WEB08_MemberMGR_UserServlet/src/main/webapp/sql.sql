CREATE TABLE MEMBER(
	NAME VARCHAR2(10),
	USERID VARCHAR2(10),
	PWD VARCHAR2(10),
	EMAIL VARCHAR(20),
	PHONE VARCHAR2(15),
	ADMIN NUMBER(1) DEFAULT 0, --0:일반 사용자, 1:관리자
	PRIMARY KEY(USERID)
);

insert into member values('이소미', 'somi', '1234', 'gmd@anver.com', '010-1234-1234', 0);
insert into member values('하상오', 'sang12', '1234', 'h12@naver.com', '010-5555-6666', 0);
insert into member values('김승윤', 'light', '1234', 'gmd@daum.net', '010-9999-1111', 0);

select * from member;

commit

update member set admin=1 where userid='somi';

delete member where userid='jinjoo';