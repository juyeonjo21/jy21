package oop.moditier4;

import oop.moditier3.Student; //추가해줘야함. 패키지가 다르니까

public class Test01 {
	public static void main(String[] args) {
		//Student의 객체(인스턴스) 생성
		//-자바의 기본 접근 제한은 패키지 범위로 설정되어 있다.
		//-패키지에 없는 것은 모른다고 간주
		//-import를 통해 알려줘서 해결 가능
		//-단, import는 public일 때만 가능
		Student a = new Student();
		
		//a.name = "피카츄" -> 안됨
		a.setName("피카츄");
		a.setScore(100);
	}
	
}
