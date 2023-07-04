package oop.keyword4;

import java.util.Random;

public class Robot {
	
	//[1] 제곱 계산 기능
	public static int square(int a ) {
		return  a * a; //세제곱 이상은 반복문 필요
	}

	public static double square(double a) {
		return a * a; //오버로딩가능
	}
		
	//[2] 삼각형 넓이 구하는 메소드
	public static float triangle(int width, int height) {
		return (float)width * height / 2 ; //=2f
	}	
	
	public static double triangle(double width, double height) {
		return width * height / 2; //오버로딩가능
	}
	

	//[3] 원의 넓이를 구하는 메소드(반지름*반지름*원주율)
	//-원주율은 변하지않는 수이기에 변수 안에 넣지 않음.
	public static float circle(int radius) {
		//return radius * radius * 3.14f; 가능
		//return Robot.square(radius)* 3.14f; 가능
		return square(radius)* 3.14f;
		
	}
	public static double circle(double radius) {
		return square(radius)* 3.14; //오버로딩 가능
	}
	
	//[4] 배열을 선택 정렬하는 메소드
	public static void sort(int[] data) {
		//선택정렬
		for(int k = 0; k < data.length -1; k++) {
	     	int minIndex = k;//k번 위치의 값이 가장 작다고 생각
		for(int i = k+1; i < data.length; i ++ ) {//뒤에 있는 데이터와 비교하여
			if(data[minIndex] > data[i]) { // 더 작은 값이 있다면
				minIndex = i; //교체!
		}
	}
		//	System.out.println("minIndex = " + minIndex );
			
			int backup = data[minIndex];
			data[minIndex] = data[k];
			data[k] = backup;
		}
	}
		
	//[5] 배열을 뒤집는 메소드(reverse)
	public static void reverse(int[] data) {
		int left = 0; //왼쪽 위치
		int right = data.length - 1; 			  //오른쪽 위치 *규칙 잘 기억.

		for(int  i = 0; i < data.length/ 2 ; i++ ) {			
			int backup = data[left];
			data[left] = data[right];
			data[right] = backup;
			
			left++;
			right--;
		}

	}	
	
	//[6] 배열을 무작위로 섞는 메소드(shuffle)
	public static void shuffle(int[] data) {
		Random r = new Random();
		for(int i = 0; i < data.length; i++ ) {
			//[i] <---->[0~4]
			int index = r.nextInt(data.length);
			
			if(i ==  index ) { //같은 자리가 나왔다면
				i--; //무효화시킨다
				continue;
			}
			
			
			int backup = data[i];  //data [  ] 이 자리만 채우면 위치를 계속 바꿀 수 있음
			data[i] = data[index];
			data[index] = backup;
			
		}	
}
	//[7] 배열을 출력하는 메소드
	public static void print (int[] data) {
		for(int i = 0; i < data.length; i ++ ) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}

}	

