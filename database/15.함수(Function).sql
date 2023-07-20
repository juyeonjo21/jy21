-----------------------------------------------------------------------------
-- 함수(Function)
-----------------------------------------------------------------------------
-- 입력과 출력으로 이루어진 기능 집합
-- 부르면 무언가 작업해주는 도구

-- <단일행 함수> - 입력과 출력이 1대 1인 함수
SELECT book_title FROM book;
-- upper() -> 대문자로 변환
SELECT upper(book_title) FROM book;
-- lower() -> 소문자로 변환
SELECT lower(book_title) FROM book;
--length() -> 길이
SELECT LENGTH(book_title) FROM book;

SELECT * FROM book WHERE lower(book_title) LIKE 'harry%';

-- <집계 함수> - 데이터를 모아서 하나의 결과를 만드는 함수
--(주의) 집계함수는 정해진 자리에만 사용할 수 있다
--SELECT * FROM book WHERE book_price = max(book_price);
SELECT max(book_price) FROM book;
SELECT min(book_price) FROM book;
SELECT sum(book_price) FROM book;
SELECT avg(book_price) FROM book;
-- count는 해당 항목이 null이면 카운트하지 않는다
SELECT count(book_price) FROM book;
--null 여부와 관계 없이 카운트하고 싶다면 다음과 같이 사용/(*) 와일드카드 사용
SELECT count(*) FROM book;

-- <분석 함수>
