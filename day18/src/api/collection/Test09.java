package api.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test09 {

	public static void main(String[] args) {
		//ArrayList 말고 다른 List의 종류
		// - ArrayList는 데이터가 배열 형태로 존재하는 리스트
		//		- 조회 성능이 우수함
		//		-구조 변경에 취약함
		// - LinkedList는 데이터가 연결 형태로 존재하는 리스트
		//		- 조회 성능이 다소 떨어짐 / 데이터가 수시로 바뀔 때 훨 유용함
		//		-데이터 구조 변경 성능이 우수함
		
		List<String> a = new ArrayList<>();  
		List<String> b = new LinkedList<>();	// -> 얘네 둘 다 list니까 업캐스팅해서 하나로 통일
		
		
		a.add("자바");		b.add("자바");
		a.add("파이썬");		b.add("파이썬");
		a.add("노드");		b.add("노드");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}

}
