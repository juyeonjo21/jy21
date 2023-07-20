-----------------------------------------------------------------------------
-- 삭제(delete)
-----------------------------------------------------------------------------
-- 데이터베이스에 저장된 값을 영구적으로 제거하는 것
-- commit / rollback의 영향을 받음 (-> select만 영향 안 받음)

-- <구문형식>
--delete[from] 테이블이름 [조건];

-- 둘 다 같은 거임(다 지워라-비추천)
DELETE product;
--DELETE FROM product;

--[Q] 1번상품 정보 삭제(제일 많이 씀)
DELETE product WHERE NO = 1;
--[Q] 과자와 아이스크림 삭제
DELETE product  WHERE TYPE IN('과자','아이스크림');
--[Q] 2020년 상반기에 생산한 상품 정보 삭제
DELETE product WHERE extract(YEAR FROM made) = 2020
AND EXTRACT(MONTH FROM made) BETWEEN 1 AND 6;



ROLLBACK;

SELECT * FROM product;
