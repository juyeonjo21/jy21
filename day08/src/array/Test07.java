package array;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		//[Q] 사용자에게 나라이름 5개를 입력받아서 출력하도록 프로그램 구현
		String[] names = new String[5];
		
		Scanner sc = new Scanner(System.in);
	
		
		for(int i = 0; i < names.length; i++) {
		System.out.println("나라 이름 입력 " );
		names[i] = sc.next(); 
		}
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		

	}

}
