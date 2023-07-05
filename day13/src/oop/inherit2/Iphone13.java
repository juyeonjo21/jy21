package oop.inherit2;

//하위클래스(자식클래스) or 구현체
//= 실제 객체(제품)을 생성하기 위해 만드는클래스
//=extends라는 키워드로 클래스를 지정하여 내용을 가져올 수 있다
public class Iphone13 extends Iphone { //뒤에 extends + 상위클래스이름 붙이기
	//필드 - 3개(상속받은 것)
	//메소드 - 2개(상속받은 것) + 1개(고유기능)
	public void siri() {
		System.out.println("시리야");
	}

}
