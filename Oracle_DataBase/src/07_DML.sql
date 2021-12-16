--[1] 샘플 테이블 생성
CREATE TABLE EXAM01(
DEMTNO NUMBER(2), --부서번호
DNAME VARCHAR2(14), --부서명
LOC VARCHAR2(14) --위치
);


--[2] 레코드 추가
--레코드 추가 명령 사용 #1 
insert into exam01(demtno, dname, loc) values(10, 'ACCOUNT', 'NEW YORK');

--레코드 추가 명령 사용 #2
insert into exam01 values(30, 'SALES', 'CHICHAGO');

--두 가지 방법 모두 NULL 값을 입력할 수 있음
insert into exam01(demtno, dname) values(20, 'MARKETING'); --첫번째 방법
insert into exam01 values(40,'OPERATION', NULL); --두번째 방법

SELECT * FROM EXAM01;

--두가지 방법 중 자유롭게 선택하여 booklist 테이블에 10개의 레코드를 추가
--num은 시퀀스를 이용, grade는 'all' '13' '20' 세가지만 골라서 입력 

--insert into booklist(num, subject, makeyear, inprice, rentprice, grade)
--values(book_seq.nextVal,'좀비아이', 2020, 12000, 2500, 'all');
--insert into booklist(num, subject, makeyear, inprice, rentprice, grade) 
--values(book_seq.nextVal,'파국이 온다', 2021, 16200, 2500, 'all');  -- 방법 #1 
-- 			-> failed 났어서 아래 방법2로 두 줄 다시 작성했었으나 오타로 인한 failed 였음..
insert into booklist values(book_seq.nextVal, '좀비아이', 2020, 12000, 2500, 'all');
insert into booklist values(book_seq.nextVal, '파국이 온다', 2021, 16200, 3000, 'all');
insert into booklist values(book_seq.nextVal, '시네마토피아', 2020, 12150, 2000, 'all');
insert into booklist values(book_seq.nextVal, '지구를 위한다는 착각', 2021, 19800, 3000, 'all');
insert into booklist values(book_seq.nextVal, '럭키', 2020, 14400, 2000, 'all');
insert into booklist values(book_seq.nextVal, '공부의 본질', 2021, 14850, 2000, 'all');
insert into booklist values(book_seq.nextVal, '전달의 법칙', 2021, 12600, 2000, 'all');
insert into booklist values(book_seq.nextVal, '먹는거로 취업하자', 2021, 18000, 2500, 'all');
insert into booklist values(book_seq.nextVal, '아주작은 습관의 힘', 2019, 14400, 2000, 'all');
insert into booklist values(book_seq.nextVal, '하루공부 365', 2021, 17820, 2500, 'all'); --방법 #2

select * from booklist;

------

-- 같은 방식으로 memberlist에 7명의 데이터를 추가해주세요. member_seq를 이용
insert into memberlist
values(member_seq.nextVal,'추신수','010-5656-1234','84/07/07', 240,'20/10/01','M',28);
insert into memberlist
values(member_seq.nextVal,'김가나','010-1234-1234','92/12/24', 300,'21/10/18','F',30);
insert into memberlist
values(member_seq.nextVal,'이나다','010-1588-1588','94/01/31', 0,'20/09/25','F',28);
insert into memberlist
values(member_seq.nextVal,'박다라','010-5872-1124','90/06/12', 10,'20/10/16','F',32);
insert into memberlist
values(member_seq.nextVal,'김리후','010-5416-1841','95/07/14', 510,'20/04/01','M',27);
insert into memberlist
values(member_seq.nextVal,'박현아','010-5181-1927','89/05/05', 120,'21/11/01','F',33);
insert into memberlist
values(member_seq.nextVal,'이현수','010-3941-1384','80/07/07', 56,'18/04/03','M',38);

select * from memberlist;

--rentlist 테이블도 rent-seq를 이용해서 10개의 데이터를 추가해주세요
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 15, 100); -- 실패 
-- integrity constraint (SCOTT.FK#) violated - parent key not found 
insert into rentlist values('2021/12/01', rent_seq.nextVal, 2, 3, 10); --성공
insert into rentlist values('2021/12/02', rent_seq.nextVal, 1, 2, 10);
insert into rentlist values('2021/12/02', rent_seq.nextVal, 3, 5, 10);
insert into rentlist values('2021/12/02', rent_seq.nextVal, 7, 6, 10);
insert into rentlist values('2021/12/03', rent_seq.nextVal, 7, 5, 20);
insert into rentlist values('2021/12/03', rent_seq.nextVal, 1, 2, 20);
insert into rentlist values('2021/12/03', rent_seq.nextVal, 2, 3, 20);
insert into rentlist values('2021/12/03', rent_seq.nextVal, 6, 4, 20);
insert into rentlist values('2021/12/04', rent_seq.nextVal, 9, 5, 20);
insert into rentlist values('2021/12/04', rent_seq.nextVal, 10, 7, 30);
	
select * from rentlist;


--[3] 데이터 변경- 수정(UPDATE)
alter table exam01 rename column demtno to deptno; --오타내서 이름 수정함

--데이터 수정의 예 '오라클에선 대소문자를 구분하지 않지만 ''->데이터 값은 구분 필수
--exam01 테이블에서 demtno  deptno 값을 모두 30으로 수정
update exam01 set deptno=30;

--exam01 테이블에서 dname이 'ACCOUNT'인 레코드의 'deptno를 10으로 수정
update exam01 set deptno=10 where dname='ACCOUNT';

--exam01 테이블에서 dname이 'SALES'인 레코드의 deptno를 20으로 수정
update exam01 set deptno=20 where dname='SALES';

--exam01 테이블에서 dname이 'OPERATION'인 레코드의 deptno를 30으로 수정
update exam01 set deptno=30 where dname='OPERATION';

--exam01 테이블에서 dname이 'MARKETING'인 레코드의 deptno를 40으로 수정
update exam01 set deptno=40 where dname='MARKETING';

--exam01 테이블에서 deptno이 30인 레코드의 loc를 'BOSTON'으로 수정 
update exam01 set loc='BOSTON' where deptno=30;

--exam01 테이블에서 deptno이 30인 레코드의 loc를 'LA'으로 수정 
update exam01 set loc='LA' where deptno=30;

select * from exam01;

select * from BOOKLIST;
--booklist 테이블의 제목 '봉제인형 살인사건' 도서의 grade를 '20'으로 수정
update booklist set grade='20' where subject='파국이 온다'; --subject 를 생략하고 썼음

--emp 테이블의 모든 사원의 sal값을 10%씩 인상
update emp set sal = sal + (sal * 0.1);
update emp set sal = sal * 1.1; -- 계산 방식에 따라 위 아래 선택

--emp 테이블에서 sal값이 3000이상인 사워의 급여 10%삭감
update emp set sal = sal * 0.9 where sal >= 3000;

--emp 테이블의 hiredate가 2002년 이전인 사원의 급여를 +2000
-- (2001-12-31보다 작거나 같은)
update emp set sal= sal + 2000 where hiredate <= '2001-12-31';

-- emp 테이블의 ename이 j로 시작하는 사원의 job을 manager로 변경
update emp set job='manager' where ename like 'J%';   --equals(0)='j' 라고 적음..
update emp set job='manager' where ename like '%J';   --j로 끝나는 이름 검색
update emp set job='manager' where ename like '%J%';   --j를 포함하는 이름 검색

--memberlist 테이블에서 bpoint가 200이 넘는 사람만 bpoint*100으로 변경
update memberlist set bpoint=bpoint*100 where bpoint>=200;

--rentlist 테이블에서 할인금액이 100원이 넘으면 모두 할인 금액을 90으로 변경 
update RENTLIST set discount=90 where discount>=100;

--등급이 '20'인 책은 rentprice 10% 인상, 책 제목 끝에 20+를 추가 하겠다
update booklist set rentprice = rentprice * 1.1, subject = subject || '20+' 
where grade='20'; --오라클의 문자 이어붙이기 연산 : || 
update booklist set grade=20 where grade='all';

select * from BOOKLIST;
select * from emp;

--booklist에 grade가 '20'인 레코드의 grade를 '18'으로 변경 rentprice를 10%인상 책 제목 끝에 20+ 추가
update booklist set rentprice = rentprice * 1.1, subject = subject || '18+',
grade=18 where grade='20';

alter table booklist modify subject varchar2(100);

--[4] 레코드의 삭제
--rentlist 테이블에서 discount가 100이하의 레코드를 삭제
delete from rentlist where discount>=100;

--where절이 없으면 테이블 내의 모든 레코드를 삭제함
select * from rentlist;

--삭제의 제한
delete from booklist where subject = '파국이 온다20+';
-- 도서가 rentlist에 대여목록에 존재하므로
--외래키의 참조무결성에 위배되므로 이 삭제명령은 에러 발생함
select * from rentlist;
select * from booklist;
--intergrity constraint (SCOTT.FK1) violated - child record found

--해결방법 #1
--우선 rentlist 테이블에 해당 도서 대여목록 레코드를 모두 삭제 후 booklist테이블에서 해당도서를 삭제해야함
delete from rentlist where booknum=5;
delete from booklist where num=5;

--해결방법 #2
--외래키 제약조건을 삭제한 후 다시 생성
--생성시에 옵션 추가하여 참조되는 값이 삭제되면 참조하는 값도 같이 삭제되도록 구성함

--외래키 삭제
alter table rentlist drop constraint fk1;

--새로운 외래키 추가
alter table rentlist add constraint fk1 foreign key(booknum)
references booklist(num) on delete cascade;
--on delete cascade : booklist의 도서가 삭제되면 rentlist의 해당 도서 대여내역도 함께 삭제되는 옵션

--memberlist테이블에서 회원 한명을 삭제하면 rentlist테이블에서도 해당회원이 대여한 기록을 
--같이 삭제하도록 외래키 설정을 바꿔주세요(외래키 제약조건 삭제 후 재생성)
alter table rentlist drop constraint fk2;

alter table rentlist add constraint fk2 foreign key(membernum)
references memberlist(num) on delete cascade;

--참조되는 값의 삭제가 아니라 수정은 적용되지 않음
--booklist와 memberlist테이블 num은 대여기록이 있을경우 수정 불가능함(아직)
--이를  해결하기 위해 외래키 설정시 on update cascade 옵션을 추가하면 되지만 
--오라클해서는 허용 되지 않음 mysql에서만 사용가능하며 오라클에서는 
--뒷단원의 트리거를 공부하며 외래키가 수정되도록 할 것