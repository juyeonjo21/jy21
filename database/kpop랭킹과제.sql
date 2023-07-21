
--[Q] 종합문제
-- 다음 요구사항에 맞는 테이블과 시퀀스를 생성하고 샘플 데이터를 추가한 뒤 다음을 조회하시오.
--------------------------------------------------------------------------------------------------------
--kpop_song 테이블 생성
DROP TABLE kpop_song;
CREATE TABLE kpop_song(
 kpop_song_no NUMBER PRIMARY KEY,
 kpop_song_title varchar2(300) NOT NULL,
 kpop_song_artist varchar2(300) NOT NULL,
 kpop_song_album varchar2(300) NOT NULL,
 kpop_song_playcount NUMBER DEFAULT 0 NOT NULL,
 kpop_song_likecount NUMBER DEFAULT 0 NOT NULL,
 CHECK(kpop_song_playcount >= 0),
 CHECK(kpop_song_likecount >= 0)
);

DROP SEQUENCE kpop_song_seq;
CREATE SEQUENCE kpop_song_seq;

--데이터 추가 구문 (PL/SQL 구문)
BEGIN
  FOR i IN 1..1000 LOOP
    INSERT INTO kpop_song (
      kpop_song_no,
      kpop_song_title,
      kpop_song_artist,
      kpop_song_album,
      kpop_song_playcount,
      kpop_song_likecount
    ) VALUES (
      kpop_song_seq.NEXTVAL,
      'Sample Title ' || i,
      'Sample Artist ' || i,
      'Sample Album ' || i,
      ROUND(DBMS_RANDOM.VALUE(10, 99999)), -- 재생 횟수 (10 이상 10만 미만)
      ROUND(DBMS_RANDOM.VALUE(10, 49999)) -- 좋아요 수 (10 이상 5만 미만)
    );
  END LOOP;
  COMMIT;
END;

SELECT * FROM kpop_song;

--[1] 좋아요를 가장 많이 받은 곡 Top100 출력
SELECT * FROM(
SELECT rownum rn, TMP.* from(
	SELECT * FROM kpop_song ORDER BY kpop_song_likecount DESC
	)TMP
)WHERE rn BETWEEN 1 AND 100;

--[2] 재생을 가장 많이 한 곡 Top100 출력
SELECT * FROM(
SELECT rownum rn, TMP.* from(
	SELECT * FROM kpop_song ORDER BY kpop_song_playcount DESC
	)TMP
)WHERE rn BETWEEN 1 AND 100;

--[3] 랭킹포인트를 계산하여 Top100 출력
--		랭킹포인트는 재생수*0.6 + 좋아요*0.4로 계산합니다.
SELECT * FROM(
SELECT rownum rn, TMP.* from(
	SELECT kpop_song.*,
	kpop_song_playcount * 0.6 + kpop_song_likecount * 0.4 랭킹포인트 
	FROM kpop_song 
	ORDER BY 랭킹포인트 DESC
	)TMP
)WHERE rn BETWEEN 1 AND 100;
