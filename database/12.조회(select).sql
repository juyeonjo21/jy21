/*
 	조회(select)
 	- 테이블의 데이터를 원하는 목적에 맞게 선택적으로 조회
 */
-- 샘플 데이터

create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
price number,
made date,
expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '초코파이', '과자', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '맛동산', '과자', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '참이슬', '주류', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, '처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '바나나킥', '과자', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '오레오', '과자', 2100, '2019-06-01', '2020-06-01');

--기본 조회
SELECT * FROM product;
--이름만 조회
SELECT name FROM product;
--이름과 가격만 조회
SELECT name, price FROM product;
--없는 항목은 조회할 수 없다.
--SELECT name, price, point FROM product;

--항목을 계산해서 조회할 수 있다.
--날짜 계산 시, 기본 처리 단위는 '일'이다.
--유통기한 계산
SELECT name, expire-made+1 FROM product;

--조회한 항목에 표시될 이름을 지정할 수 있다(별칭 설정)
--별칭에 띄어쓰기가 있는 경우에는 쌍따옴표로 감싸서 처리한다
SELECT name "이름", expire-made+1 "유통기한" FROM product;

-----------------------------------------------------------------------------
-- 조건(where) : 조회 결과를 원하는 상황으로 필터링
-----------------------------------------------------------------------------
SELECT * FROM product;
-- 2000원 이상인 상품 정보 조회
select * FROM product WHERE price >= 2000;
-- 1000원 이상 2000원 이하인 상품 정보 조회
SELECT * FROM product WHERE price >= 1000 and price <= 2000;
SELECT * FROM product WHERE price BETWEEN 1000 AND 2000;

-- 오라클에서는 '같다'가 '=' 한 개로 표현된다.
SELECT * FROM product WHERE price = 1000;
-- '같지 않다' 표현식 (1번을 주로 많이 씀)
SELECT * FROM product WHERE price != 1000;
SELECT * FROM product WHERE price <> 1000;

-- <문자열 조건>
-- 문자열도 같음을 '='로 처리한다
-- 유사검색은 like와 instr()로 처리할 수 있다
--		(주의) 시작 검색만큼은 반드시 like를 써야할 정도로 압도적이 차이 발생
--		나머지 성능은 전체적으로 instr이 우수하다
--		복잡한 검색은 'like'로 가능 
SELECT * FROM product WHERE name = '스크류바';
-- '%' 붙으면 뒤에가 있어도 그만 없어도 그만이라는 표시
-- '%' 앞에 찾을 문자만 같은지 판정
-- 일부분만 찾기 때문에 빠름
SELECT * FROM product WHERE name LIKE '스크%';
-- instr 위치로 찾는 명령(전체적으로 파악)-뒤에 꼭 위치를 표시
SELECT * FROM product WHERE instr(name, '스크')=1;
-- 앞에도 '%'가 붙으면 instr 이랑 성능이 다를 바 없다. 
SELECT * FROM product WHERE name LIKE '%이%';
SELECT * FROM product WHERE instr(name, '이')>0;

-- instr은 못 하는 명령 
SELECT * FROM product WHERE name LIKE '오%오';


SELECT * FROM product WHERE TYPE ='과자' OR TYPE = '아이스크림';
SELECT * FROM product WHERE TYPE IN('과자', '아이스크림');

--[Q] 이름에 '초코'가 들어간 상품 정보 조회
SELECT * FROM product WHERE name LIKE '%초코%';
SELECT * FROM product WHERE instr(name, '초코')>0;

--[Q] 이름에 '바나나'로 시작하는 상품 정보 조회(like가 좋음)
SELECT * FROM product WHERE name LIKE '바나나%';
SELECT * FROM product WHERE instr(name, '바나나') =1;

--[Q] 이름에 '이'가 들어있지 않은 상품 정보 조회
SELECT * FROM product WHERE name NOT LIKE '%이%';
SELECT * FROM product WHERE instr(name, '이') =0;

--[Q] 가격이 1000원 이상인 과자를 조회
SELECT * FROM product WHERE TYPE = '과자' AND price >= 1000;

-- <날짜 조건>
-- 기본 형식은 [yyyy-MM-dd hh24:mi:ss]이다. (중간 띄고)
-- 문자열로 간주하고 조회할 수 있다
--			(운영체제에 따라 작동 여부 결정)
-- 문자열로 변환하고 싶다면 to_char() 사용
-- 날짜 추출용 함수인 extract()를 사용하여 원하는 항목을 추출

--2020년에 제조된 상품 조회
--SELECT * FROM product WHERE made LIKE '2020%';

-- 년도를 문자 형식으로 뽑아내는 식 to_char() / 'yyyy'가 '2020'이냐?
SELECT * FROM product WHERE to_char(made, 'yyyy') = '2020';

--날짜에서 특정 항목을 추출하는 식(숫자로 추출)
SELECT * FROM product WHERE extract(YEAR FROM made) = 2020;

SELECT * FROM product WHERE
made BETWEEN
to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
AND to_date('2020-12-31 23:59:59', 'yyyy-mm-dd hh24:mi:ss');


--[Q] 여름(6,7,8)월에 생산한 제품 조회 
SELECT * FROM product WHERE to_char(made, 'mm') IN ('06','07','08');
SELECT * FROM product WHERE extract(MONTH FROM made) BETWEEN 6 AND 8;

--[Q] 2019년 하반기에 생산한 상품 정보 조회
--[1]
SELECT * FROM product WHERE to_char(made, 'yyyy-mm') IN('2019-07','2019-08','2019-09','2019-10',
'2019-11','2019-12');
--[2]
SELECT * FROM product WHERE extract(YEAR FROM made) = 2019
AND EXTRACT(MONTH FROM made) BETWEEN 7 AND 12;
--[3]
SELECT * FROM product WHERE
made BETWEEN
to_date('2019-07-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
AND to_date('2019-12-31 23:59:59', 'yyyy-mm-dd hh24:mi:ss');

--[Q] 2020년부터 현재까지 생산한 상품 정보 조회
-- sysdate는 굳이 to_date() 안 쓰고 바로 써도 됨.
SELECT * FROM product WHERE
made BETWEEN
to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
AND sysdate;

--[Q] 최근 1년간 생산한 상품 정보 조회
-- 오라클 날짜는 기본 계산 단위가 (일)이다
-- 따라서 1년 전은 'sysdate - 365' 이다.
SELECT * FROM product WHERE
made BETWEEN sysdate - 365 AND sysdate;

--(응용) 시간까지 고려(시작일 00시부터 종료일 23시59분까지)
-- 자바에선 문자열 더하기(+)쓰지만, 오라클은 (or)연산을 쓴다.
SELECT * FROM product WHERE
made BETWEEN 
to_date(
to_char(sysdate - 365, 'yyyy-mm-dd') || ' ' || '00:00:00',
'yyyy-mm-dd hh24:mi:ss'
)
AND
to_date(
to_char(sysdate,'yyyy-mm-dd') || ' ' || '23:59:59',
'yyyy-mm-dd hh24:mi:ss'
);

-----------------------------------------------------------------------------
-- 정렬(Order)
-----------------------------------------------------------------------------
-- 모든 조회가 끝나고 나온 결과를 원하는 목적에 따라 재배열
-- asc(오름차순, ascending) / desc(내림차순, descending)

-- 정렬을 따로 지정하지 않겠다(비추천) -> 순번이 오락가락 나올지도
SELECT * FROM product;

SELECT * FROM product ORDER BY NO;
SELECT * FROM product ORDER BY NO ASC;
SELECT * FROM product ORDER BY NO DESC;

--2차 정렬 (가격순이되, 같은 가격이면 순번 순서대로 정렬해라)
SELECT * FROM product ORDER BY price DESC, NO ASC;

--[Q] 최근에 제조된 상품부터 출력
SELECT * FROM product ORDER BY made DESC;
-- 번호가 시퀀스라면 아래 코드도 가능
--SELECT * FROM product ORDER BY NO DESC;

--[Q] 폐기일이 오래된 상품부터 출력
SELECT * FROM product ORDER BY expire ASC;

--[Q] 이름순으로 출력(이름순/ 혹시 이름이 같으면 번호순)
SELECT * FROM product ORDER BY name ASC;
SELECT * FROM product ORDER BY name ASC, NO ASC;

--[Q] 상품을 종류별로 가격이 비싼 순으로 출력
SELECT * FROM product ORDER BY TYPE ASC, price DESC;
SELECT * FROM product ORDER BY TYPE ASC, price DESC, NO ASC;

--[Q] 유통기한이 가장 짧은 상품부터 출력 (+1 해줘야 함.) (*식에 괄호 안 써도 무방)
SELECT * FROM product ORDER BY(expire - made +1) ASC; 
SELECT * FROM product ORDER BY expire - made +1 ASC, NO ASC; 

-- 유통기한 표시(별칭까지 붙이기 "유통기한" 쌍따옴표 생략이 좋음(단, 띄어쓰기 없다면.))
SELECT NO, name, TYPE, price, made, expire, expire - made+1 유통기한
FROM product
ORDER BY expire - made+1 ASC, NO ASC;

-- .*(와일드카드)
SELECT
 product.*, expire-made+1 유통기한 
FROM product 
ORDER BY 유통기한 ASC, NO ASC; 

-- 테이블에도 별칭 부여 가능
SELECT
 p.*, expire-made+1 유통기한 
FROM product p 
ORDER BY 유통기한 ASC, NO ASC; 

