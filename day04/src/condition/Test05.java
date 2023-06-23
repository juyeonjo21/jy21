package condition;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//과속단속 카메라 프로그램
		//KH전자에서 만든 과속단속 카메라는 다음 규칙에 따라서 벌금을 계산합니다
		//- 50km를 초과하는 속도로 달리는 자동차를 단속
		//- 기본 벌금은 30000원으로 설정
		//- 벌금은 제한속도보다 10km 이상 빨라질 때마다 10000원씩 증가
		//자동차 속도를 입력값으로 설정한 뒤 예상되는 벌금을 출력(과속이 아니면 벌금은 없습니다)
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("자동차의 현재 속도 : " );
		int speed = sc.nextInt();
	
		
		sc.close();


		int fine; 
		int overFine;
		int limitSpeed = 50; //규정속도 50km
		int plusFine = 10000; //초과 벌금



		if(speed > limitSpeed ) {
			fine = 30000;
			overFine= (speed - limitSpeed)/10  * plusFine ;  //나누기먼저임. 순서 잘못 씀.

			int total = fine + overFine;

			System.out.print("벌금은 총 " + total + "원 입니다. ");
			
		}
		

		else {
			fine = 0;
			overFine = 0;
			System.out.print("벌금 없음.");
		}
		
		System.out.print( "\n* " + "10km 초과당 추가 벌금은 " + "10000" + "원" + " * "  );
		
	}
	
}
