package loop2;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		//월-금 공부시간 입력받기 1.총 공부한 시간 & 2. 일 평균 공부한 시간
		
		Scanner sc = new Scanner(System.in);
		
		int totalTime = 0;
		int total = 0;
		
		for(int i = 1; i <= 5; i++ ) {
			System.out.print("시간 : ");
			int hour = sc.nextInt();
			System.out.print("분 : ");
			int minute = sc.nextInt();
			
	
		total	= (i * hour) + (i * minute);
		System.out.println(total);
		}
			
		}
		
		
		
		
		/*System.out.println("총 공부한 시간은 " + hour + "시간" + "분" );
		System.out.println("일);
		System.out.println("" + average + " 입니다.");*/
	}



