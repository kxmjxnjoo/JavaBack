--세개의 테이블에 각 필드의 자료형과 제약사항에 맞게 각 10개의 레코드를 insert 할 것

insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('홍길동', '010-1111-2222','1992-08-03', 150, '2021-10-18', 'M' , 30)
insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('홍길북', '010-1251-5845','1990-02-28', 150, '2020-10-01', 'M' , 32)
insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('홍길남', '010-1247-4845', '1992-07-25', 150, '2021-10-18', 'M' , 30)
insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('홍강서', '010-2785-1278', '2000-05-03', 150, '2019-01-08', 'F' , 22)
insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('이길수', '010-1157-1268', '1982-08-03', 150, '2020-10-18', 'M' , 40)
insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('박민서', '010-4785-2849', '1995-08-03', 250, '2021-08-08', 'F' , 27)
insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('아무개', '010-1598-2487', '1992-08-03', 150, '2021-10-18', 'M' , 30)
insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('추신수', '010-2458-1254', '1992-08-03', 150, '2021-10-18', 'M' , 30)
insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('강서연', '010-1248-3598', '2001-08-03', 300, '2018-05-18', 'F' , 21)
insert into scott.memberlist(name, phone, birth, bpoint, joindate, gender, age )
values('김서포', '010-1248-1248', '1992-011-15', 150, '2021-10-18', 'F' , 30)

insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '좀비아이', 2020, 12000, 2500, '18')
insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '파국이 온다', 2021, 16200, 3000, '18');
insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '시네마토피아', 2020, 12150, 2000, '15');
insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '지구를 위한다는 착각', 2021, 19800, 3000, '15');
insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '럭키', 2020, 14400, 2000, '12');
insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '공부의 본질', 2021, 14850, 2000, '12');
insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '전달의 법칙', 2021, 12600, 2000, '12');
insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '먹는거로 취업하자', 2021, 18000, 2500, '15');
insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '아주작은 습관의 힘', 2019, 14400, 2000, '12');
insert into scott.booklist (subject, makeyear, inprice, rentprice, grade)
values( '하루공부 365', 2021, 17820, 2500, 'all'); --방법 #2


insert into scott.rentlist(rentdate, booknum, membernum, discount)
values('2021/12/01', 2, 1, 10); --성공
insert into scott.rentlist (rentdate, booknum, membernum, discount)
values('2021/12/20', 1, 2, 100);
insert into scott.rentlist (rentdate, booknum, membernum, discount)
values('2021/12/10',  3, 3, 250);
insert into scott.rentlist(rentdate, booknum, membernum, discount)
values('2021/12/24',  4, 4, 300);
insert into scott.rentlist (rentdate, booknum, membernum, discount)
values('2021/12/26',  5, 5, 100);
insert into scott.rentlist (rentdate, booknum, membernum, discount)
values('2021/12/15',  6, 6, 150);
insert into scott.rentlist (rentdate, booknum, membernum, discount)
values('2021/12/03',  7, 7, 200);
insert into scott.rentlist (rentdate, booknum, membernum, discount)
values('2021/12/2',  8, 8, 300);
insert into scott.rentlist (rentdate, booknum, membernum, discount)
values('2021/12/04',  9, 9, 200);
insert into scott.rentlist (rentdate, booknum, membernum, discount)
values('2021/12/04',  10, 10, 80);