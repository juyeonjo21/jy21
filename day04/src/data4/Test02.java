package data4;

public class Test02 {
	public static void main(String[] args) {
		//문자열(String)
		//-문자가 모여있는 형태의 데이터
		//-참조형 데이터 (reference type)
		//-주문제작 방식으로 처리된다.(복잡한 데이터)  *원시형은 제한적임
		//-참조 변수(ex.리모컨)가 존재하며, 기능(버튼)이 제공된다.
		
		
		
		String a = "hello";
		System.out.println(a);
		
		//[1] 추가적으로 제공되는 기능이 존재한다.
		System.out.println(a.length());
		//[2] 기본적인 숫자 연산은 안되지만 더하기는 가능하다.
		System.out.println(a + "world");
		System.out.println("a = " + a );

		//[3] 특수한 기능을 담당하는 글자가 있다. *가장 많이 쓰이는 두가지 예시
		//ex) 나는 점심에 "피자"를 먹을거예요.
		String text = "나는 점심에 \"피자\"를 먹을거예요";   //따옴표까지 나오고 싶으면 저 부호를 글자 앞 뒤에 넣어줌
		System.out.println(text);
		// \n은 새로운 줄로 이동하도록 하는 글자이다.
		String text2 = "안녕\n하세요";   //\n 은 뉴라인의 뜻(엔터를 친 것)
		System.out.println(text2);
		
		//\t는 탭 이동을 하는 글자이다.
		String text3 = "김밥\t유료\t무료";
		//String text3 = "김밥	유료	무료";
		System.out.println(text3);
		
		
	}

}
