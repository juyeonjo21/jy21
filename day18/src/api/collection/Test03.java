package api.collection;

import java.util.ArrayList;
import java.util.Scanner;


public class Test03 {
	public static void main(String[] args) {
		//[Q] 기억력 테스트 게임
		//사용자에게 나라 이름을 입력받아 입력된 내용을 저장소에 저장하도록 구현
		//만약 똑같은 나라 이름을 두 번 입력받았다면 입력을 중지하고 게임오버 메세지와 여태까지 입력된 나라이름 개수를 화면에 출력
		
		//입력도구 생성
		Scanner sc = new Scanner(System.in);	
		//저장소 생성
		ArrayList<String> list = new ArrayList<>();	
	
		while(true) {
		System.out.print("나라 입력 : " );
		String input = sc.next();
		
		if(list.contains(input)) { //저장소에 이미 추가된 이름이라면
			break;
		}
		else {
			list.add(input);	
		}
	}	
		sc.close();
		
		System.out.println("게임오버!");
		System.out.println("총" + list.size() + " 개의 나라를 입력했습니다.");
	
		}
	}


