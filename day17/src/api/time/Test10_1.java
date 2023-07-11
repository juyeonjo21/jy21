package api.time;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Test10_1 {

	public static void main(String[] args) {
		//사용자에게 시작시간과 종료시간을 각각 'HH:mm' 형식으로 입력받아 총 이용시간과 이용요금을 출력하세요.
		//이용요금은 한 시간당 1000원으로 계산하여 출력하세요.
		//LocalTime 클래스는 'Duration'이라는 클래스와 관련이 있습니다.
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("시작 시간 : ");
//		System.out.println("종료 시간 : ");
//		String input = sc.next(); 


		String begin = "14:30";
		String end = "19:15";
		
		
		LocalTime t1 = LocalTime.parse(begin);
		LocalTime t2 = LocalTime.parse(end);
		
		Duration duration = Duration.between(t1, t2);
		long time = duration.getSeconds(); //이용시간(초)
		System.out.println("time = " + time);
		
		time /= 60; //이용시간(분) -> 이렇게 한 번 나눠두면 시간 계산하기 편해짐.
		
		long hour = time / 60;
		long minute = time % 60;
		
		//요금계산
		int pricePerHour = 1000;
		float pricePerMinute = pricePerHour / 60f;
		float totalPrice = pricePerMinute * time;
		
		
		System.out.println("이용시간 : " + hour + "시간 " + minute + "분");
		System.out.println("이용요금 : " + totalPrice + "원");
//		System.out.println("이용요금 : " + (int)totalPrice + "원");
//		System.out.println("이용요금 : " + Math.floor(totalPrice) + "원");
//		System.out.println("이용요금 : " + Math.round(totalPrice) + "원");
//		System.out.println("이용요금 : " + Math.ceil(totalPrice) + "원");


		

	}

}
