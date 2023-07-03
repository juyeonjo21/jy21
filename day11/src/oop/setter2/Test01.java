package oop.setter2;

public class Test01 {
	public static void main(String[] args) {
		Subject a1 = new Subject();
		Subject a2 = new Subject();
		Subject a3 = new Subject();

		
		a1.setup("자바 마스터 과정", 90, 1000000, "온라인");
		a2.setup("파이썬 기초", 60, 600000, "온라인");
		a3.setup("웹 개발자 단기완성", 120, 120000, "온라인");

	
		a1.show();
		a2.show();
		a3.show();
		
	}

}
