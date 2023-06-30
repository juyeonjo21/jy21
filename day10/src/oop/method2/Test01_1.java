package oop.method2;

public class Test01_1 {

	public static void main(String[] args) {

		OlympicMedalPlayer a1 = new OlympicMedalPlayer();
		OlympicMedalPlayer a2 = new OlympicMedalPlayer();
		OlympicMedalPlayer a3 = new OlympicMedalPlayer();
		
		a1.setup("진종오", "사격", "하계", 4, 2, 0);
		a2.setup("김수녕", "양궁", "하계", 4, 1, 1);
		a3.setup("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		a1.show();
		a2.show();
		a3.show();
		

		
	}

}
