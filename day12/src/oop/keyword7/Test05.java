package oop.keyword7;

import java.util.Random;

public class Test05 {
	//이런게 상수임. 어디서나 객체없이(static) 접근 가능하고 변하지 않는(final) 값을 만들어서 사용 
	//-이 변수들은 다른 클래스에서도 사용 가능함
	public static void main(String[] args) {
		//상수(constant)의 필요성 *상수 = 변하지 않는 값
		//ex) 가위바위보 출력
		
		
		Random r = new Random();
		
		int choice = r.nextInt(3);// + 0은 필요 없으니 지워도 됨.
		//System.out.println("choice = " + choice);
		
		switch(choice) { //switch case 엔 변수를 못 씀.
		case RSP.scissors:
			System.out.println("가위");
			break;
		case RSP.rock:
			System.out.println("바위");
			break;
		case RSP.paper:
			System.out.println("보");
			break;
		}
	}

}
