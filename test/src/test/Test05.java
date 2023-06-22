package test;

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
		int over;
		int plusFine = 10000;

		
		if(speed > 50 ) {
			fine = 30000;
			over = (speed / 10 - 5) *plusFine; // 10km초과당 +10000원
		}
		
		else {
			fine = 0;
			over = 0;			
		}
		
		int total = fine + over;
		
		
		System.out.print("벌금은 총 " + total + "원 입니다. ");
		System.out.println( "\n * " + "10km 초과당 추가 벌금은 " + "10000" + "원"+ " * "  );
		
	}

}
