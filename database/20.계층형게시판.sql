-----------------------------------------------------------------------
--계층형 게시판
-----------------------------------------------------------------------

--board 테이블에 항목 추가하는 구문
--(주의)추가하는 항목에 not null이 있으면 기존 데이터를 지워야 함

DELETE board;
COMMIT;

TRUNCATE TABLE board;
ALTER TABLE board add(
	board_group NUMBER NOT NULL,
	board_parent NUMBER,
	board_depth NUMBER DEFAULT 0 NOT null
);

-- board_list 뷰 수정(3개의 항목 추가)
CREATE OR replace VIEW board_list AS 
SELECT member_nickname, board.BOARD_NO,
board.BOARD_WRITER, board.BOARD_TITLE,
board.BOARD_READCOUNT, board.BOARD_LIKECOUNT,
board.BOARD_REPLYCOUNT,
board.BOARD_CTIME, board.BOARD_UTIME,
board_group, board_parent, board_depth
FROM board LEFT OUTER JOIN MEMBER 
ON MEMBER.member_id=board.board_writer;


--계층형 조회구문
SELECT * FROM board_list
CONNECT BY PRIOR board_no = board_parent
START WITH board_parent IS NULL 
ORDER siblings BY board_group DESC, board_no ASC;
