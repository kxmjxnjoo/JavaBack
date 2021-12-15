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
select empno as "사원번호", ename as "사원 성명" form emp

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