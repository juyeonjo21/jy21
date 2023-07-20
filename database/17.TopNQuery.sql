-----------------------------------------------------------------------------
-- Top N Query
-----------------------------------------------------------------------------
-- 서브쿼리를 사용하여 데이터를 원하는 구간만큼 끊어내는 구문
-- 오라클은 rownum이라는 값을 조회 시 사용할 수 있다
-- rownum은 조회 결과에 순서를 부여한다

--[Q] 상품을 번호순으로 3개만 조회
--[Q] 가격이 저렴한순으로 3개만 조회

SELECT * FROM product ORDER BY price ASC; 
SELECT * FROM product ORDER BY price DESC; 
SELECT * FROM product ORDER BY NO ASC; 

-- 결과가 먼저 나오고 정렬하니까 rownum 값이 제대로 안 나옴
SELECT rownum, product.* FROM product ORDER BY price ASC; 
SELECT rownum, product.* FROM product ORDER BY price DESC; 
SELECT rownum, product.* FROM product ORDER BY NO ASC; 

--  정렬을 먼저하고 rownum을 나중에 붙이도록 구조 개선
--(별칭을 만들어서 rownum을 쓸 때 부를 수 있게 함) -> 조회를 2번하게 됨

--(ex) 가격 오름차순으로 3개까지 끊어서 뽑아내라
SELECT rownum, TMP.* from(
	SELECT * FROM product ORDER BY price ASC
)TMP WHERE rownum <= 3;

-- 문제점 : 중간부터는 조회가 안됨
-- rownum -> 조회하면서 만들어지는(1부터 뽑는) 값인데 3부터 뽑으라고 하니까 안 나오는 거임
--				 (원래 있는 값이 아니니까) / 다음으로 넘어가도 계속 1번으로 갱신됨
SELECT rownum, TMP.* from(
	SELECT * FROM product ORDER BY price ASC
)TMP WHERE rownum BETWEEN 3 AND 5;

-- 해결책 : rownum을 모두 붙인 다음, 조회하도록 서브쿼리를 추가하면 된다

-- 문제점 : rownum은 select마다 생긴다
-- 			//조회하고자 하는 rownum이 새로 생성되어서 다른 값이기 때문에 이름 부여해서 구별
SELECT * FROM(
SELECT rownum, TMP.* from(
	SELECT * FROM product ORDER BY price ASC
	)TMP
)WHERE rownum BETWEEN 3 AND 5;

-- 해결책 : 두 번째 select에서 발생한 rownum에 별칭을 부여 / rownum rn -> 조회하고자 하는 값
SELECT * FROM(
SELECT rownum rn, TMP.* from(
	SELECT * FROM product ORDER BY price ASC
	)TMP
)WHERE rn BETWEEN 3 AND 5;

--[Q] 가격이 가장 비싼 책 Top5 조회
SELECT * FROM(
SELECT rownum, TMP.* from(
	SELECT * FROM book ORDER BY book_price DESC
	)TMP
)WHERE rownum <= 5;

--[Q] 제목이 가장 짧은 책 Top3 조회
SELECT * FROM(
SELECT rownum rn, TMP.* from(
	SELECT * FROM book ORDER BY LENGTH(book_title) ASC, book_id DESC
	)TMP
)WHERE rn BETWEEN 1 AND 3;

--[Q] 출간한지 가장 오래된 책 6등~10등 조회
SELECT * FROM(
SELECT rownum rn, TMP.* from(
	SELECT * FROM book ORDER BY book_publication_date ASC
	)TMP
)WHERE rn BETWEEN 6 AND 10;

SELECT * FROM book;




