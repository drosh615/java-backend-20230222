-- 기차 예약 데이터베이스 생성
create database train_reservation;
use train_reservation;

-- 가격 테이블 생성 
create table Cost (
	departure_station varchar(50) not null,
    arriva_station varchar(50) not null,
    amount int not null
);

create table Train (
	train_number varchar(10) primary key, -- not null unique 
    departure_station varchar(50) not null,
    departure_time TIME not null,
    arrival_station varchar(50) not null,
    arrival_time TIME not null,
    take_minute TIME not null,
    type varchar(10) not null
);

CREATE table Station (
	station_number INT AUTO_INCREMENT primary key,
    station_name varchar(50) not null,
    address text not null unique,
    tel_number varchar(15) not null unique
);

CREATE table Stop_station (
	station_number INT not null,
    train_number varchar(10) not null,
    departure_time time not null,
    arrival_time time not null
);

CREATE table Seat (
	seat_code varchar(5) primary key,
	type varchar(10) not null,
    seat_number varchar(2) not  null,
    train_type varchar(10) not null
);







