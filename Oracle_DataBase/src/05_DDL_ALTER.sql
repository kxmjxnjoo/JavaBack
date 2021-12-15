--1. 필드명의 변경
--ALTER TABLE 테이블 이름 RENAME COLUMN 변경 전 이름 TO 변경 후 이름 
--테이블 이름 : 변경하고자 하는 필드명이 있는 테이블의 이름

--booklist : 테이블의 subject 필드명을 title로 수정하세요
alter table booklist rename column subject to title;
--반대로 title 필드명을 subject 필드명으로 수정합니다
alter table booklist rename column title to subject;
--memberlist 테이블의 memebrname필드를 name으로 변경하세요
alter table memberlist rename column membername to name
--rentlist 테이블의 rent_date필드를 rentdate로 변경하세요
alter table rentlist rename column rent_date to rentdate;
-- rentlist 의 idx 를 numseq 로 변경하세요
alter table rentlist rename column idx to numseq;
-- rentlist 의 numseq 를 num 로 변경하세요
alter table rentlist rename column numseq to num;
-- booklist 의 booknum 을  num 으로 변경하세요
alter table booklist rename column booknum to num;
-- memberlist 의 membernum 을 num 으로 변경하세요
alter table memberlist rename column membernum to num;

select * from booklist;
select * from rentlist;

--테이블을 만들며 생성한 기본키와 외래키등은 필드명이 바뀌면 바뀐 이름으로 자동 적용됨

--외래키는 참조하는 필드의 자료형과 참조되는 필드의 자료형이 일치해야 생성되고 유지됨
--아래 필드의 자료형 변경을 연결된 외래키에서 시도한다면 에러 발생

--2. 필드 자료형의 변경
--varchar2(12) 였던 memberlist 테이블의 name필드를 varchar2(30)으로 변경
alter table memberlist modify name varchar2(50); -- 수정 성공

--booklist의 num 필드를 varchar2(5)로 자료형 변경
alter table booklist modify num varchar2(5); -- 수정 실패
--column type incompatible with referenced column type 수정 실패
--참조되는 컬럼(필드)의 자료형이 현재 수정하려는 컬럼(필드)자료형과 호환되지 않음

--외래키로 연결되어 참조되고 참조하고 있는 필드들은 위의 명령으로 수정이 바로 불가능함
-- 가능하게 하려면 외래키 제약 조건을 수정하여 없애고 참조되는 필드와 참조하는 필드를 
-- 모두 수정한 후 외래키 제약 조건을 다시 설정함
-- alter명령에 의해 제약조건을 수정하는 명령을 아래에서 학습함


--3. 필드의 추가
-- ALTER TABLE 테이블명 ADD 필드명 자료형
-- booklist에 구매등급을 저장할 수 있는 grade필드를 varchar2(15)로 추가
alter table booklist add grade varchar2(15);
--memberlist에 성별(gender) 필드를 varchar2(3)으로 추가
alter table memberlist add gender varchar2(3);
--memberlist에 나에(age) 필드를 number(2)로 추가
alter table memberlist add age number(2);
alter table memberlist modify age number(3);


--4. 필드의 삭제
--ALTER TABLE 테이블명 DROP COLUMN 필드명
--memberlist 테이블에서 성별 필드 제거
alter table memberlist drop column gender;

--booklist에 grande 필드 삭제
alter table booklist drop column grade;
--memberlist에 나이 (age) 필드를 삭제
alter table memberlist drop column age;

-- 다음 항목을 위해 삭제했던 필드들 다시 생성
alter table booklist add grade varchar2(15);
alter table memberlist add gender varchar2(3);
alter table memberlist add age number(2);


--5. 제약 조건의 추가/제거
-- 삭제 : ALTER TABLE 테이블명 DROP CONSRAINT 제약 조건명
--rentlist 테이블의 booknum에 걸려있는 외래키 제약 조건 제거
alter table rentlist drop constraint fk1;
--rentlist 테이블의 membernum에 걸려있는 외래키 제약 조건 제거
alter table rentlist drop constraint fk2;
--rentlist 테이블의 기본키 제거
alter table rentlist drop constraint rent_pk;


-- 위에서 실패했던 필드의 자료형 수정 재실행
-- booklist  의 num 을 varchar2(5) 로 수정
alter table booklist modify num number(5);
-- memberlist  의 num 을 varchar2(5) 로 수정
alter table memberlist modify num number(5);
-- rentlist 의 booknum 을 varchar2(5) 로 수정
alter table rentlist modify booknum number(5);
-- rentlist 의 membernum 을 varchar2(5) 로 수정
alter table rentlist modify membernum number(5);

-- 원래대로 복원
alter table booklist modify num number(5);
alter table memberlist modify num number(5);
alter table rentlist modify booknum number(5);
alter table rentlist modify membernum number(5);

--추가 : ALTER TABLE 테이블명 ADD CONSTRAINT 제약조건명 제약조건식

--필드 LEVEL(수준)의 제약조건은 필드를 modify 하여서 같이 수정 생성합니다
--테이블 LEVEL의 제약 조건은 위의 명령 형식으로 제약조건 이름과 함께 추가함 

--memberlist 테이블의 성별 (gender)필드에 'F','M' 두글자만입력되도록 제약 조건을 추가
alter table memberlist add constarint check_gender check(gender in('F','M'));
-- in() 함수 : 괄호 안의 항목 중 하나에 해당하면 true가 리턴되는 함수로 위의 내용은 chek 함수에 의해 
--gender 필드의 돌아갈 값이 in()함수 안의 항목 중 하나와 같다면 입력 허용, 아니면 불허하는 제약 조건임

--memberlist 테이블의 나이(age)필드에 120살이 초과되는 나이는 입력되지 못하게 제약 조건 추가
alter table memberlist add constraint check_age check(age<150);

--위에 삭제되었던 fk1, fk2, rent_pk 계약조건은 다시 설정하세요
--rent_pk는 num 필드로만 설정하세요
alter table rentlist add constraint fk1 
foreign key(booknum) references booklist(num);

alter table rentlist add constraint fk2 
foreign key(membernum) references memberlist(num);

alter table rentlist add constraint rent_pk
primary key( num );

-- 테이블 생성 연습 문제

-- 테이블 명 ORDERS1 
-- 필드 : ORDER_ID NUMBER(12, 0)			ORDER_DATE		DATE
-- ORDER_MORE	VARCHAR2(8)			CUSTOMER_ID	NUMBER(6, 0)
-- ORDER_STATUS NUMBER(2, 0)			ORDER_TOTAL	NUMBER(8, 2)
-- SALES_REP_ID NUMBER(6, 0)				PROMOTION_ID NUMBER(6, 0)
-- 제약사항 : 기본키는 ORDER_ID - 테이블 레벨
--							ORDER_MODE에는 'direct', 'online'만 입력가능 - 테이블레벨 
--						ORDER_TOTAL의 디폴트 값은 0 - 필드레벨
create table orders1(
	order_id  number(12,0),  
	order_date date,
	order_mode varchar2(8),  
	customer_id number(6,0),
	order_status number(2,0),
	order_total number(8,2) default 0, 
	sale_rep_id number(6,0),
	promotion_id number(6,0),
	constraint pk_order primary key(order_id),
	constraint ck_order_mode check (order_mode in('direct', 'online'))
);


-- 테이블 수정 EX
--CUSTOMER_ID 필드명을 CUSTOMER_NUMBER로 수정
alter table orders1 rename column customer_id to customer_number;

--PROMOSTION_ID값은 10000~99999사이의 값만 저장 가능
--작성 TIP - promotion_id between 10000 and 99999
alter table orders1 add constraint pro_check 
check( promotion_id between 10000 and 99999);

--테이블의 복사
CREATE TABLE orders2 AS SELECT * FROM orders1;
--as select 구분은 select 구문 이후에 다시 학습 함

-- 테이블의 제거
DROP TABLE orders2 purge; --purge는 생략가능
--purge가 없이 삭제된 테이블은 나중에 휴지통과 같이 복구가 가능
-- purge를 사용하면 완전 삭제