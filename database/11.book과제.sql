
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

INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 14.99, 'Grand Central Publishing', 336, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 12.99, 'Scribner', 180, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, '1984', 'George Orwell', '1949-06-08', 10.99, 'Secker & Warburg', 328, 'Dystopian');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'Pride and Prejudice', 'Jane Austen', '1913-01-28', 9.99, 'Penguin Classics', 432, 'Romance');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Hobbit', 'J.R.R. Tolkien', '1937-09-21', 15.99, 'Houghton Mifflin Harcourt', 320, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Catcher in the Rye', 'J.D. Salinger', '1951-07-16', 11.99, 'Little, Brown and Company', 224, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'Lord of the Rings', 'J.R.R. Tolkien', '1954-07-29', 29.99, 'Allen & Unwin', 1178, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'To the Lighthouse', 'Virginia Woolf', '1927-05-05', 13.99, 'Harcourt, Brace and Company', 209, 'Modernist');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Alchemist', 'Paulo Coelho', '1988-06-01', 9.99, 'HarperOne', 208, 'Fiction');

select * from book;
