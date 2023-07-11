package api.time;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		//사용자에게 시작시간과 종료시간을 각각 'HH:mm' 형식으로 입력받아 총 이용시간과 이용요금을 출력하세요.
		//이용요금은 한 시간당 1000원으로 계산하여 출력하세요.
		//LocalTime 클래스는 'Duration'이라는 클래스와 관련이 있습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작 시간 : ");
		System.out.println("종료 시간 : ");
		String input = sc.next(); 

		LocalTime a = LocalTime.parse(input);
		System.out.println(a);
		
//		LocalTime start = LocalTime.of(20, 8);
//		LocalTime end = LocalTime.of(12, 20);
		
//		Duration duration = Duration.between(start, end);
//		System.out.println(duration.toString());
		
	//	Duration duration1 = Duration.ofHours(0) 
	
	}

}
