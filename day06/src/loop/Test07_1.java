package loop;

import java.util.Scanner;

public class Test07_1 {
	public static void main(String[] args) throws InterruptedException {
		//[Q] 2분 30초 알람 타이머 문제 풀이
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분 : ");
		int minute = sc.nextInt();
		System.out.print("초 : ");
		int second = sc.nextInt();
		
		sc.close();
		
		//계산
		int time = minute * 60 + second;
		
		//출력
		for(int i = time;  i >= 0; i --) {
			int min = i / 60;
			int sec = i % 60;
			System.out.println(min + "분 " + sec + "초 남았습니다.");
		
		//1초 대기
		if(i > 0) {
		Thread.sleep(1000);
		}
	}
	
		System.out.println("알람 시작!");
		
	}

}
