package oop.keyword4;

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
}	

