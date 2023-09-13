--testuser2이 좋아요 누른 게시글 정보를 조회
--기준이 있을 때는 outer 조인 (사실 inner Join 이랑 결과는 같음)
SELECT board.* 
FROM board_like
LEFT OUTER JOIN board ON board_like.board_no = board.board_no
WHERE board_like.member_id = 'testuser2'
ORDER BY board.board_no desc;
