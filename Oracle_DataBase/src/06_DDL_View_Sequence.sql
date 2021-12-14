--오라클 - 뷰(view)
--물리적인 테이블에 근거한 논리적인 가상 테이블
--가상이란 단어는 실질적인 데이터를 저장하고 있지 않기 때문에 붙인 것이고 
--테이블이란 단어는 실질적으로 데이터를 저장하고 있지 않더라도 사용 계정자는 
--마치 테이블을 사용하는 것과 동일하게 뷰를 사용할 수 있기 때문에 붙인 것.
--뷰는 기본 테이블에서 파생된 객체로서 기본 테이블에 대한 하나의 쿼리문임
--실제 테이블에 저장된 데이터를 뷰를 통해서 볼수있도록함 
--사용자에게 주어진 뷰를 통해서 기본 테이블을 제한적으로 사용할 수 있음
--뷰는이미 존재하고 있는 테이블에 제한적으로 접근하도록함
--뷰를 새성하기 위해서는 실질적으로 데이터를 저장하고 있는 물리적인 
--테이블이 존재해야 되는데 이 테이블은 기본테이블이라고 함 
--두개이상의 테이블 또는 한개의 테이블이나 또 다른 뷰를 참조하고 있는 객체임
--저장된 테이블이라기 보다 공식 또는 select문을 갖고 있다가 
--명령대로 불러와 그때그때 구성하는 형식 → 원본 데이터 변화가 실시간으로 반영됨
--생성방법
--create or replace view 뷰이름 as(select구문)
--seclet 명령 : 실제테이블의 부분집합(행일부 또는 전부, 열일부 또는 전부)

-- [1] 시퀀스의 생성
create sequence member_seq start with 1 increment by1;
insert into memberlist(num, name, phone)
values(member_seq.newtVal, '홍길서', '010-3333-4444');

insert into memberlist(num, name, phone)
values(member_seq.newtVal, '홍길남', '010-5555-6666');

insert into memberlist(num, name, phone)
values(member_seq.newtVal, '홍길북', '010-7777-8888');

select * from memberlist;