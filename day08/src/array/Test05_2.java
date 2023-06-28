package array;

import java.util.Scanner;

public class Test05_2 {
	public static void main(String[] args) {
		//배열과 반복문
		//- ex : 3개의 숫자를 입력받아서 출력, 합계 구하기		
		int[] data = new int[3];
		//data ---> [0][0][0]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개 입력 ");
		for(int i = 0; i< 3; i++) { //<=2 아니고 <3으로 숫자를 동일하게 만들기
		data[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < 3; i++) {
		System.out.println(data[i]);
		}
	}

}
