/*
 	시퀀스(sequence)
 	-번호를 발행해주는 기계
 	-데이터베이스 종류에 따라 시퀀스가 테이블과 합쳐져있는 경우도 있음(my sql)
 	-오라클은 전반적으로 시퀀스를 따로 관리하는 것을 권장
 	
 	create sequence 이름 [옵션];
 	
 	drop sequence 이름;
 	
 	select * from user_sequences; -> 이 명령은 고정
 	
 */
DROP TABLE item;
CREATE TABLE item(
item_no NUMBER PRIMARY KEY ,
item_name varchar2(60) NOT NULL ,
item_price NUMBER NOT NULL 
);
DROP SEQUENCE item_seq;

-- 기본 옵션으로 생성
CREATE SEQUENCE item_seq; --두 번은 안 만들어짐(지우고 만들면 됨)

-- 옵션을 지정하여 생성(1001번부터 9999번까지 1씩 증가, 캐시 없음)
CREATE SEQUENCE item_seq
MINVALUE 1001 --최소값 지정
MAXVALUE 9999 --최대값 지정
INCREMENT BY 1 --증가값 지정
START WITH 1001  --1001부터 뽑아라
--cache 0; -- 캐시값 지정
nocache; -- 노캐시

INSERT INTO item(item_no, item_name, item_price)
--values(1, '컴퓨터', 1000000);
values(item_seq.nextval , '컴퓨터', 1000000);

SELECT * FROM item;

select * from user_sequences;
