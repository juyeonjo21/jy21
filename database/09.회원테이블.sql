/*
	[Q] 회원(member)테이블 구현
	
	테이블 항목
	-회원 아이디(member_id)
	-회원 비밀번호(member_pw)
	-회원 닉네임(member_nickname)
	-회원 생년월일(member_birth)
	-회원 이메일(member_email)
	-회원 전화번호(member_contact)
	-회원 등급(member_level)
	-회원 포인트(member_point)
	-회원 가입일(member_join)
 */

--(주의) 오라클에는 긍정탐색, 부정탐색이 없다
drop table member;
create table member(
member_id varchar2(25) primary key,
member_pw varchar2(20) not null,
member_nickname varchar2(30) not null,
member_birth char(10) not null unique,
member_email varchar2(100),
member_contact varchar2(11) not null,
member_level varchar2(9) default '일반' not null,
member_point number default 0 not null,
member_join date default sysdate not null,
check(regexp_like(member_id, '^[a-z][a-z0-9]{7,24}$')),
check(
	regexp_like(member_pw, '[A-Z]+') 
	and
	regexp_like(member_pw, '[a-z]+')
	and
	regexp_like(member_pw, '[0-9]+')
	and
	regexp_like(member_pw, '[!@#$]+')
	and
	regexp_like(member_pw, '^[A-Za-z0-9!@#$]{8,20}$')
),
check(regexp_like(member_nickname, '^[A-Za-z0-9가-힣]{2,10}$')),
check(regexp_like(member_birth, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(regexp_like(member_contact, '^01[016789][1-9][0-9]{2,3}[0-9]{4}$')),
check(member_level in ('일반', 'VIP', '관리자')),
check(member_point >= 0)
);

insert into member(
	member_id, member_pw, member_nickname, 
	member_birth, member_email, member_contact
)
values(
	'testuser1', 'Testuser1!', '테스트유저1', 
	'2023-07-19', null, '01012345678'
);

select * from member;


