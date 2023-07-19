-- 고객 테이블 생성(customer)
DROP TABLE customer;
CREATE TABLE customer(
customer_no NUMBER PRIMARY KEY,
customer_id varchar2(20) NOT NULL UNIQUE,
customer_contact char(13) NOT NULL UNIQUE, 
customer_join char(10) NOT NULL,
customer_purchase char(10) NOT NULL,
customer_mileage NUMBER, 
customer_level varchar2(12) NOT NULL,
check(regexp_like(customer_id, '^[a-z0-9]{8,20}$')),
check(regexp_like(customer_contact, '^010-[0-9]{4}-[0-9]{4}$')),
check(regexp_like(customer_join, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(regexp_like(customer_purchase, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(customer_mileage >= 0),
check(customer_level in ('일반', 'VIP', 'VVIP', '플래티넘'))
);

DROP SEQUENCE customer_seq;
CREATE SEQUENCE customer_seq;




INSERT INTO customer(customer_no, customer_id, customer_contact, customer_join, customer_purchase, customer_mileage, customer_level)
VALUES(customer_seq.nextval , 'testuser1', '010-1212-3434', '2022-01-01', '2022-03-11', 5500, 'VIP');

SELECT * FROM customer;

