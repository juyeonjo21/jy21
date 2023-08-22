--차단된 회원 정보 테이블
CREATE TABLE MEMBER_block(
member_id REFERENCES member(member_id)ON DELETE CASCADE,
block_time DATE DEFAULT sysdate NOT NULL,
PRIMARY KEY(member_id)
);

SELECT * FROM member_block;

--회원 차단 정보까지 조회하는 뷰
SELECT MEMBER.* FROM MEMBER;

CREATE OR REPLACE VIEW member_list as
SELECT
M.*,
nvl2(B.member_id, 'Y','N') block
FROM MEMBER M LEFT OUTER JOIN member_block B
ON M.member_id=B.member_id;
