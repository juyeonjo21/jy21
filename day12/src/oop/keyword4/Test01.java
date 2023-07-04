package oop.keyword4;

public class Test01 {
	public static void main(String[] args) {
		
		int  square =  Robot.square(11);
		
		System.out.println("11의 제곱은 = " + square );
		
		float b = Robot.triangle(3, 7);
		System.out.println("삼각형 넓이 = " + b);
		
		float c = Robot.circle(5);
		System.out.println("원의 넓이 = " + c);
	}

}
