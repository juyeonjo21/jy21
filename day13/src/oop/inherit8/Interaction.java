package oop.inherit8;

//두 개의 캐릭터로 서로간의 전투(상호작용)를 하도록 처리하는 클래스
// - ex : 거래 / 전투 / ...
public  class Interaction{
	
	//전투기능 - 메소드
	public static void battle( Player a, Player b ) {//  3  3  3    = 9개}
		a.attack();
		b.attack();
		
	}
}


