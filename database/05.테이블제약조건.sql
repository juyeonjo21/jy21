/*
	테이블 제약 조건(table constraint)
	-보관할 데이터의 유효성을 검사하기 위하여 컬럼에 설정하는 조건
	-and라는 키워드로 && 처리를 대신한다
	-or이라는 키워드로 || 처리를 대신한다
	-not이라는 키워드로 ! 처리를 대신한다
	-between은 ~이상 ~이하 조건을 처리한다.
	-오라클에서 '같다(==)'는 = 이다.
	-in (a, b, c) 는 a,b,c 중 하나여야만 한다는 의미
	
	조건의 종류 (아주 중요)
		- check : 추가할 데이터의 형식 검사를 설정(null은 제외)
		- not null : 해당 항목에 null을 허용하지 않겠다는 설정(즉, 필수항목)
		- unique : 특정 항목에 중복을 허용하지 않겠다는 설정
					(여러 항목을 묶어서 처리 가능)
*/

--account 테이블을 삭제하고 조건을 설정하여 다시 생성
DROP TABLE account;
CREATE TABLE account(
account_owner varchar2(21) 
	check(regexp_like(account_owner,'^[가-힣]{2,7}$')),
account_period NUMBER 
	CHECK(account_period in(1,2,3,5,10)),
account_count NUMBER 
	CHECK(account_count >= 1),
account_payment NUMBER 
	CHECK(account_payment >0 
	AND MOD(account_payment, 10000) =0),
account_balance NUMBER 
	check(account_balance >= 0)
);

INSERT INTO account(account_owner, account_period, account_count, account_payment, account_balance)
values(null, null, null, null, null);

-- not null 추가
DROP TABLE score;
CREATE TABLE score(
grade NUMBER NOT NULL check(grade >= 1),
room NUMBER NOT NULL check(room >= 1),
name varchar2(21) NOT NULL CHECK(regexp_like(name,'^[가-힣]{2,7}$')),
--korean number(3) CHECK(korean >= 0 AND korean <= 100),
korean number(3) CHECK(korean BETWEEN 0 AND 100),
english number(3) CHECK (english BETWEEN  0 AND 100),
math  number(3) CHECK (math BETWEEN  0 AND 100)
);

-- 지정된 형식을 벗어나는 값은 추가되지 않음
INSERT INTO score(grade, room, name, korean, english, math)
values(NULL, NULL, NULL, NULL, NULL, NULL );
INSERT INTO score(grade, room, name, korean, english, math)
values(1, 2, '테스트', 10, 20, 30 );


--unique 추가
DROP TABLE score;
CREATE TABLE score(
grade NUMBER NOT NULL check(grade >= 1),
room NUMBER NOT NULL check(room >= 1),
name varchar2(21) NOT NULL CHECK(regexp_like(name,'^[가-힣]{2,7}$')),
--korean number(3) CHECK(korean >= 0 AND korean <= 100),
korean number(3) CHECK(korean BETWEEN 0 AND 100),
english number(3) CHECK (english BETWEEN  0 AND 100),
math  number(3) CHECK (math BETWEEN  0 AND 100),
UNIQUE(grade, room, name)
);


INSERT INTO score(grade, room, name, korean, english, math)
values(1, 2, '테스트', 10, 20, 30 );


