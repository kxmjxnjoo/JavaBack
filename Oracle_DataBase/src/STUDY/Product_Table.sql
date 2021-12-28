create table productList(
	num varchar2(5) not null,
	name varchar2(30),
	makeyear date default sysdate,
	inpri number(8) default 0,
	sellpri number(8) default 0,
	
	constraint number_pk primary key(num)	
);

create sequence pd_seq start with 1 increment by 1;

insert into productlist(num, name, inpri, sellpri)
values(pd_seq.nextVal, 'COMPUTER', 100, 130);

insert into productlist(num, name, inpri, sellpri)
values(pd_seq.nextVal, 'MOUSE', 1, 2);

insert into productlist(num, name, inpri, sellpri)
values(pd_seq.nextVal, 'KEYBOARD',10 ,15);

insert into productlist(num, name, inpri, sellpri)
values(pd_seq.nextVal, 'MONITOR',12 ,20);

insert into productlist(num, name, inpri, sellpri)
values(pd_seq.nextVal, 'AUDIO',50 ,70);

SELECT * FROM PRODUCTLIST;