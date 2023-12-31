-----------------------------------------------------------------------
--테이블 조인(Table Join) : 서로 다른 테이블을 합쳐서 조회
-----------------------------------------------------------------------
SELECT * FROM MEMBER;
SELECT * FROM board;

--[1] cross join : 두 테이블을 곱하여 출력
SELECT member_id, board_no, board_writer FROM MEMBER,board;

--[2]inner join : 둘 다 있는 경우 연결하여 출력(커플만 출력)
SELECT member_id, member_nickname, board_no, board_writer
FROM MEMBER INNER JOIN board 
ON MEMBER.member_id = board.board_writer;

--[3]outer join : 한 쪽을 기준으로 연결하여 출력(솔로+커플 모두 출력)
SELECT MEMBER_id, member_nickname, board_no, board_writer
FROM board LEFT OUTER JOIN MEMBER 
ON MEMBER.member_id=board.board_writer;

--완성된 구문
SELECT member_nickname, board.*
FROM board LEFT OUTER JOIN MEMBER 
ON MEMBER.member_id=board.board_writer;

--완성된 구문을 view에 저장하는 코드 작성
CREATE VIEW board_list 
AS SELECT member_nickname, board.*
FROM board LEFT OUTER JOIN MEMBER 
ON MEMBER.member_id=board.board_writer;

--board_content 빼고 저장
CREATE OR replace VIEW board_list AS 
SELECT member_nickname, board.BOARD_NO,
board.BOARD_WRITER, board.BOARD_TITLE,
board.BOARD_READCOUNT, board.BOARD_LIKECOUNT,
board.BOARD_REPLYCOUNT,
board.BOARD_CTIME, board.BOARD_UTIME
FROM board LEFT OUTER JOIN MEMBER 
ON MEMBER.member_id=board.board_writer;

select * from board_list;
