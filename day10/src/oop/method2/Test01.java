package oop.method2;

public class Test01 {
	public static void main(String[] args) {
		
		OlympicMedalPlayer a1 = new OlympicMedalPlayer();
		OlympicMedalPlayer a2 = new OlympicMedalPlayer();
		OlympicMedalPlayer a3 = new OlympicMedalPlayer();
		
		a1.name = "진종오";
		a1.event = "사격";
		a1.season = "하계";
		a1.gold = 4;
		a1.silver = 2;
		
		a2.name = "김수녕";
		a2.event = "양궁";
		a2.season = "하계";
		a2.gold = 4;
		a2.silver = 1;
		a2.bronze = 1;
		
		a3.name = "전이경";
		a3.event = "쇼트트랙";
		a3.season = "동계";
		a3.gold = 4;
		a3.bronze = 1;
	
		System.out.println("선수 이름 : " +a1.name );
		System.out.println("종목 : " + a1.event );
		System.out.println("구분 : " + a1.season );
		System.out.println("금메달 수 : " + a1.gold );
		System.out.println("은메달 수 : " + a1.silver);
		
		
		System.out.println("선수 이름 : " +a2.name );
		System.out.println("종목 : " + a2.event );
		System.out.println("구분 : " + a2.season );
		System.out.println("금메달 수 : " + a2.gold );
		System.out.println("은메달 수 : " + a2.silver);
		System.out.println("동메달 수 : " + a2.bronze );
		
		
		System.out.println("선수 이름 : " +a3.name );
		System.out.println("종목 : " + a3.event );
		System.out.println("구분 : " + a3.season );
		System.out.println("금메달 수 : " + a3.gold );
		System.out.println("동메달 수 : " + a3.bronze );
		
	
		
		
	}

}
