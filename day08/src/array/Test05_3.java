package array;

import java.util.Scanner;

public class Test05_3 {
	public static void main(String[] args) {
		//배열과 반복문
		//-배열에 크기가 정해지면 자동으로 length라는 버튼이 생긴다
		
		int[] data = new int[7]; //  ---> [?] 이 값을 바꿈으로 한 번에 처리 가능 *data.length
		//data ---> [0][0][0] (length(길이) = 3)
		System.out.println(data.length);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개 입력 ");
		for(int i = 0; i< data.length ; i++) { // < 숫자 대신 data.length 입력해서 다 같이 한 번에 바꾸기
		data[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < data.length; i++) {
		System.out.println(data[i]);
		}
	}

}
