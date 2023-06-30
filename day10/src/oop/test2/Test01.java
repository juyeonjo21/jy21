package oop.test2;

public class Test01 {
	public static void main(String[] args) {
		//PockeMonster의 객체(인스턴스) 를 생성
		
		PocketMonster a = new PocketMonster();
		PocketMonster b = new PocketMonster();
		PocketMonster c = new PocketMonster();
		PocketMonster d = new PocketMonster();

		//초기화
		a.no = 1;
		a.name = "이상해씨";
		a.type = "풀";
		
		b.no = 4;
		b.name = "파이리";
		b.type = "불꽃";
		
		c.no = 7;
		c.name =  "꼬부기";
		c.type = "물";
		
		d.no = 25;
		d.name = "피카츄";
		d.type = "전기";
		
		System.out.println("번호 = " + a.no);
		System.out.println("이름 = " + a.name);
		System.out.println("속성 = " + a.type);
		
		System.out.println("번호 = " + b.no);
		System.out.println("이름 = " + b.name);
		System.out.println("속성 = " + b.type);

		System.out.println("번호 = " + b.no);
		System.out.println("이름 = " + b.name);
		System.out.println("속성 = " + b.type);

		System.out.println("번호 = " + c.no);
		System.out.println("이름 = " + c.name);
		System.out.println("속성 = " + c.type);

		System.out.println("번호 = " + d.no);
		System.out.println("이름 = " + d.name);
		System.out.println("속성 = " + d.type);


	}

}
