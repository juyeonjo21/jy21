package oop.keyword7;

import java.util.Random;

public class Test03 {
	//이런게 상수임. 어디서나 객체없이(static) 접근 가능하고 변하지 않는(final) 값을 만들어서 사용 
	//-이 변수들은 다른 클래스에서도 사용 가능함
	static final int scissors = 0; //가위 -> static을 붙이는 이유 : 아무데서나 사용할 수 있게 하려고
	static final int rock = 1; //바위
	static final int paper = 2; //보 -> 일회용 메소드에서만 사용하는 지역변수
	
	public static void main(String[] args) {
		//상수(constant)의 필요성 *상수 = 변하지 않는 값
		//ex) 가위바위보 출력
		
		
		Random r = new Random();
		
		int choice = r.nextInt(3);// + 0은 필요 없으니 지워도 됨.
		//System.out.println("choice = " + choice);
		
		switch(choice) { //switch case 엔 변수를 못 씀.
		case scissors:
			System.out.println("가위");
			break;
		case rock:
			System.out.println("바위");
			break;
		case paper:
			System.out.println("보");
			break;
		}
	}

}
