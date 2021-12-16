--그룹 함수(Group Function) : 지정된 필드의 값 전체를 대상으로 한번 계산하는 함수

--sum() : 특정 필드의 합계
--대여가격의 합계
select sum(rentprice)as "대여가격 합계" from booklist
--입고가격이 18000원 이상인 책들의 대여가격 합계
select sum(rentprice)as "대여가격 합계" from booklist where inprice >= 18000


-- count (*) : 필드내의 데이터 개수(레코드 개수)
-- 전체 회원수
select count(*) as "회원인원수" from memberlist
--사은포인트가 2000이상인 회원의 인원수
select count(*) as "회원인원수" from memberlist where bpoint >=150


-- avg : 평균
SELECT ROUND( AVG(INPRICE), 0 ) FROM BOOKLIST;


--MAX : 최대값
SELECT MAX(INPRICE) FROM BOOKLIST


--MIN : 최소값
SELECT MIN(INPRICE) FROM BOOKLIST


-- VARIANCE(분산), STDDEV(표준편차)
SELECT VARIANCE(salary), STDDEV(salary) FROM EMPLOYEES;

SELECT COUNT(*) FROM RENTLIST;



--GROUP BY : 하나의 필드를 지목해서 같은 값끼리 그룹을 형성한 결과를 도출함
--전체 대여건수
select count(*) from rentlist;

--각 도서별 대여건 수 : 한 번도 대여 안된 도서 제외
select booknum, count(*) from rentlist group by booknum;

--rentlist 날짜별 할인 금액의 평균
select rentdate, round(avg(discount), 0)from rentlist
group by rentdate order by rentdate desc

--rentlist 날짜별 대여 건수
select rentdate, count(*) from rentlist
group by rentdate order by rentdate desc


--employees 테이블의 부서 id별 급여의 평균
select department_id, round(avg(salary))
from Employees
group by department_id;

select * from employees

-- kor_loan_status 테이블의 period(년도와 월)을 그룹으로 대출 잔액(loan_jan_amt)의 합계
select period, sum(loan_jan_amt)
from kor_loan_status
group by period;


--period(년도와 월)을 1차 그룹으로 region(지역)을 2차 그룹으로한 
--대출 잔액(loan_jan_amt)의 합계
select period, region, sum(loan_jan_amt) from kon_loan_status
group by period, region

--Having 절 : 그룹핑된 내용들에 조건을 붙일 때
--날짜 별 할인 금액의 평균을 출력함 다만 그 평균 금액이 100 미만 그룹만 출력
select rentdate as 날짜, avg(discount) as 할인평균 from RENTLIST
group by rentdate
having avg(discount)<100 -- 그룹 안에서 실행된 조건

-- ***GROUP BY 절에는 SELECT와 FROP 사이에 쓰여진 함수를 제외한 모든 필드를
--반드시 작성해야함