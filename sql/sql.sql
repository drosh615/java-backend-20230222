# 내용 
-- 내용
/* 부분 주석 */
/*
여러줄
주석
*/

-- DDL (데이터 정의어)
-- 데이터베이스 혹은 테이블(뷰, 인덱스, 프로시저...)을 생성, 수정, 삭제 할 때
-- 사용하는 SQL문

-- 데이터베이스 생성
-- CREATE DATABASE 데이터베이스명;

CREATE DATABASE Hotel;

SHOW DATABASES;

-- 데이터베이스를 생성했으면 사용할 데이터베이스를 선택
-- USE 데이터베이스명;

USE Hotel;

-- 테이블 생성
-- CREATE TABLE 테이블명 (
--   필드명 데이터타입(데이터길이) 제약조건,
--   ...
-- );

CREATE TABLE Custom (
	id INT PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    email VARCHAR(30) UNIQUE,
    age INT,
    address TEXT,
    accept_marketing BOOLEAN DEFAULT false
);

SHOW TABLES;

-- 데이터베이스 수정
-- ALTER DATABASE 데이터베이스명 속성명=값;

-- 테이블 수정
-- ALTER TABLE 테이블명

-- 테이블 필드 추가
-- ALTER TABLE 테이블명 ADD 필드명 데이터타입(데이터길이) 제약조건;
-- 테이블 필드 삭제
-- ALTER TABLE 테이블명 DROP 필드명;
-- 테이블 필드 수정
-- ALTER TABLE 테이블명 MODIFY COLUMN 필드명 데이터타입(데이터길이) 제약조건;

-- 데이터베이스 삭제
-- DROP DATABASE 데이터베이스명;

-- 테이블 삭제
-- DROP TABLE 테이블명;
-- TRUNCATE TABLE 테이블명;

-- DROP TABLE 테이블명 : 테이블의 정의 자체를 제거
-- TRUNCATE TABLE 테이블명 : 테이블을 정의만 남기고 모두 제거 (생성 초기 상태로 돌려놓음)

-- DML (데이터 조작어)
-- 데이터베이스 테이블에 레코드를 삽입, 수정, 삭제, 검색 작업을 수행시키고자 할때
-- 사용하는 SQL문

-- 삽입문 (INSERT INTO)
-- 해당 테이블에 레코드를 삽입 할 때 사용하는 SQL 구문
-- INSERT INTO 테이블명(필드1, 필드2, ...)
-- VALUES (필드1의 데이터, 필드2의 데이터, ...);

INSERT INTO Custom(id, name) VALUES (1, 'John Doe');
INSERT INTO Custom(id, email) VALUES (5, 'qwer@qwer'); -- 필수 값 미입력
INSERT INTO Custom(id, name, email) VALUES (1, 'John Doe', 'qwer@qwer'); -- 기본기 중복

SELECT * FROM Custom;

-- 모든 필드에 값을 넣을 때:
-- INSERT INTO 테이블명
-- VALUES (데이터1, 데이터2, ...);

INSERT INTO Custom 
VALUES (10, 'Michle', 'rewq@qwer.com', 30, 'This is Address', true);

INSERT INTO Custom
VALUES (11, 'lacls159@gmail.com', 'Jihoon', 31, 'Busan', true);

INSERT INTO Custom 
VALUES (12, 'Michle', 'rewq1@qwer.com', 30, 'This is Address');

-- 수정문 (UPDATE)
-- 해당 테이블에서 특정 필드의 값을 수정하고자 할 때
-- 사용하는 SQL 문

-- UPDATE 테이블명 SET 필드명1=데이터1, 필드명2=데이터2, ...;
UPDATE Custom SET accept_marketing = false;
UPDATE Custom SET accept_marketing = true, age = 10;

-- UPDATE 테이블명 SET 필드명1=데이터1, ...
-- WHERE 조건;
UPDATE Custom SET email='email@email.com'
WHERE id = 1;

-- 삭제문 (DELETE)
-- 해당 테이블에서 레코드를 삭제할 때 사용하는 SQL문

-- DELETE FROM 테이블명;
DELETE FROM Custom;

-- DELETE FROM 테이블명 WHERE 조건;
DELETE FROM Custom WHERE name = 'John Doe';

-- 검색문 (SELECT)
-- 해당 테이블에서 특정 필드를 검색하고자 할 때 사용하는 SQL문

-- SELECT 필드명1, 필드명2, ... FROM 테이블명;
SELECT id, name FROM Custom;

-- SELECT * FROM 테이블명;
SELECT * FROM Custom;

-- 필드에 별칭 사용
SELECT name AS 'Full Name'
FROM Custom;

-- 테이블에 별칭 사용
SELECT name
FROM Custom AS C;

-- 중복 제거 (DISTINCT)
SELECT DISTINCT name FROM Custom;

-- 연산자
-- 비교연산

-- BETWEEN a AND b
-- a 보다 크거나 같으면서 b 보다 작거나 같으면 true를 반환
SELECT * FROM Custom
WHERE age BETWEEN 10 AND 20;

-- IN()
-- 인수로 전달된 값과 동일한 값이 하나라도 존재한다면 true를 반환
SELECT * FROM Custom
WHERE name IN ('John Doe', 'Micle', 'James');

-- SELECT * FROM Custom
-- WHERE name = 'John Doe'
-- OR name = 'Micle'
-- OR name = 'James';

-- IS
-- 비교 대상이 Boolean 형태일 때 사용하는 비교 연산자
SELECT * FROM Custom
WHERE accept_marketing IS true;

-- IS NULL
-- 비교 대상이 Null 이면 true를 반환
SELECT * FROM Custom
WHERE eamil IS NULL;

-- LIKE
-- 문자열의 패턴을 비교하여 동일한 패턴을 가지고 있는 문자열이면 true를 반환

-- 와일드 카드
-- % : 0개 이상의 패턴
-- _ : 1개의 패턴
SELECT * FROM Custom
WHERE email LIKE '%gmail%';

-- Constraint (제약조건)
-- RDBMS에서 삽입, 수정, 삭제에 대해서 무결성을 보장해주는 조건

-- NOT NULL
-- 입력 혹은 수정 작업에 있어서 해당 필드에 Null이 올 수 없도록 하는 
-- 제약 조건

-- Create
CREATE TABLE NotnullTable1 (
	notnull_field INT NOT NULL
);

-- Alter
-- Alter로 NOT NULL 제약 조건을 추가할 땐
-- 원래 존재하는 레코드에서 해당 필드의 데이터가 Null이 존재하면 안됨
CREATE TABLE NotnullTable (
	notnull_field INT
);

ALTER TABLE NotnullTable1
MODIFY COLUMN notnull_field INT NOT NULL;

-- Default
-- 입력 작업에서 해당 필드의 값이 들어오지 않으면 기본값으로 지정해 주는
-- 제약 조건

-- CREATE
CREATE TABLE defaultTable1 (
	default_field INT DEFAULT 1
);

-- ALTER
CREATE TABLE defaultTable2 (
	default_field INT
);

ALTER TABLE defaultTable2
MODIFY COLUMN default_field INT DEFAULT 1;

-- UNIQUE
-- 삽입, 수정 작업에서 해당 제약조건이 걸려있는 필드의 데이터에대 해 
-- 중복을 허용하지 않는 제약조건

-- CREATE
CREATE TABLE Unique_Table1 (
	unique_field INT UNIQUE
);

CREATE TABLE Unuque_Table2 (
	unique_field INT,
    CONSTRAINT unique_key_1 UNIQUE (unique_field)
);

-- ALTER
CREATE TABLE Unuque_Table3 (
	unique_field INT
);

ALTER TABLE Unuque_Table3 MODIFY unique_field INT UNIQUE;

CREATE TABLE Unuque_Table4 (
	unique_field INT
);

ALTER TABLE Unuque_Table4 
ADD CONSTRAINT unique_key_1 UNIQUE (unique_field);

-- PRImary key
-- 기본키에 대한 제약조건, not null/ unique 가 포함되어 있음 
-- 삽입, 수정시에 null을 포함할 수 없음. 중복된 데이터를 포함할 수 없음

-- create
create table primary_table2 (
	primary_field INt,
    constraint primary_key_1
    primary key (primary_field)
);

-- alter
create table primary_table3 (
	primary_field INt
);


-- foreign key 
-- 참조 제약조건, 해당 테이블을 해당 필드를 기준으로 외부 테이블의 외부필드를 참조하도록 하는 제약 조건
-- 해당 제약조건이 걸려있는 필드의 경우 참조하는 테이블의 참조 필드에 존재하는 데이터만 삽입할 수 있다 

-- create
create table referenced_table (
	primary_key int primary key
);
-- create 시에 참조 제약 조건을 추가할 때는
-- 선행적으로 참조할 테이블과 필드가 존재햐야하고
-- 참조할 필드가 프라이머리키 혹은 유니크 제약조건이 지정되어있어야한다.
-- 참조 제약조건이 걸리는 필드는 참조할 필드의 데이터타입과 일치해야한다.
create table Foreign_Table1 (
	foreign_field int,
    constraint foreign_key1
    foreign key (foreign_field)
    references referenced_table (primary_key)
);

-- alter
create table  Foreign_Table2 (
	foreign_field int
);

alter table Foreign_Table2
add constraint foreign_key1
foreign key (foreign_field)
references referenced_table (primary_key);

----------------------------------------------------

CREATE TABLE Room (
	room_number VARCHAR(4) PRIMARY KEY,
    room_type VARCHAR(20) NOT NULL,
    room_amount INT NOT NULL,
    custom_id INT,
    CONSTRAINT Room_Foreign_Key
    FOREIGN KEY (custom_id)
    REFERENCES Custom (id)
);

INSERT INTO Room VALUES ('1001', '비즈니스', 200, 1);
INSERT INTO Room VALUES ('1203', 'VIP', 1000, 10);
INSERT INTO Room VALUES ('1801', 'VIP', 1000, 12);

INSERT INTO Room VALUES ('1002', '비즈니스', 200, 1);
INSERT INTO Room VALUES ('1204', 'VIP', 1000, 10);
INSERT INTO Room VALUES ('1802', 'VIP', 1000, 12);

INSERT INTO Room VALUES ('1003', '비즈니스', 200, null);
INSERT INTO Room VALUES ('1205', 'VIP', 1000, null);
INSERT INTO Room VALUES ('1803', 'VIP', 1000, null);

SELECT * FROM Room;

-- JOIN
-- 여러개의 테이블에서 관계로 연결되어 있는 표현을 하나로 검색하도록 해주는
-- 쿼리

-- INNER JOIN
-- FROM 첫번째테이블 INNER JOIN 두번째테이블 ON 조건
-- FROM 첫번째테이블 JOIN 두번째테이블 ON 조건
-- FROM 첫번째테이블, 두번째테이블 WHERE 조건
SELECT R.room_number AS '방번호', C.name AS '고객이름'
FROM Room R INNER JOIN Custom C
ON C.id = R.custom_id;

SELECT *
FROM Room JOIN Custom;

SELECT *
FROM Room, Custom
WHERE Room.custom_id = Custom.id;

-- LEFT JOIN
-- FROM 첫번째테이블 LEFT JOIN 두번째테이블 ON 조건

SELECT *
FROM Room LEFT JOIN Custom
ON Room.custom_id = Custom.id;

INSERT INTO Custom 
VALUES (20, 'David', 'David@gmail.com', 30, 'New york', 1);

-- RIGHT JOIN
-- FROM 첫번째테이블 RIGHT JOIN 두번째테이블 ON 조건
SELECT *
FROM Room RIGHT JOIN Custom
On Room.custom_id = Custom.id;

-- Sub Query
-- 복잡한 Join 문을 조금더 간결하게 사용할 수 있도록 해주는 쿼리
-- SELECT, INSERT, UPDATE, DELETE, SET, DO 에서 사용가능
-- FROM, WHERE 절에서 사용가능

-- WHERE절 사용
SELECT *
FROM Room
WHERE custom_id IN (
	SELECT id
    FROM Custom
    WHERE name = 'Michle'
);

-- ex) IN 연산 + LIKE

SELECT *
FROM Custom
WHERE id IN (
	SELECT id
    FROM Custom
    WHERE name LIKE 'M%'
    OR name LIKE 'D%'
);

-- FROM
SELECT CustomId
FROM (
	SELECT id AS CustomId, email AS CustomEmail
    FROM Custom
) C;

-- ORDER BY (정렬)
-- 특정 필드를 기준으로 오름차순 내림차순 정렬하여 결과를 반환
SELECT * 
FROM Namgu;

-- 내림차순 DESC
SELECT *FROM Namgu
ORDER BY 세대수 DESC;

-- 오름차순 ASC;
SELECT * FROM Namgu
ORDER BY 통 DESC, 반 ASC;








