package loop;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//사용자에게 숫자를 5번 입력받는 프로그램을 구현하세요.
		//*주의) 도구 생성은 한 번만 한다.(반복에 포함x)
	
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 5; i++ ) {	
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		}
		
		sc.close();
		

		
		/*System.out.println("숫자 입력 : ");
		int a = sc.nextInt();
		System.out.println("숫자 입력 : ");
		int b = sc.nextInt();
		System.out.println("숫자 입력 : ");
		int c = sc.nextInt();
		System.out.println("숫자 입력 : ");
		int d = sc.nextInt();
		System.out.println("숫자 입력 : ");
		int e = sc.nextInt();*/
		
		
		
	   }
	}

