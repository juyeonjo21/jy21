--몬스터와 속성(1대 다 관계) 구현
create table pocketmon(
no number primary key,
name varchar2(30) not null
);
create table pocketmon_type(
type varchar2(9) not null,
no references pocketmon(no)		--외래키(FK, Foreign Key)
);

insert into pocketmon(no,name) values(1,'이상해씨');
insert into pocketmon_type(type,no) values('풀',1);
insert into pocketmon_type(type,no) values('독',1);
commit;

select *  from pocketmon where no = 1;
select * from pocketmon_type where no = 1;

drop table quiz;
create table quiz(
quiz_no number primary key, 
quiz_content varchar2(300) not null
);

drop table choice;
create table choice(
choice_no number primary key,
choice_content varchar2(300) not null,
choice_correct char(1) not null,
check(upper(choice_correct) in ('Y','N')),
-- 외래키 설정 시 부여 가능한 옵션
-- 아무 것도 안 붙이면 하위 요소를 지워야 상위 요소가 삭제됨
-- on delete cascade를 붙이면 상위 요소를 지우면 하위 요소가 자동 삭제됨
-- on delete set null을 붙이면 상위 요소를 지우면 외래키가 null로 바뀜
quiz_no references quiz(quiz_no) on delete cascade
);

insert into quiz(quiz_no,quiz_content) values(1,'한국의 수도는?');

insert into choice(choice_no, choice_content, choice_correct, quiz_no)
values(1,'서울','Y', 1);
insert into choice(choice_no, choice_content, choice_correct, quiz_no)
values(2,'평양','N', 1);
insert into choice(choice_no, choice_content, choice_correct, quiz_no)
values(3,'홍콩','N', 1);
insert into choice(choice_no, choice_content, choice_correct, quiz_no)
values(4,'도쿄','N', 1);
commit;

select * from quiz where quiz_no =  1;
select * from choice where quiz_no = 1;
