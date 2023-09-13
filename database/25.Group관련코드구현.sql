--그룹(group by)
--그룹(group by) - 특정 항목을 기준으로 하여 무언가를 집계할 경우 사용
-- 집계 함수를 사용한다(count, sum, avg, min, max)
-- 그룹 조건을 추가할 수 있다(having)
SELECT member_level name, count(*) cnt
FROM MEMBER GROUP BY member_level;

--포켓몬스터 속성별 마리수 출력(많은 것부터)
SELECT TYPE name, count(*) cnt FROM
pocketmon GROUP BY TYPE
ORDER BY cnt desc;

-- 포켓몬스터 속성별 마리수 출력(150마리 이상인 그룹만)
SELECT --1(해석순서)
	TYPE name, count(*) cnt --3
FROM pocketmon GROUP BY TYPE HAVING count(*) >= 150 --2
ORDER BY cnt desc; --4


--여러가지 Group 코드
-- - 날짜는 편집을 통해서 원하는 그룹으로 만들어야 한다
SELECT EXTRACT(YEAR FROM member_join)name, count(*) FROM MEMBER 
GROUP BY EXTRACT(YEAR FROM member_join);

SELECT to_char(member_join, 'yyyy-mm-dd')name, count(*) FROM MEMBER 
GROUP BY to_char(member_join, 'yyyy-mm-dd');
