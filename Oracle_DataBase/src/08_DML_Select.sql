--[1] scott 사용자가 관리하고 있는 테이블 목록
select * from tab; -- 단순검색
select * from tabs; -- 상세검색


--[2]특정 테이블의 구조 조회(필드 리스트 / 데이터 조회 형식)
desc dept; -- 커멘드창(sqlplus)에서 확인요망
desc memberlist; -- 커멘드창(sqlplus)에서 확인요망
desc rentlist; 

select subject, makeyear as "출판년도" from booklist; 
--제목이기 때문에 큰따옴표 사용

--아래와 같이 연산식을 이용하여 결과를 필드로 조회하고자 할땐
--as와 함께 만들어진 필드명을 지어주기도 함
select empno || '-' || ename as empinfo from emp
--오라클 SL에서 ||는 이어붙이기 연산 empno || '-' || 값과 ename값을 '-'와 함께 
--이어 붙이거나 그렇게 만들어진 필드의 이름을 emp_info로 설정함

--필드명에 공백이 있거나 기술하기 어려운 필드명일 때도 as로 별칭을 붙이기도함
select empno as "사원번호", ename as "사원 성명" from emp


--[3] 특정 테이블의 모든 필드 표시
select * from rentlist


--[4] 모든 컬럼(필드명)이 아닌 필요한 필드만 조회
select subject, makeyear from booklist;


--[5] 각각의 필드명에 별칭을 부여해서 출력
select subject as 도서제목, makeyear as 출판년도 from booklist;

insert into rentlist values('2021/12/15', rent_seq.nextVal, 7, 9, 100);
insert into rentlist values('2021/12/15', rent_seq.nextVal, 8, 10, 100);
insert into rentlist values('2021/12/16', rent_seq.nextVal, 7, 10, 100);
insert into rentlist values('2021/12/16', rent_seq.nextVal, 8, 9, 100);
                     
insert into rentlist values('2021/12/17', rent_seq.nextVal, 7, 1, 100);
insert into rentlist values('2021/12/15', rent_seq.nextVal, 8, 2, 100);
insert into rentlist values('2021/12/18', rent_seq.nextVal, 7, 1, 100);
insert into rentlist values('2021/12/18', rent_seq.nextVal, 8, 2, 100);
select * from rentlist;

select booknum from rentlist;


--[6]중복 제거
select distinct booknum from rentlist

--rentlist에서 membernum을 중복 제거 후 조회하세요
select distinct membernum from rentlist


--[7]검색 조건의 추가 : 입고가격이 20000원 이상인 book목록
select * from booklist where inprice>=20000


--[8]이름이 '홍'으로 시작하는 회원의 모든 회원정보 출력
select * from memberlist where name like'홍%'


--[9]1983년도 이후로 태어난 회원의 모든 정보
select * from memberlist where birth>='1983-01-01' 


--[10]사은포인트(BPOINT)가 250점 이상이고 1982년 이후로 태어난 회원의 모은 회원정보(and, or연산자 사용)
select * from memberlist where bpoint>=250 and birth>='1982-01-01';


--[11] 제작년도가 2016년 이전이거나 입고가격(inprice)이 18000이하인 book 정보
select * from booklist where inprice <= 18000


--[12] 성명이 '이'로 시작하는 회원의 모든 정보
select * from memberlist where name like '이%'


--[13] 이름이 '용'으로 끝나는 회원의 정보
select * from memberlist where name like '%용'


--[14] 도서 제목에 '이'가 포함되는 도서 정보
select * from booklist where subject like '%이%'


--[15] memberlist에서 성별이 null이 아닌 회원의 이름과 전화번호
select name,phone from memberlist where gender is not null 

--성별이 NULL인 것을 모두 M으루 수정
update memberlist set gender='M' where gender is null


--[16] booklist에서 도서 제목에 두번째 글짜가 '것'인 도서 정보
select * from booklist where subject like '_것%';


-- emp 테이블에서 deptno 가 10,20,30,40 중 하나인 데이터 모두
select * from emp where deptno = 10 or deptno = 20 or deptno= 40;


--조건식(ANY, SOME, ALL, (IN) )
-- 1. ANY
select * from emp where deptno = any (10,20,40);
-- ANY()괄호안에 나열된 내용 중 어느 하나라도 해당되는 것이 있다면 검색 대상으로 함

-- 2. SOME
SELECT * FROM EMP WHERE DEPTNO = SOME(10,20,40);
SELECT * FROM EMP WHERE DEPTNO IN(10,20,40);

--3. ALL
SELECT * FROM EMP WHERE DEPTNO = ALL(10,20,40); 
-- 동시만족 빈도 수 적어 해당 레코드 거의 없음
SELECT * FROM EMP WHERE DEPTNO <> ALL(10,20,40);
SELECT * FROM EMP WHERE DEPTNO <> 10 AND DEPTNO <> 20 AND DEPTNO <> 40
-- 두번 째 코드처럼 모두와 다를 때를 위해 사용하므로 사용빈도수가 낮음

--4. 논리 조건식 NOT
SELECT * FROM EMP WHERE DEPTNO NOT IN (10,20,40);
--IN()안에 있는 것과 하나도 매칭되지 않은 값이 검색 대상

--정렬(SOTR)- WHERE구문 뒤에 또는 구문의 맨 끝에 ORDER BY 필드명 [DESC]라고 기술함
--SELECT 명령의 결과를 특정 필드값의 오름차순이나 내림차순으로 정렬하라는 명령
--ASC : 오름차순 정렬, 쓰지 않으면 기본 오름차순 정렬로 실행됨
--DESC : 내림차순 정렬, 내림 차순 정렬을 위해선 반드시 필드명 뒤에 써야하는 키워드

--EMP 테이블에서 SAL이 1000이상인 데이터를 ENAME의 오름차순으로 정렬하여 조회
SELECT * FROM EMP WHERE SAL >= 1000 ORDER BY ENAME; --오름차순 ASC는 생략
SELECT * FROM EMP;

-- job 으로 내림차순 정렬
SELECT * FROM EMP ORDER BY JOB DESC;  
--EMP와 ORDER 사이에 WHERE을 넣었음.. 윗윗줄 처럼 바꿀 조건이 없었기 때문에 
--WHERE 들어갈 이유 없었음, ORDER BY는 거의 늘 맨마지막에 나온다고 생각하면 됨

--job으로 내림차순 정렬 후 같은 job_id 사이에서는 순서를 hiredate의 내림차순으로 정렬
SELECT * FROM EMP ORDER BY JOB DESC, HIREDATE DESC;
-- 두가지 이상의 정렬 기준이 필요하다면 위와 같이 컴마로 구분해서 두가지 기준을 지정해주며
-- 위의 예제로 봤을 때 JOB으로 1차 내림차순 정렬, 같은 JOB값들 사이에 HIREDATE로 내림차순 정렬


-- 그 외 활용하기 좋은 SELECT 예제 

-- 부서 번호가 10이 아닌 사원 ( 아래 두 문장은 같은 의미의 명령)
SELECT * FROM EMP WHERE NOT (DEPTNO=10);
SELECT * FROM EMP WHERE DEPTNO<>10;

-- 급여가 1000달러 이상, 3000달러 이하
SELECT * FROM EMP WHERE SAL>=1000 AND SAL<=3000;
SELECT * FROM EMP WHERE SAL BETWEEN 1000 AND 3000;

--특정 필드값이 널인 레코드 또는 널이 아닌 레코드
SELECT * FROM EMP WHERE COMM IN NULL -- COMM 필드가 NULL인 레코드
SELECT * FROM EMP WHERE COMM IN NOT NULL  -- COMM 필드가 NULL이 아닌 레코드

--SELECT와 FROM사이에는 문자연산 및 산술연산도 쓸 수 있음..사원의 연봉 출력
SELECT DEPTNO, ENAME, SAL * 12 AS 연봉 FROM EMP;

-- SAL 값이 NULL 경우 위의 계산에 오류가 발생함 이를 해결하기 위한 방법
SELECT DEPTNO, ENAME, COMM, NVL(SAL, 1000)*12 AS 연봉 FROM EMP;
-- NVL함수는 널값을 다른 값으로 바꿔주는 내장함수로서 다음 단원에서 다른 함수들과 함께 학습함