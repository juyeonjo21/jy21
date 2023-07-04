package oop.keyword1;

public class Test01 {
	public static void main(String[] args) {
		//10 + 20 을 객체지향으로 처리해보자
		Calculator a = new Calculator(10,20);
		int result = a.getTotal();
		System.out.println("result  = " + result);
				
	}
}
