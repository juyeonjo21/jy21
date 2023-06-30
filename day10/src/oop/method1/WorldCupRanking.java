package oop.method1;

//클래스
public class WorldCupRanking {
	
	//멤버 필드 (멤버 변수) = 데이터
	int ranking; //순위
	String player; //이름
	String country; //국가
	int score; //골 수
	
	//멤버 메소드 = 공통코드
	//void 이름(){ 코드 }
	//this = 클래스의 멤버를 의미(내꺼)
	//클래스에 만들어둔 데이터에서 this로 가져옴 
	
	//출력용
	void show() {
		System.out.println("< 선수 득점 정보 >");
		System.out.println("순위 : " + this.ranking);
		System.out.println("이름 : " + this.player);
		System.out.println("국가 : " + this.country);
		System.out.println("골 득점 수 : " + this.score);
} 
	
	//초기화용
	//-설정될 값을 알 수 없으므로 외부에서 전달 받아서 초기화.
	//-매개변수
	void setup(int ranking, String player, String country, int score ) {
		this.ranking = ranking;
		this.player = player;
		this.country = country;
		this.score = score;
	}
	
}