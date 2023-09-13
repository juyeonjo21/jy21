CREATE TABLE board_like(
member_id REFERENCES member(member_id) ON DELETE CASCADE NOT NULL,
board_no REFERENCES board(board_no) ON DELETE CASCADE NOT NULL,
PRIMARY KEY(member_id,board_no)
);

SELECT * FROM board_like;



CREATE TABLE follow(
follower REFERENCES member(member_id) ON DELETE CASCADE NOT NULL,
target REFERENCES member(member_id) ON DELETE CASCADE NOT NULL,
follow_time DATE DEFAULT sysdate NOT NULL,
PRIMARY KEY(follower, target)
);

SELECT * FROM follow;
 
