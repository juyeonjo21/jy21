package api.collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	public static void main(String[] args) {
		//좋아요 이력 관리 프로그램
		// = 비슷한 것들 : 팔로우,좋아요,추천,싫어요,즐겨찾기,구독,알람, ...
		// = 토글(toggle) : 두 가지 상태를 왔다갔다 하는 것. (ex : 스위치)
		
		Scanner sc = new Scanner(System.in);

		Set<Integer> like = new TreeSet<>();
		
		 while(true) {
			 System.out.print("글 번호 입력 : ");
			 int num = sc.nextInt();			 
			 
			 if(num <= 0 ) break;
			 

			if( like.contains(num)) {
				like.remove(num);
				System.out.println(num + "번 글에  좋아요를 취소했습니다.");//위에 remove 처리 후 출력해야함. 밑에 써야됨.

			}
			else{
				like.add(num); //좋아요처리
				System.out.println( num + "번 글에 좋아요를 눌렀습니다."); //위에 add 처리 후 출력해야함. 밑에 써야됨.
			}	
	 }
		 sc.close();
		 
		 System.out.println("현재까지 좋아요 누른 글 번호 : " + like);
	}
}


