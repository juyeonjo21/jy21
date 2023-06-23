package condition2;

import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) {
		//인바디 측정기 문제 *풀이
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("신장(cm) 입력 : ");
		float height = sc.nextFloat();
		System.out.println("체중(kg) 입력 : ");
		float weight = sc.nextFloat();
		
		//계산
		float heightMeter = height / 100 ;
		//System.out.println("heightMeter = " + heightMeter  );
		
		//float bmi = weight / heightMeter / heightMeter ;
		float bmi = weight / (heightMeter * heightMeter);
		
		String status;
		
		if(bmi < 18.5f ) { //bmi가 18.5 미만이라면
			status = "저체중";			
		}
		else if(bmi <23f ) { //bmi가 18.5 이상 23 미만이라면
			status = "정상";
		}
		else if(bmi < 25f ) { //bmi 가 23이상 25미만이라면
			status = "과체중";
		}
		else if(bmi < 30f ) { //bmi가 25이상 30 미만이라면
			status = "경도비만";
		}
		else {
			status = "중등도비만";
		}
		
		System.out.println("bmi 수치는 " + bmi + " 입니다");
		System.out.println("건강 상태 : " + status);
		
		
		/*Scanner sc = new Scanner(System.in);

		System.out.print("신장(cm) : " );
		int cm = sc.nextInt();
		System.out.print("체중(kg) : " );
		int kg = sc.nextInt();
		
		sc.close();
		
		double m = (double) cm / 100;
		
		double bmi = kg / (m * m);
		System.out.println(bmi);
		
		
		
		if(bmi < 18.5) { //저체중
			System.out.print("저체중");
		}
		else if(bmi >= 18.5 && bmi < 23 ) {
			System.out.print("정상");
		}
		else if(bmi >=23 && bmi <25 ) {
			System.out.print("과체중");
		}
		else if(bmi >= 25 && bmi < 30) {
			System.out.print("경도비만");
		}
		else {
			System.out.print("중등도 비만");
		}*/

		
	}

}
