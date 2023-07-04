package oop.keyword7;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		//상수(constant)의 필요성 *상수 = 변하지 않는 값
		//ex) 가위바위보 출력
		
		final int scissors = 0; //가위
		final int rock = 1; //바위
		final int paper = 2; //보 -> 일회용 메소드에서만 사용하는 지역변수
		
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
