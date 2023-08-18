----------------------------------------------------------------------------------
--셀프 조인(self join)을 이용한 멘션 형태의 게시글 목록 출력
----------------------------------------------------------------------------------

SELECT 
a.board_no 원본글번호,
a.board_group 원본글그룹,
a.BOARD_PARENT 원본상위글번호,
b.board_no 상위글번호
FROM board A LEFT OUTER JOIN board B 
 ON A.board_parent = B.board_no 
ORDER BY a.board_no ASC;

SELECT 
a.*,
b.board_no 상위글번호,
b.board_title 상위글제목 
FROM board A LEFT OUTER JOIN board B 
 ON A.board_parent = B.board_no 
ORDER BY a.board_no ASC;
