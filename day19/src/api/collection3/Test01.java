package api.collection3;

import java.util.Map;
import java.util.TreeMap;


public class Test01 {
	public static void main(String[] args) {
		//Map
		// = 세트 저장소 (Key-value 저장소)
		// = List, Set은 한 개의 데이터를 저장하는 반면에 Map은 두 개를 세트로 저장
		// = key는 이름, value는 값의 역할을 수행 (ex: Id = password)
		// = Set에 value가 붙어있는 형태로 봐도 무방
		
//		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new TreeMap<>();
		
		//추가 - add가 아니라 put이다 (데이터 개수가 달라서 이름이 다름)
		map.put("제니", 28);
		map.put("유재석", 50); //key가 정렬되어 나옴. (이름이니까 오름차순)
		map.put("유재석", 51); // key중복(기존 항목의 value가 수정됨)
		map.put("박명수", 52); 
		map.put("정준하", 52);//value는 중복이 가능하다
		
		//검색 - key / value용 contains가 따로 있다.
		System.out.println(map.containsKey("유재석")); //key에서 유재석을 찾아라
		System.out.println(map.containsValue(50)); // value에서 50을 찾아라
		
		//삭제 - remove
		map.remove("제니"); 
		
		//추출 - get(key) ---> value
		System.out.println(map.get("노홍철")); // null
		System.out.println(map.get("박명수")); //52
		
		
		//출력
		System.out.println(map);
		System.out.println(map.size());
	}

}
