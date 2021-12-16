--(Data Definition Language)데이터 정의어

-- 테이블 생성 #1
--도서대여점의 도서목록 테이블의 생성
--필드:booknum,jubject, makeyear, inpricen outprice
--자료형:booknum(문자5자리), subject(문자30), makeyear(숫자4), inprice(숫자6), rentprice(숫자6)
--제약조건 : booknum(Not null), subject(Not null), makeyear(), inprice(), outprice()
-- 기본키 : booknum
drop table booklist purge;
drop table memberlist purge;
drop table rentlist pruge;


create table booklist(
	bookNum vachar2(5) not null,
	subject varchar2(30),
	makeyear number(4) default 2021, --number 4란 4byte가 아니라 4자리 숫자를 의미
	inprice number(6) default 0,
	rentprice number(6) default 0,
	
	constraint booknum_pk primary key(booknum)
	-- constraint : 테이블 레벨의 제약조건을 지정하는 키워드
	-- booknum_pk : 테이블 외부에서 현재 제약 조건을 컨트롤 하기 위한 제약 조건의 고유이름
	-- primary key(booknum) : 기본키로 bookum을 지정하겠다는 뜻 
);

-- 테이블 생성 #2
-- 테이블 이름 : MemberList(회원리스트)
-- 필드 : memberNum, memberName, phone, birth, Bpoint
-- 데이터 형식 : memberNum : VARCHAR2(5), memberName : VARCHAR2(12),
--					phone: VARCHAR2(13), Birth : DATE, Bpoint : NUMBER(6)
--					joinDate:Date
--제약조건 : memberNum, memberName, Phone 세개의 필드 Not Null - 필드 레벨로 설정
--				memberNum, : Primary key - 테이블 레벨로 설정
--				Bpoint 기본값 0, joindate 기본값 sysdate (joindate date default sysdte)
drop table memberlist purge;

create table memberList(
	memberNum varchar2(5) not null, 
	memberName varchar2(12) not null,
	phone varchar2(13)not null,
	birth date,
	Bpoint number(6) default 0,
	joinDate date default sysdate, --오늘 날짜를 표시하는 오라클의 키워드
	
	constraint mamber_pk primary key(memberNum)	
);


alter table booklist drop column grade;
alter table booklist rename column bookNum to num;
select * from booklist; -- 테이블의 내용 전체를 조회하는 명령

alter table memberlist drop column num; --실수로 지워버림..
alter table memberlist drop column gender;
alter table memberlist drop column age;

alter table memberlist add memberNum verchar2(5);


select * from memberlist;
--테이블 생성 #3
-- 테이블 이름 : rentlist
-- 필드 : rent_date(date), idx(NUMBER(3)), booknum(NUMBER(5)),
--			membernum(NUMBER(5)),discount(NUMBER(4))
-- 제약조건 : booknum, membernum : not null
-- 기본값 : rent_date - 오늘날짜
-- 왜래키 : booknum-booklist의 booknum을 참조
--  		 mumberNum - memberlist의 booknum을 참조함
-- 기본키 : rent_date, idx 조합에 의한 기본키 설정 
create table rentlist(
	rent_date date default sysdate,--sysdate : 오늘날짜를 표시하는 오라클의 키워드
	idx number(5) not null, --해당 일자의 대여 순번 1부터 시작해서 하루가 지나면 reset
	booknum varchar2(5) not null,
	memberNum varchar2(5) not null,
	discount number(4),
	constraint rent_pk primary key(rent_date, idx), 
	constraint fk1 foreign key(bookNum) references booklist(bookNum),
	constraint fk2 foreign key(memberNum) references memberlist(memberNum)
); 
--foreign key(bookNum) : rent_list 테이블의 booknum 
--references booklist(bookNum) : booklist 테이블에 있는 booknum
-- 외래키가 생성되려면 언급되는 필드명과 연결되는 필드의 자료형도 일치해야함

select * from rentlist;

-- rent_date와 idx를 조합하여 기본키(rent_pk)를 생성함. 두개의 필드가 조합되어 기본키로 지정될 수 있음(슈퍼키)
-- rentlist 테이블의 booknum은 booklist테이블의 booknum을 참조하는 외래키로 지정
-- (제약조건이름 fk1)
-- rentlist 테이블의 membernum은 memberlist테이블의 membernumd을 참조하는 외래키로 지정
--(제약 조건이름 fk2)