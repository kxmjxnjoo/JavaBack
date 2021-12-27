--command 창에서 운영되는 mysql 프로그램 접속

--mysql -h localhosw -u root -p
-- -h는 호스트, -u는 사용자, -p는 비밀번호 의미

--mysql종료는 quit또는 exit

--Schema 생성 command창에서 실행함
create schema scott default chracter set utf8mb4;

--사용하려는 스키마로 이동
use scott;

--현재 스키마의 테이블들 보기
show tables;

--테이블의 구조 보기
desc 테이블 이름;

--LIMIT
--select 로 데이터 조회할 떄 조회할 레코드의 갯수를 조절 제한할 수 있음
select * from memberlist order by num desc limit 5;
--회원정보 조회하여 5개의 레코드만 리턴

--limit와 offset의 동시 사용
select * from memberlist order by num desc limit 5 offset 5;
--6번째 데이터 부터 6개의 레코드 리턴
--offset과 limint는 게시판잉나 상품 진열시에 페이지를 표시하기 위한 용도로 가장 많이 사용됨