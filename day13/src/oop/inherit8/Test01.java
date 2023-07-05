package oop.inherit8;

public class Test01 {
	public static void main(String[] args) {
		//플레이어는 생성 불가(추상클래스라서)
		//player p = new player
		
		Warrior p1 = new Warrior("배트맨");
		p1.attack();
		p1.move();
		p1.store();
		
		Magician p2 = new Magician("슈퍼맨");
		p2.attack();
		p2.move();
		p2.store();
		
		Archer p3 = new Archer("엑스맨");
		p3.attack();
		p3.move();
		p3.store();
		
		
		
	}
}
