package api.lang.test;

public class Test01 {
	public static void main(String[] args) {
		//StringBuffer 클래스를 문서만 보고 써보기
		
		//1.객체생성
	StringBuffer a = new StringBuffer(10);
	StringBuffer b = new StringBuffer("hello");
	
		//2.메소드
		a.append("kh정보교육원");
		System.out.println(a.toString()); //toString - 객체의 정보를 알 수 있는 요약본
		System.out.println(b.toString());
	
		System.out.println(a.capacity());
		System.out.println(b.capacity());
		
		System.out.println(a.length());
		System.out.println(b.length());
		
		b.reverse();
		System.out.println(b);
	
	}
}


