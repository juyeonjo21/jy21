package api.util.scanner;

import java.util.Scanner;

public class Test01_3 {

	public static void main(String[] args) {
		//Scanner 클래스
		// = 문자열 입력 및 분석 클래스
		// = 키보드 입력은 기능 중 일부분일 뿐
		// = 파일 뿐 아니라 홈페이지도 읽어올 수 있다(웹 크롤링)
		
		String sample = "떳다떳다 비행기\n날아라 날아라\n떳다떳다 비행기\n우리비행기";
//		System.out.println(sample);
		
		//[1] 단어 별로 읽기  .next()						띄어쓰기나 개행 등 공백이 기준
		//							.hasNext()				읽을 수 있는 단어가 있는지 판정
		//[2] 줄 별로 읽기    .nextLine()				개행 문자만 기준이 됨
		//							.hasNextLine()		읽을 수 있는 개행 문자(줄)가 있는지 판정
		
		//[Q] .next()와 .nextLine()을 섞어쓰면 어떻게 되는가?
		//[A] 섞어쓰면 문제가 발생한다. (* .next() 다음에 .nextLine()을 쓰면 발생됨)
		
		Scanner sc = new Scanner(sample);
		
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.nextLine());  //버리는 명령으로 사용 next다음에 의미없는 명령을 한 번 써서 다음껄 출력하게 한다
		System.out.println(sc.nextLine());


		
		
		sc.close();
	}

}
