SHOW DATABASES;
CREATE DATABASE employee;
USE employee;
CREATE TABLE department (
	department_id VARCHAR(10) PRIMARY KEY,
    department_name VARCHAR(20)
);
CREATE TABLE employee (
	employee_id VARCHAR(10) PRIMARY KEY,
    employee_name VARCHAR(20),
    salary INT,
    department_id VARCHAR(10),
    CONSTRAINT fk_department FOREIGN KEY (department_id) REFERENCES department(department_id)
);
DESC employee;

insert into department (department_id, department_name) values
('KDU01', 'Sales'),
('KDU02', 'Marketing'),
('KDU03', 'HR'),
('KDU04', 'Software');

select * from department;

insert into employee (employee_id, employee_name, salary, department_id) values
('E01', 'Shrishti Gupta', 1600000, 'KDU04'),
('E02', 'Shreya Singh', 2000000, 'KDU01'),
('E03', 'Heeya Tiwari', 100000, 'KDU03'),
('E04', 'Priya Bharadwaj', 1560000, 'KDU02'),

select * from employee;

-- 1 query 

select e.employee_id, e.employee_name, d.department_name
from employee e
join department d on e.department_id = d.department_id;

-- 2 query

select employee_id, employee_name, salary
from employee
order by salary desc;

--3 query 

select d.department_name, avg(e.salary) as average_salary
from department d
join employee e on d.department_id = e.department_id
group by d.department_name;