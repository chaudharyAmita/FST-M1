REM   Script: Activity1
REM   Create and describe table

DESCRIBE salesman


CREATE TABLE salesman ( 
    salesman_id int PRIMARY KEY, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

DESCRIBE salesman


