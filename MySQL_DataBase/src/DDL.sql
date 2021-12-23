CREATE TABLE `scott`.`booklist` (
  `num` INT NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(100) NOT NULL,
  `makeyear` INT NOT NULL,
  `inprice` INT NOT NULL,
  `rentprice` INT NOT NULL,
  `grade` VARCHAR(6) NULL DEFAULT 'all',
  PRIMARY KEY (`num`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '도서목록';

select * from scott.booklist;

--AUTO_INCREMENT : 오라클의 sequence를 대시하는 자동 숫자 증가 옵션
--VARCHAR2는 없고 VARCHAR가 가변 길이 문자를 나타냄
-- CONSTRAINT없이 제약사항을 표시함
--테이블 이름 앞에 스키마이름. 을 반드시 붙여서 사용

--자주 쓰는 자료형
--INT : 정수 잘형(FLOAT, BOUBLE은 실수)
--VARCHAR : 문자열 자료형, 가변 길이(CHAR은 고정 길이)
--TEXT : 긴 문자열은 TEXT로 별도 저장
--DATETME: 날짜 가로형 저장
--TIBYINT: -128에서 127까지 저장하지만 여기서는 1또는 0만 저장해 불 값 표현

--자주쓰는 제약 조건
--NOT NULL : 빈값은 받지 않는다는 뜻(NULL은 빈 값 허용)
--AUTO_INCREMENT : 숫자 자료형인 경우 다음 로우가 저장될 때 자동으로 1 증가
--UNSIGNED : 0과 양수만 허용
--ZEROFILL : 숫자의 자리수가 고정된 경우 빈 자리에 0을 넣음
--DEFAULT now() : 날짜 컬럼의 기본값을 현재 시간으로



--연습문제
--아래의 필드명을 담은 memberlist테이블을 생성
--필드명 : num(int,자동증가, 기본키), name(varchar(30) not null), 
--  		birth(date, not null), bpoint(int), joingdate(date, 기본값 now()),
--			age(int), gender(varchar(3))
--테이블 comment : 회원목록
--기본 문자 set : UTF 8

CREATE TABLE `scott`.`memberlist` (
  `num` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  `birth` DATETIME NOT NULL,
  `bpoint` INT NULL,
  `joindate` DATETIME NULL DEFAULT now(),
  `gender` VARCHAR(3) NULL,
  `age` INT NOT NULL,
  PRIMARY KEY (`num`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '회원목록';

ALTER TABLE `scott`.`memberlist` 
ADD COLUMN `phone` VARCHAR(45) NOT NULL DEFAULT 0 AFTER `name`;
CHANGE COLUMN `bpoint` `bpoint` INT NOT NULL DEFAULT 0 ;

select * from scott.memberlist;



--연습문제 
--테이블 이름: rentlist
--필드: rentdate(datetime, default now()), numseq(int AI), booknum(int)
--		 membernum(int), discount(int)

--테이블 comment: 매출 목록
--기본 문자 set: utf-8mb4
--워크 벤치에서 테이블 생성하는 명령을 복사해서 이클립스에 붙여넣고 생성하세요

CREATE TABLE `scott`.`rentlist` (
  `rentdate` DATETIME NOT NULL DEFAULT now(),
  `numseq` INT NOT NULL AUTO_INCREMENT,
  `booknum` INT NOT NULL,
  `membernum` INT NOT NULL,
  `discount` INT NULL DEFAULT 0,
  PRIMARY KEY (`numseq`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '매출 목록';

ALTER TABLE `scott`.`rentlist` 
CHANGE COLUMN `numseq` `num` INT NOT NULL AUTO_INCREMENT ,
ADD INDEX `fk1_idx` (`booknum` ASC) VISIBLE,
ADD INDEX `fk2_idx` (`membernum` ASC) VISIBLE;
;
ALTER TABLE `scott`.`rentlist` 
ADD CONSTRAINT `fk1`
  FOREIGN KEY (`booknum`)
  REFERENCES `scott`.`booklist` (`num`)
  ON DELETE CASCADE
  ON UPDATE CASCADE,
ADD CONSTRAINT `fk2`
  FOREIGN KEY (`membernum`)
  REFERENCES `scott`.`memberlist` (`num`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

select * from scott.rentlist;