package oop.multi1;

//핵심상속(클래스상속)은 extends 키워드로 구현 (1개만 할 때)
//부가상속(인터페이스상속)은 implements 키워드로 구현 (여러 개 할 때 +콤마 붙이고 쓰면 됨)
public class Person  implements Singer, Programmer{

	@Override
	public void coding() {   //-> 프로그래머 인터페이스에서 가져옴
		
	}

	@Override
	public void sing() { // -> 싱어 인터페이스에서 가져옴
		
	}

}
