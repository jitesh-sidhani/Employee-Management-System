Create database employeemanagementsystem;
use employeemanagementsystem;
Create table login(username VARCHAR(20),password VARCHAR(20));

select * from login;

insert into login
values('admin','12345');

insert into login(username,password)
values('jitesh','11111');

create table employee(name varchar(20),fname varchar(20),dob varchar(30),salary varchar(20),address varchar(100),phone varchar(20),email varchar(40),education varchar(20),designation varchar(30),aadhar varchar(25),empId varchar(15));
select * from employee;
