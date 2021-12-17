-- 뷰 생성 방법
-- create or replace view 뷰이름 as select 조회 명령....
--> 결과는 select의 결과를 테이블로 내어놓는 가상테이블 제작 명령이 새이기는 셈임
-- 뷰이름으로 조회명령을 저장하고 있다가 뷰이름으로 조회할 때 마다 조회명령이 실행되어 결과를 내놓음

create or replace view rentjointable as  
select a.rentdate as "대여일자", b.subject as "도서제목", c.name as "회원 성명",
		c.bpoint as"사은포인트"
from rentlist a, booklist b, memberlist c
where a.num = b.num and a.num = c.num;

select * from rentjointable;
select * from tab;



--emp 테이블과 dept 테이블에서 번호, 이름, 직책, 입사일, 부서번호, 부서이름, 지역
-- 출력하는 view 생성
create or replace view result_inner_join as
select a.empno, a.ename, a.job, a.hiredate, a.deptno, b.dname, b.loc
from emp a, dept b where a.deptno = b.deptno;

select * from result_inner_join