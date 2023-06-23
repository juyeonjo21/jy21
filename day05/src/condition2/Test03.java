package condition2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//지하철 요금 계산 문제
		//영유아,노인 무료 (65이상,8세미만)
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		sc.close();
		
		
		
		//계산 - 이용 요금을 계산
		int price; //값이 바뀔 수 있으니 변수를 일단 넣어두기. (=요금)
		
		if(age >= 65 || age < 8 ) { //어르신 & 영유아
			price = 0;
		}
		else if(age >= 20) { //성인
			price = 1250;
		}
		else if(age >= 14) { //청소년
			price = 720;
		}
		else { //어린이
			price = 450;
		}
		
		int card = 500;
		int result = price + card;
		
		//출력
		System.out.println("기본 요금 : " + price + "원");
		System.out.println("카드 보증금 : " + card + "원");
		System.out.println("결제 요금 : " + result + "원" );
		
		
		/*if (age >= 65 || age < 8  ) { //어르신 또는 영유아
			System.out.println("요금은 무료 입니다.");
		}	
		else if(age >=20 ) { //성인
			System.out.println("요금은 1250원 입니다.");
		}
		else if(age >= 14 ) { //청소년
			System.out.println("요금은 720원 입니다.");
		}
		else (age >= 8) { //어린이
			System.out.println("요금은 450원 입니다.")
		}*/

	}
}	

