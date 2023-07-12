package api.collection;

import java.util.ArrayList;

public class Test02 {
	public static void main(String[] args) {
		//List 저장소
		// = 순서가 있는 저장소 
		// = 선형구조 (시작지점과 끝지점이 있는 형태)
		// = ArrayList, LinkedList, Vector
		
		//경고뜨는 이유 - 자료형(GenericType)을 지정하지 않아서
		//ArrayList list = new ArrayList(); 
		
		//자료형을 지정하면서 생성
		//ArrayList<String> list = new ArrayList<String>(); //String 전용 저장소
		ArrayList<String> list = new ArrayList<>();  //약식표현 - 오른쪽만 가능. 왼쪽(리모컨)엔 반드시 자료형 있어야 함
		
		//데이터추가
		//list.add(100); //Generic Type과 일치하지 않는 데이터는 추가 불가 -위에 <String> 이였으니까
		list.add("유재석"); //0 (위치 번호)
		list.add("이효리"); //1
		list.add("김채원"); //2
		list.add("유태오"); //3
		list.add("지수"); //4
		
		//데이터를 다루는 여러가지 명령들
		//[1] 저장된 데이터 개수 확인
		System.out.println(list.size());  //배열과는 좀 다름. 실제로 저장된 데이터의 개수를 가져옴
		
		//[2] 특정 데이터 유무 확인
		System.out.println(list.contains("유재석")); //저장소에 (" ") 이 있습니까?
		System.out.println(list.contains("강호동"));
		
		//[3] 특정 데이터 위치 확인
		System.out.println(list.indexOf("유재석")); // 유재석의 위치는?
		System.out.println(list.indexOf("강호동"));

		//[4]데이터 삭제
		list.remove("지수"); //"지수" 데이터 삭제
		list.remove(0); //0번위치 삭제(유재석)
		
		//출력
		System.out.println("list = " + list);
	}

}
