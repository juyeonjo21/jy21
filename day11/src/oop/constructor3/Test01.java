package oop.constructor3;

public class Test01 {
	public static void main(String[] args) {
		
		God a = new God("헤라클레스","전사", 50);
		God b = new God("포세이돈", " 마법사" , 20);
		God c = new God("아프로디테", " 마법사" );

		a.show();
		b.show();
		c.show();
		
	}

}
