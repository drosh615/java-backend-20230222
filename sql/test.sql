create database HumanResource;

use HumanResource;

create table Department (
	department_code varchar(5) primary key,
    department_name varchar(5) not null,
    department_tel_number varchar(13) unique,
    department_address varchar(30) not null,
    head_employee_number varchar(10) 
);
create table Posit (
	position_code varchar(3) primary key,
    position_name varchar(5) not null
);
create table Employee (
	employee_number varchar(10) primary key,
    employee_name varchar(30) not null,
    employee_birth_date varchar(10) not null,
    employee_tel_number varchar(13) unique,
    employee_address varchar(30) not null,
    department_code varchar(5),
    position_code varchar(5)
);

create table Annual_Incom (
	department_code varchar(5),
    position_code varchar(5),
    annual_income_amoun varchar(10) not null
);
select *
from Annual_Incom a
inner join Employee e
on a.department_code = e.department_code;
select *
from Annual_Incom a
inner join Employee e
on a.position_code = e.position_code;

insert into Department 
values ('DEV', '개발부', '051-240-1155', '부산광역시 부산진구','2023010101');
insert into Posit values ('PO1', '사원');
insert into Employee 
values ('2023010101', 'John Doe', '1980-11-12', '010-9184-6574', '부산광역시 부산진구', 'DEV', 'PO1');
insert into Annual_Incom 
values ('DEV', 'PO1', 38000000);

select department_code, department_name, 
(select employee_name, employee_tel_number
from Employee
where head_employee_number = employee_number)
from DeDepartment
where department_code = DEV;

insert into Employee 
values('2023010102', 'raynor seo', '1993-06-02', '010-4736-1346', '부산광역시 서구', 'DEV', 'PO1');
commit;

CREATE INDEX Employee
On Employee (department_code, position_code);

CREATE VIEW DEV_view AS
select department_code, department_name, 
(select employee_name, employee_tel_number
from Employee
where head_employee_number = employee_number)
from DeDepartment
where department_code = DEV;







