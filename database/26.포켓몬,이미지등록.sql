
create table attach(
attach_no number primary key,
attach_name varchar2(256) not null,
attach_size number default 0 not null,
attach_type varchar2(100),
attach_time date default sysdate not null
);



create sequence attach_seq;


SELECT * FROM attach;

DELETE pocketmon;
DELETE attach;
DELETE pocketmon_image;
COMMIT;


SELECT * FROM pocketmon;
SELECT * FROM attach;
SELECT * FROM pocketmon_image;


CREATE SEQUENCE pocketmon_seq;

CREATE TABLE pocketmon_image(
pocketmon_no REFERENCES pocketmon(no) ON DELETE CASCADE NOT NULL,
attach_no REFERENCES attach(attach_no) ON DELETE CASCADE NOT NULL,
PRIMARY KEY(pocketmon_no, attach_no),
unique(pocketmon_no)
);
