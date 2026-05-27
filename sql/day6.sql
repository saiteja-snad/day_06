CREATE TABLE student(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    course VARCHAR(50)
);
INSERT INTO student VALUES
(1, 'Sai', 21, 'Java'),
(2, 'Teja', 22, 'Python'),
(3, 'Rahul', 20, 'SQL'),
(4, 'Anu', 21, 'Web Development'),
(5, 'Kiran', 23, 'Java'),
(6, 'Pooja', 20, 'Python'),
(7, 'Arjun', 22, 'React'),
(8, 'Divya', 21, 'SQL'),
(9, 'Vikram', 24, 'Spring Boot'),
(10, 'Neha', 22, 'Data Science');

select *from student;

ALTER TABLE student
ADD COLUMN marks INT;

update student set marks=90 where id=1;

alter table student alter marks type float;


alter table student  drop column marks;

alter table student rename column course to domine;

drop table student;

create table student(id int,name varchar(50),age int, course varchar(60));

INSERT INTO student VALUES
(1,'sai',23,'java'),
(2,'anu',22,'java'),
(3,'prasad',23,'mern');
truncate table student;

drop table student;

CREATE TABLE student(
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT CHECK(age >= 18),
    course VARCHAR(50) DEFAULT 'Java'
);

select *from student;

INSERT INTO student VALUES
(1,'Sai','sai@gmail.com',21,'Java'),
(2,'Anu','anu@gmail.com',22,'Python'),
(3,'Prasad','prasad@gmail.com',23,'MERN'),
(4,'Rahul','rahul@gmail.com',20,'SQL'),
(5,'Teja','teja@gmail.com',24,'Spring Boot'),
(6,'Kiran','kiran@gmail.com',22,'React'),
(7,'Pooja','pooja@gmail.com',21,'Data Science'),
(8,'Arjun','arjun@gmail.com',25,'AI'),
(9,'Divya','divya@gmail.com',23,'Machine Learning'),
(10,'Neha','neha@gmail.com',22,'Cyber Security');


update student set name='saiteja' where id=1;

delete from student where course='AI';

CREATE TABLE employee(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary INT
);

select distinct course from student;

select name from student  where course='Java';

select name,id from student order by id desc;

select name ,id from student order by id desc limit 5 offset 1;

SELECT *
FROM student
FETCH FIRST 5 ROWS ONLY;

select course from student group by course ;

select age, count(*) as c from student group by age having count(*)>2;

select sum(age) as s from student;
select min(age) as a from student;
select max(age) as max from student;

select * from student;

select * from student where age>21;

select * from student order by age desc;

select * from student order by id limit 3;

select distinct course from student;
update student set course='python' where id=3;
delete from  student where id=4;

select count(*) as total_no_of_student from student ;
select max(age)as max_age from student;
select min(age)as min_age from student;

select avg(age)as avg_age from student;
