
-- [Q] 게시판 테이블(table board) 생성
DROP TABLE board;
CREATE TABLE board(
board_no NUMBER NOT NULL PRIMARY KEY CHECK(board_no > 0),
board_title varchar2(300)NOT NULL,
board_content varchar2(4000) NOT NULL,
board_writer varchar2(20) 
CHECK (regexp_like(board_writer,'^[a-zA-Z0-9]{8,20}$')),
board_readcount NUMBER DEFAULT 0 NOT null check(board_readcount >= 0)
);

/*
 *  결론적으로 사용하는 조건은 앞으로 5가지
 * - NOT NULL - NULL 금지 조건
 * -UNIQUE - 중복 금지 조건(NULL가능)
 * -PRIMARY KEY - NOT NULL + UNIQUE + 불변(데이터 대표 항목)
 * -CHECK - 데이터 형식 검사 조건
 * -DEFAULT - 미 지정 시, 자동 설정될 값 조건
 * 
 */




INSERT INTO board(board_no, board_title, board_content, board_writer, board_readcount)
VALUES(1, '테스트제목', '테스트내용', 'testuser1', 0 );
-- 항목 한 개만 중복이 안된다면 항목에 unique 작성 가능

-- 등록 시 항목을 제외시키면 null이 들어간다
-- null이 아니라 다른 값을 초기값으로 넣고 싶다면 default 키워드 사용
INSERT INTO board(board_no, board_title, board_content, board_writer)
VALUES(3, '입력한제목', '입력한내용', 'testuser1');

SELECT * FROM board;

-- 번호의 경우 목적이 '식별'을 위한 값
-- [1] 번호가 변경될 수 있으면 NOT NULL UNIQUE로 본다
-- [2] 번호가 영원히 변경될 수 없다면 PRIMARY KEY로 본다
-- 한 번 정해지면 빼박 -> PRIMARY KEY (불변)
-- 변동이 있을 수 있으면 -> UNIQUE (가변)

