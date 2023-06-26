package test;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		//[Q] 공부시간 계산 문제
		// 1. 사용자에게 월-금 공부한 시간 입력
		// 2. 총 공부한 시간 & 일 평균 공부한 시간 계산
		// 3. 입력 = 시간 & 분 따로 입력 / 출력도 시간 & 분 따로 출력하기

		Scanner sc = new Scanner(System.in);

		int totalH = 0;
		int totalM = 0;
		
		for(int i = 1; i <= 5; i++ ) {
			System.out.print( "시간 : ");
			int hour = sc.nextInt();
			System.out.print( "분 : ");
			int minute = sc.nextInt();
			totalH += hour ;   //시간 누적
			totalM += minute ;  //분단위 누적
		
		}	
		sc.close();
		
		    int total = totalH * 60 + totalM ; 
		    System.out.println(total);
		    int totalTime = total / 60 ;  //총 시간
		    int totalMin = total % 60 ;  //총 분
		    
		    int average = total / 5; //월-금 5days
		    int averageH = average / 60 ;  //총 평균 시간
		    int averageM = average % 60 ;  //총 평균 분
		    
		
		    
	System.out.println("총 공부 시간 : " + totalTime + " 시간 " + totalMin + " 분 " );
	System.out.println("일 평균 공부 시간 : " + averageH + " 시간 " + averageM + " 분 " );
	
	  }
	}

