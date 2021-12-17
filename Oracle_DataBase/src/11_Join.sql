--[1] 이름 Douglas Grant가 근무하는 부서명과, 상급부서의 이름을 출력하고자 한다면
select * from employees;
select * from DEPARTMENTS

select department_id from employees where emp_name = 'Douglas Grant';
--위명령으로 얻어진 부서번호로 아래와 같이 부서번호를 검색하여 부서명과 상급부서의 이름을 알아냄
select department_name, parent_id from departments where department_id=50;
select department_name from departments where department_id = 10;
--> 위 두개의 명령을 하나의 명령으로 합해주는 역할을 join이 실행함

--cross join : 두개 이상의 테이블이 조인 될 때 where절에 의해 공통되는 컬럼에 의한 결합이 발생하지 않는 경우

--* 가장 최악의 결과를 얻는 조인 방식
--A 테이블과 B테이블의 cross join된다면
--A테이블의 1번 레코드와 B테이블의 모든 레코드와 하나하나 모두 조합
--A테이블의 2번 레코드와 B테이블의 모든 레코드와 하나하나 모두 조합
--A테이블의 3번 레코드와 B테이블의 모든 레코드와 하나하나 모두 조합

SELECT * FROM DEPT -- 레코드 4, 필드 3
SELECT * FROM EMP -- 레코드 14, 필드 8
--크로스 조인
SELECT * FROM DEPT, EMP -- 레코드 56, 필드 11

--equi join : 조인 대상이 되는 두 테이블에서 공통적으로 존재하는 컬럼의 값이 일치하는 행을 연결하여 결과를 생성
select * from dept, emp where emp.deptno = dept.deptno;

--각 사원의 이름, 부서번호, 부서명, 지역을 출력하세요
select emp.ename, emp.deptno, dept.dname, dept.loc from dept, emp
where emp.deptno = dept.deptno

--이름 Douglas Grant가 근무하는 부서명을 출력하세요
--출력 내용 : 사원이름, 부서번호, 부서명, 월급여 
--emplayees 테이블과 deaprtments 테이블 이용

select * from employees

select enamed, emp.deptno, dept,dname, dpept,loc from dept, emp
where emp.deptno = dept.deptno and ename='SCOTT'
--이름이 scott인 사원의 이름, 부서번호, , 위치 출력
select emp.ename, dept.deptno, dept.dname, dept.loc from dept, emp
where emp.deptno = dept.deptno
and ename = 'SCOTT'
--필드명 앞에 테이블 이름을 기술하여 컬럼의 소속을 명확히 해주어야 오류가 없음


--rentlist의 booknum에 해당하는 도서 제목을 rentlist의 rentdatem num, booknum과 함께 출력
select * from rentlist, booklist; --위에 언급한 최악의 과정
select * from rentlist, booklist; where rentlist.booknum = booklist.num;

select rentlst.rentdate, rentlist.num, rentlist.booknum, booklist.subject
from rentlist, booklist where rentlist.num = booklist.num;

-- rentlist의 membernum에 해당하는 회원의 이름과 전화번호를 rentlist의 rentdate, num,
--membernum과 함꼐 출력하세요

select memberlist.name, memberlist.phone, rentlist.rentdate, rentlist.num, rentlist.membernum
from rentlist, memberlist where rentlist.num = memberlist.num



--테이블 명에 별칭을 부여한 후 컬럼 앞에 소속테이블을 지정
--테이블 명으로 소속을 기술할 때 한쪽에만 있는 필드에 생략이 가능하지만
--아래와 같이 별칭 부여시에 모든 필드 앞에 반드시 별칭 기술해야함
select a.ename, b.dname, b.loc, a.deptno from emp a, dept b
where a.deptno = b.deptno and a.ename = 'SCOTT';


--non-equi join
--동일 컬럼이 없어 다른 조건을 사용하여 조인
--조인 조건이 특정 범위 내에 있는지 조사하기 위해 조건 절에 조인 조건을 ‘=’ 연산자 이외의 비교
select * from emp;
select * from salgrade;

--연산자를 이용
select a.ename, a.sal, b.grade from emp a, salgrade b
where a.sal>=b.losal and a.sal <= b.hisal;
--위 아래 코드 무엇을 써도 무방
select a.ename, a.sal, b.grade from emp a, salgrade b
where a.sal between b.losal and b.hisal;

--세개의 테이블을 하나로 조인(equi, nonequi join의 조합)
select a.ename, a.sal, c.grade, b.dname from emp a, dept b, salgrade c
where a.deptno = b.deptno and a.sal between c.losal and c.hisal;

--연습문제
--rentlist 테이블의 rentdate, booknum, membernum을 조회하되
--booklist와 memberlist 테이블을 조인해서 책 제목, 대여가격, 회원이름, 포인트 출력
-- 출력순서 - 대여일자, 도서제목, 회원이름, 포인트
-- 테이블 별칭은 a, b, c

select a.rentdate, b.subject, c.name, c.bpoint from rentlist a, booklist b, memberlist c
where a.num = c.num and a.num between c.num and c.name

select a.rentdate as "대여일자", b.subject as "도서제목", c.name as "회원 성명",
		c.bpoint as"사은포인트"
from rentlist a, booklist b, memberlist c
where a.num = b.num and a.num = c.num;


--조인된 테이블에 계산식으로 필드를 생성할 수도 있음
select a.rentdate as "대여일자", b.subject as "도서제목", c.name as "회원 성명",
		c.bpoint as"사은포인트", b.rentprice - a.discount as "매출금액"
from rentlist a, booklist b, memberlist c
where a.num = b.num and a.num = c.num;


--outer join
--조인 조건에 만족하지 못해서 해당 결과를 출력시에 누락이 되는 문제점이 발생할 떄 해당 레코드를 출력하는 조인 
select a.num, a.subject, b.rentdate from booklist a, rentlist b
where a.num(+)= b.booknum;

select * from emp a, dept b
where a.deptno(+)=b.deptno;
--(+)를 해주면 오른쪽엔 있는데, 왼쪽엔 없는 것이 출력됨
--(+)이 없었으면 14번까지만 출력됐을 텐데 (+)으로 인해
--15번이 NULL로 출력이 된 것


--[3] ANSI join
-- (1) Ansi Cross join
select * from emp, dept -- 일반 크로스 조인 표현
select * from emp cross join dept -- ansi Cross join -> 일반 크로스 조인과 같은 효과

-- (2) Ansi join -- 일반 equi조인과 같은 효과
-- 일반 equi 조인 표현 방식
select ename, dname from emp a, dept b where a.deptno = b.deptno
--Ansi 이너 조인의 표현 방식
select ename, dname from emp inner join dept no emp.deptno = dept.deptno;
--Ansi 이너 조인의 다른 표현 방식 :두테이블의 조인 기준이 되는 필드명이 똑같을 때만 사용 가능
select ename, dname from emp inner join dept using (deptno);

--(3) Ansi Outer Join -- 기존 아우터 조인의 표현 방식
select * from emp, dept where emp.deptno = dept.deptno(+);
select * from emp, dept where emp.deptno(+) = dept.deptno;
--Ansi Outer Join표현 방식
select * from emp left outer join dept on emp.deptno = dept.deptno;
select * from emp right outer join dept on emp.deptno = dept.deptno;
--기준이 있는 필드명중 A테이블의 필드에는 있으나 B테이블 필드에는 해당값이 없는 경우에 대한 표현 여부 결정