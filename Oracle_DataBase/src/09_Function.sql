--라이브러리 함수 요약
-- * 오라클 명령어 : 내장 함수
-- [1] 샘플 테이블인 dual 테이블
select * from tab;
select * from dual;
-- dual : 테이블이 대상이 아닌 연산을 하려고 할 때 from 다음에 형식적으로 붙이는 실제로는 없는 테이블의 이름


--[2] 임시 테이블 출력
select 1234*1234 from dual;


-- *** 문자열 처리 관련 함수 ***
--[3] lower() : 모든 문자를 소문자로 변환
select lower('Hong Kil Dong')as "소문자" from dual;


--[4] upper() : 모든 문자를 대문자로 변환
select upper('Hong Kil Dong')as "대문자" from dual;


--[5] initcap() : 첫자만 대문자로 변환
select initcap('hong kil dong')as "첫글자만 대문자"from dual;

--해당 함수는 입력값이 필드명 일 때 from 뒤에 테이블 이름이 쓰여지며 연산의 대상은 써놓은 필드값들이 됨
--다만 위와 같이 select와 from사이에서 필드값이 아닌 일반 데이터를 대상으로 함수가 쓰인다면
--from뒤에 dual이 쓰여지게 됨
select upper(ename) from emp;
select lower(job) from emp;
select initcap(job) from emp;
-- 함수 연산의 결과는 화면에 결과로 보여질 뿐 테이블의 값을 변경하는 것은 아님

select lower('Hogn Kil Dong')as "소문자" from emp;
-- 일반 데이터 연산에서 from뒤에 테이블 이름을 쓴다면 결과가 테이블의 레코드 개수만큼 출력됨
select ename, lower('Hong Kil Dong' as "소문자")from emp;

--[6] concat() : 문자열 연결
select concat('이젠 IT', '아카데미;') from dual;
select '이젠 IT' || '아카데미' as 문자열연결 from dual;


--[7] length() : 문자열의 길이
select length('이젠 아이티 아카데미'),legnth('The ezen IT') from dual;
select ename, length(ename) from emp;


--[8] substr() : 문자열 추출(데이터, 인덱스(1), 카운트)
select substr('홍길동 만세', 2,4 )from dual;
--substr 의 경우 자바의 substring 처럼 시작번째부터 끝번째 +1이 아니라
--시작번째 부터 글자수를 나타 냅니다. 위의 겨우 2번째 글자부터 네글자 표시 ( 공백 포함)


--[9] instr() : 문자열 시작 위치
select instr('홍길동 만세 동그라미', '동')from dual;


--[10] Ipad(), rpad() : 자리 채우기
select Ipad('Oracle', 20, '#')from dual; -- ####################Oracle
select rpad('Oracle', 20, '*')from dual;  -- Oracle************************


--[11] trim() : 컬럼이나 대상 문자열에서 특정 문자가 첫번째 글자이거나 마지막 글자면 잘라내고 남은 문자열만 반환
select trim('a'from 'aaaOracleaaaaaaaaa')as result from dual; --Oracle
select trim(' ' from '           Oracle   ') as result from dual; -- Oracle


--[12] round() : 반올림(음수 : 소수점 이상 자리)
select round(12.3456,3) from dual; --12.346

select round(1728.9382, 3) from dual; --1728.938
select round(1728.9382, 2) from dual; --1728.94
select round(1728.9382, 1) from dual; --1728.9
select round(1728.9382, 0) from dual; --1729
select round(1728.9382, -1) from dual; --1730
select round(1728.9382, -2) from dual; --1700
select round(1728.9382, -3) from dual; --2000


--[13] abs() : 절대값
select abs(-10) from dual; -- 10


--[14] floor() : 소수점 아래 절사 - 반올림 없음 ceil() : 소수점 아래에서 올림
select floor(12.94567) from dual; --12
select ceil(12.94567) from dual; --13


--[15] trunc() : 특정 자리 자르기 - 반올림 없음, 3은 남기고 싶은 소수점 아래 자리수
select trunc(12.34567, 3) from dual; --12.345;


--[16] mod() : 나머지 -- 8을 5로 나눈 나머지
select mod(8,5) from dual; --3




-- *** 날짜 처리 관련 함수 ***
-- [17] sysdate : 날짜
select sysdate from dual; -- 오늘날짜와 현재 시간


--[18] month_between() : 개월 수 구하기
select floor(month_between('2021-12-31', '2020-07-10')) from dual; --17.677419


--[19] add_month() : 개월 수 더하기
select add_month(sysdate, 200) from dual; --2038-08-16 11:13:38.0


--[20] next_day() : 다가올 요일에 해당하는 날짜 - 오늘 날짜(sysdate)에서 가장 가까운 일요일
select next_day(sysdate, '일요일')from dual;


--[21] last_day(); 해당월의 마지막 일 수
select last_day(sysdate) from dual;
select last_day('2020-02-15') from dual;


--[22] to_char() : 날짜 형식을 문자열로 반환
select to_char(sysdate, 'yyyy-mm-dd') from dual;


--[23] to_date() : 문자형식을 날짜형(date)로 변환
select to_date('2019/12/31', 'yyyy/mm/dd')from dual;


--[24] nvl() : NULL인 데이터를 다른 데이터로 변경
select comm/100as comm_pct from emp;
-- comm 필드값에 따라서 일부 레코드는 계산결과가 null이 나올 수 있음
select nvl(comm, 1)/100 as comm_act from emp;
--해당 필드값이 null이면 1로 바꿔서 게산에 참여

--poWER 함수
SELECT POWER(3, 2), POWER(3, 3), POWER(3, 3.0001) FROM DUAL;
--첫번째 요소값을 두번째 요소만큼 거듭 제곱

--제곱근 SQRT
SELECT SQRT(2), SQRT(5) FROM DUAL;


--[25] decode() : 자바에서 switch의 역할을 하는 함수
select empno, ename, decode(deptno,
				10, 'ACCOUNT',
				20, 'RESEARCH',
				30, 'SALES',
				40, 'OPERATIONS',
				50, 'SH_CHECK',
				60, 'IT_PROG',
				70, 'PR_REP',
				80, 'SA_REP',
				90, 'AD_PRES',
				100, 'FI_ACCOUNT',
				110, 'AC_ACCOUNT'
) as 부서명 from emp;

select * from employees;

select employee_id, emp_name, decode(department_id,
				10, 'ACCOUNT',
				20, 'RESEARCH',
				30, 'SALES',
				40, 'OPERATIONS',
				50, 'SH_CHECK',
				60, 'IT_PROG',
				70, 'PR_REP',
				80, 'SA_REP',
				90, 'AD_PRES',
				100, 'FI_ACCOUNT',
				110, 'AC_ACCOUNT'
) as"부서명"
from EMPLOYEES


--[26] case(): if ~ else if ~와 비슷한 구조
select employee_id, emp_name, department_id
		case when department_id = 10 then 'ACCOUNT'
		case when department_id = 20 then 'RESEARCH'
		case when department_id = 30 then 'SALES'
		case when department_id = 40 then 'OPERATIONS'
		case when department_id = 50 then 'SH_CHECK'
		case when department_id = 60 then 'IT_PROG'
		case when department_id = 70 then  'PR_REP'
		case when department_id = 80 then  'SA_REP'
		case when department_id = 90 then 'AD_PRES'
		case when department_id = 100 then 'FI_ACCOUNT'
		case when department_id = 110 then  'AC_ACCOUNT'
	end as "부서명"
from EMPLOYEES

-- mod와 remainder
-- 둘 다 첫번째 요소를 두번째요소로 나눈 나머지를 계산하지만 내부적
-- 계산 방법이 조금 다름
SELECT MOD(19, 4), MOD(19.123, 4.2) FROM DUAL;
SELECT FEMAINDER(19,4), REMAINDER(19.123, 4.2) FROM DUAL;
-- MOD : 19 - 4 * FLOOR (19/4)
-- REMINDER : 19 - 4 * ROUND(19/4)

--19.5를 4.2로 SKSNS나눈 SKAJWL나머 10.5 - (4.2 * 2) = 2.1 

-- 문자함수 REPLACE
SELECT REPLACE('나는 너를 모르는데 너는 나를 알겠는가?', '나', '너') FROM DUAL;
--REPLACE(문자열1, 문자열2, 문자열3)
--문자열1 내에 있는 글자 중에 문자열2를 찾아서 문자열3으로 대체

SELECT REPLACE('ABC DEF', '', '')FROM DUAL;

-- 변환함수
SELECT TO_CHAR(123456789,'999,999,999') FROM DUAL; --123,456,789 (숫자 -> 문자)
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL; -- 2021-12-16 (날짜 -> 문자)
SELECT TO_NUMBER('123456') FROM DUAL; -- 123456 (문자 -> 숫자)
SELECT TO_DATE('20140101',' YYYY-MM-DD') FROM DUAL; -- 2014-01-01 00:00:00.0 (문자 -> 날짜)
SELECT TO_DATE('20140101 13:44:50', 'YYYY-MM-DD HH24:MI:SS')FROM DUAL; -- 2014-01-01 13:44:50.0
-- 'AM' or 'PM' 오전 오후 표시 -> TO_CHAR(SYSDATE, 'AM')
SELECT TO_CHAR(SYSDATE,'AM')FROM DUAL; -- 오후
--YYYY -> 년도 표시
SELECT TO_CHAR(SYSDATE,'YY"년"')FROM DUAL;  --> 21년
SELECT TO_CHAR(SYSDATE,'Y"년"')FROM DUAL; --> 1년
--MONTH, MON -> 월표시
SELECT TO_CHAR(SYSDATE,'MONTH')FROM DUAL; --> 12월
SELECT TO_CHAR(SYSDATE,'MON')FROM DUAL; --> 12월

--D요일 1~7로 표시
SELECT TO_CHAR(SYSDATE, 'D')FROM DUAL; --> 5(목요일에 해당하는 5) DD의 날짜와 다름
SELECT TO_CHAR(SYSDATE, 'DAY')FROM DUAL; --> 목요일
-- DD일자를 01~31로 표시
SELECT TO_CHAR(SYSDATE, 'DD')FROM DUAL; --> 16
-- DD일자를 001~365 형태로 표시
SELECT TO_CHAR(SYSDATE, 'DDD')FROM DUAL; --> 350
--DL 오늘 날짜를 요일까지 표시
SELECT TO_CHAR(SYSDATE, 'DL') FROM DUAL; --> 2021년 12월 16일 목요일
--WW : 주를 01~53주 형태로 표시
--HH, HH12 : 시간을 01~12시로
--HH24 : 시간을 01~23시로 표시
--MI : 분을 01~59 형태로 표시
SELECT TO_CHAR(SYSDATE, ' MI "분" ')FROM DUAL; --> 12분
--SS : 초를 01~59 형태로 표시
SELECT TO_CHAR(SYSDATE, ' HH24 "시" MI "분" SS "초" ')FROM DUAL; --> 14시 12분 29초