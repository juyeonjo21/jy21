package oop.method2;

public class OlympicMedalPlayer {
	
	String name;
	String event;
	String season;
	int gold;
	int silver;
	int bronze;
	
	void show() {
		System.out.println("< 메달리스트 정보 >");
		System.out.println("선수 이름 : " +this.name );
		System.out.println("종목 : " + this.event );
		System.out.println("구분 : " + this.season );
		System.out.println("금메달 수 : " + this.gold );
		System.out.println("은메달 수 : " + this.silver);
		System.out.println("동메달 수 : " + this.bronze);
	}
	//System.out.println("금 : " + this.gold + "은 : " + this.silver + "동 : " + this.bronze );
	//이렇게 써도 됨
	
	
	
	
	
	void setup(String name, String event, String season, int gold, int silver, int bronze) {
		this.name = name;
		this.event = event;
		this.season = season;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
		

	}
	

}
