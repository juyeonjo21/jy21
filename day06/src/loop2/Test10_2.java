package loop2;

import java.util.Scanner;

public class Test10_2 {
	public static void main(String[] args) {
		//[Q] 공부시간 계산 문제 풀이

		Scanner sc = new Scanner(System.in);

		int total = 0;
		
		System.out.println("일 수 입력 : ");
		int day = sc.nextInt();
		
		for(int i = 0; i < 5; i++ ) { 
			System.out.print( "공부한 시간 / 분 : ");
			int hour = sc.nextInt();
			int minute = sc.nextInt();
		
			int time = hour * 60 + minute;
			total += time;	
		}	
		sc.close();
		
		    int hour = total / 60;
		    int minute = total % 60;
		    System.out.println("총 공부한 시간은 " + hour + " 시간 " + minute + "분 입니다. " );
		    
		    int average = total / 5; //월-금 5days
		    int averageHour = average / 60 ;  //총 평균 시간
		    int averageMin = average % 60 ;  //총 평균 분
	System.out.println("일 평균 공부 시간은 약 " + averageHour +
			                                                               " 시간 " + averageMin + " 분 입니다. " );
		
	
	  }
	}


		