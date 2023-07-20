-----------------------------------------------------------------------------
-- 서브쿼리(sub query)
-----------------------------------------------------------------------------
-- 여러 개의 구문을 순차적으로 실행하도록 만드는 기술

-- (ex) 가장 비싼 금액의 상품 정보를 조회
SELECT max(price) FROM product;
SELECT * FROM product WHERE price = 3000; 

-- 위의 예제를 서브쿼리로 변환하면 아래와 같다 (중첩에 제한x)
SELECT * FROM product WHERE price = (SELECT max(price) FROM product); 
-- 집계함수를 이용해서 구해라~
--[Q] 가장 최근에 제조된 상품 정보
SELECT * FROM product WHERE made = (SELECT max(made) FROM product); 

--[Q] 가격이 가장 저렴한 책 정보
SELECT * FROM book WHERE book_price = (SELECT min(book_price) FROM book); 

-- 가격이 비싼 순서로 3개만 조회
--SELECT * FROM book WHERE book_price = (SELECT max(book_price) FROM book); 
