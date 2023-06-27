package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//숫자 모래성 땅따먹기 문제
		//최초에 100이라는 값을 정해두고 사용자에게 한 자리 숫자(1~9)를 입력받아 차감함
		//차감하다 0 이하가 되면 반복을 종료하고 게임오버 메세지를 출력
		//몇 번만에 게임오버가 되었는지 측정하여 출력
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
	
		int number =100;
		int count = 0;
		
		while(true) {
			System.out.println("1~9 입력 : " );
			int input = sc.nextInt();
			    count ++;
	    
		    number -=  input; //차감처리
		    System.out.println("남은 숫자 : " + number );
	
		if(number <= 0 ) { //남은 숫자가 0 이하라면 반복을 중지(게임 오버)
			break;
		}
		}
		sc.close();
		System.out.println("게임 오버!");
		System.out.println("총 입력한 횟수는 " + count + " 번 입니다. " );
	}
}