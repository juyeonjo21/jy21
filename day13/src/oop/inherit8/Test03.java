package oop.inherit8;

public class Test03 {
	public static void main(String[] args) {

		
		Player a = new Warrior("전사1");   //a(리모컨) = 레퍼런스
		//Magician a = new Magician("테스터1");
		//Archer a = new Archer("테스터1");
		
		Player b = new Warrior("전사2");
		//Magician b = new Magician("테스터2");
		//Archer b = new Archer("테스터2");

		Interaction.battle( a, b);
	}

}
