package oop.test3;

public class Test01 {
	public static void main(String[] args) {
		
		WorldCupRanking a = new WorldCupRanking();  //4개의 데이터
		WorldCupRanking b = new WorldCupRanking();
		WorldCupRanking c = new WorldCupRanking();
		WorldCupRanking d = new WorldCupRanking();

		a.ranking = 1;
		a.player = "킬리안 음바페";
		a.country = "프랑스";
		a.score = 8;
		
		b.ranking = 2;
		b.player = "리오넬 메시";
		b.country = "아르헨티나";
		b.score = 7;
		
		c.ranking = 3;
		c.player = "올리비에 지루";
		c.country = "프랑스";
		c.score = 4;
		
		d.ranking = 4;
		d.player = "훌리안 알바레스";
		d.country = "아르헨티나";
		d.score = 4;
		
		System.out.println("순위 : " + a.ranking);
		System.out.println("이름 : " + a.player);
		System.out.println("국가 : " + a.country);
		System.out.println("골 득점 수 : " + a.score);
		
		System.out.println("순위 : " + b.ranking);
		System.out.println("이름 : " + b.player);
		System.out.println("국가 : " + b.country);
		System.out.println("골 득점 수 : " + b.score);
		
		System.out.println("순위 : " + c.ranking);
		System.out.println("이름 : " + c.player);
		System.out.println("국가 : " + c.country);
		System.out.println("골 득점 수 : " + c.score);
		
		System.out.println("순위 : " + d.ranking);
		System.out.println("이름 : " + d.player);
		System.out.println("국가 : " + d.country);
		System.out.println("골 득점 수 : " + d.score);

	}

}
