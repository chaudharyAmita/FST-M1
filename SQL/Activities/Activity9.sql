REM   Script: Activity9
REM   Joins

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5001, 'James Hoog' 'NewYork', 15),  
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5001, 'James Hoog' 'NewYork', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5001, 'James Hoog' 'NewYork', 15);

Select * from salesman;

DELETE * from salesman;

DELETE from salesman;

INSERT INTO salesman VALUES(5001, 'James Hoog' 'NewYork', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5001, 'James Hoog' ,'NewYork', 15);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

Select * from salesman;

Select * from customers;

Select * from salesman;

Select c.customer_id, s.salesman_name 
from customers c 
JOIN 
salesman s 
on c.salesman_id = s.salesman_id;

Select c.customer_id,c.customer_name, s.salesman_name 
from customers c 
JOIN 
salesman s 
on c.salesman_id = s.salesman_id 
order by c.customer_id;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_id,a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

Select * from customers;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
LEFT OUTER JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300  
ORDER BY c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
OUTER JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300  
ORDER BY c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
INNER JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300  
ORDER BY c.customer_id;

Select * from customers;

Select * from salesman;

INSERT INTO salesman VALUES(5009, 'dsad Knite', 'Paris', 13);

Select * from salesman;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
INNER JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300  
ORDER BY c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
RIGHT JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300  
ORDER BY c.customer_id;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

Select * from customers;

Select * from orders;

Select * from salesman;

INSERT INTO salesman VALUES(5009, 'dsad Knite', 'Paris', 13);

Select c.customer_id,c.customer_name, s.salesman_name from customers c  
INNER JOIN salesman s on c.salesman_id = s. order by c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
LEFT JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300  
ORDER BY c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
LEFT JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300  
ORDER BY c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
RIGHT JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300  
ORDER BY c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
RIGHT JOIN salesman s ON c.salesman_id=s.salesman_id  
ORDER BY c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
LEFT JOIN salesman s ON c.salesman_id=s.salesman_id  
ORDER BY c.customer_id;

Select * from customers;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
LEFT JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<200  
ORDER BY c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
RIGHT JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<200  
ORDER BY c.customer_id;

SELECT c.customer_id,c.customer_name, c.grade, s.salesman_name FROM customers c 
RIGHT JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<200  
ORDER BY c.customer_id;

SELECT c.customer_name AS "Customer Name", s.salesman_name AS "Salesman", s.commission FROM customers c 
INNER JOIN salesman s ON c.salesman_id=s.salesman_id  
WHERE s.commission>12;

SELECT o.order_no, o.order_date, o.purchase_amount, c.customer_name AS "Customer Name",s.salesman_name AS "Salesman", s.commission FROM orders o  
INNER JOIN customers c ON o.customer_id=c.customer_id  
INNER JOIN salesman s ON o.salesman_id=s.salesman_id;

