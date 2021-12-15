drop sequence member_seq;

-- [1] 시퀀스의 생성
create sequence member_seq start with 1 increment by 1;

insert into memberlist(num, name, phone)
values(member_seq.nextVal, '홍길서', '010-3333-4444');

insert into memberlist(num, name, phone)
values(member_seq.nextVal, '홍길남', '010-5555-6666');

insert into memberlist(num, name, phone)
values(member_seq.nextVal, '홍길북', '010-7777-8888');

select * from memberlist;

--[2] 현재 시퀀스가 어디까지 증가되어져 있는지 확인
select member_seq.currval, member_seq.nextVal from dual;

--[3] 시퀀스 수정 : 최대 증가값을 14까지로 제한
--alter sequence member_seq maxvalue 14;

--[4] 시퀀스 삭제
drop sequence member_seq;

--[5] 시퀀스 재생성 : 다음 숫자부터 시작하게 하여 기존 레코드와 중복 되지 않게함
--create sequence member_seq start with 15 increment by 1;

--1부터 1씩 늘어나는 book_seq		rent_seq를 생성
create sequence book_seq start with 1 increment by 1;
create sequence rent_seq start with 1 increment by 1;

--member_seq를 삭제했다가 4부터 늘어나도록 다시 생성해주세요
drop sequence member_seq;
create sequence member_seq start with 4 increment by 1;

