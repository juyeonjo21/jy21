package condition2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//BMI 계산기 개조
		
		Scanner sc = new Scanner(System.in);

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
		}

		
	}

}
