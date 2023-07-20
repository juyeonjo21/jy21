
/* book 테이블 문제 풀이
https://docs.google.com/spreadsheets/d/1BLulNV30DAAq4oDY2fTul3Hu1fxWi-7RpCXxmWRLHIk/edit#gid=1988015179
*/

DROP TABLE book;
CREATE TABLE book(
book_id NUMBER PRIMARY KEY,
book_title varchar2(300) NOT NULL,
book_author varchar2(90),
book_publication_date char(10), 
book_price number(*,2) NOT NULL,
book_publisher varchar2(90) NOT NULL, 
book_page_count NUMBER NOT NULL, 
book_genre varchar2(12),
CHECK(regexp_like(book_author,'[^!@#$]+')),
CHECK(book_price >=0),
CHECK(book_page_count >= 1),
CHECK(regexp_like(book_publication_date, 
	'^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$'))
);
DROP SEQUENCE book_seq;
CREATE SEQUENCE book_seq;

INSERT INTO book(book_id, book_title, book_author, book_publication_date,
book_price, book_publisher, book_page_count, book_genre)
VALUES(book_seq.nextval, 'harry potter1', 'j.k rowling', '2001-06-26', 19.99, 'scholastic',
320, 'fantasy');

