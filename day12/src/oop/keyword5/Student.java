package oop.keyword5;

public class Student {
	//필드에 final 키워드를 붙이면 에러가 생긴다
	//- 생성과 동시에 초기값으로 잠겨버린다
	//- 반드시 생성자가 있어야 하며, final 항목에 값을 넣어줘야 한다
	//- final 필드는 setter 메소드 생성이 불가능하다
	private final String name; //초기값 null인 상태에서 final로 잠겨버려서 에러뜸
	private final int score; //초기값 0인 상태에서 final로 잠겨버림

	
	public Student(String name, int score) { //생성할 거면 값을 넣어야 함
		this.name = name;
		this.score = score;
		
	}
	
}
