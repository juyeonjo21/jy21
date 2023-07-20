-----------------------------------------------------------------------------
-- 수정(update)
-----------------------------------------------------------------------------
-- 이미 존재하는 데이터의 값을 바꾸는 작업
-- 개인정보변경, 조회수증가, 구독/해지/좋아요/게시글수정 ...등

-- <구문형식> -> [조건] - 생략 가능(사실상 무조건 있어야 함)
-- update 테이블이름 set 변경내용 [조건];

-- 모든 상품의 가격을 0으로 변경
UPDATE product SET price = 0;

-- 과자만 0원으로 변경
UPDATE product SET price = 0 WHERE TYPE = '과자';
UPDATE product SET price = 0 WHERE TYPE = '생필품';

UPDATE product SET price = 0, name='증정품' WHERE TYPE = '과자';

--[Q] 1번 상품의 가격을 1500원으로 변경
UPDATE product SET price = 1500 WHERE NO = 1;

--[Q] 스크류바의 가격을 2000원으로 변경
UPDATE product SET price = 2000 WHERE name = '스크류바';

--[Q] 멘토스의 가격을 1000원으로 변경하고 분류를 과자로 변경
UPDATE product SET price = 1000, TYPE = '과자' WHERE name = '멘토스';

--[Q] 과자의 가격을 500원 할인
-- (참고) 오라클에는 누적연산이 없습니다
UPDATE product SET price =(price -500) WHERE TYPE = '과자';

--[Q] 아이스크림의 가격을 10% 인상
UPDATE product SET price = price+(price*1.1)  WHERE TYPE = '아이스크림';






-- 지금까지의 작업을 무효화시키겠다
ROLLBACK;

-- 지금까지의 작업을 확정 저장하겠다
COMMIT;

SELECT * FROM product;


DROP TABLE product;
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


