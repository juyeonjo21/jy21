package api.lang.string;

public class Test01 {
	public static void main(String[] args) {
		//문자열(String)
		
		//생성
		String a = "hello"; //->기존방법(클래스의 문법 아님. 특혜임)
		
		char[] ch = new char[] {'h','e','l','l','o'};
		String b = new String(ch);
		
		String c = new String("hello");
		
		System.out.println(a.toString()); //toString() 아니여도 리모컨을 찍으면 내용이 나오게끔.
		System.out.println(a);   
		System.out.println(b);
		System.out.println(c);
		
		//기능 사용(메소드)
		System.out.println(a.length());
		System.out.println(b.length());
		
		//a와 b는 같은가?
		System.out.println(a == b); //동일한 객체인지 비교하는 것(동일비교) *비교연산 비추천
		System.out.println(a.equals(b)); //동등비교(내용이 같은지 비교, *추천)
	
	}
	
	

}
