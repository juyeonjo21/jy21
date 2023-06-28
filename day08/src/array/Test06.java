package array;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//[Q] 사용자에게 실수 5개를 입력받아서 출력하도록 프로그램 구현
		Scanner sc = new Scanner(System.in);
	
		float[] data = new float[5];
		System.out.println(data.length);
		
		System.out.println("실수 입력 ");
		
		for(int i = 0; i < data.length; i++ ) {
		data[i] = sc.nextFloat();
		}
		sc.close();
		
		for(int i = 0; i < data.length; i++ ) {
		System.out.println(data[i]);
		}
	}

}
