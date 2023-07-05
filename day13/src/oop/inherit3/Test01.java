package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		//Browser는 생성하면 안된다. (상속의 이미가 사라짐)
		Chrome a = new Chrome();
		a.setURL("https://www.google.com");
		a.refresh();
		a.move();
		a.develop();
		a.chromeStore();
		
		Edge b = new Edge();
		b.setURL("https://www.google.com");
		b.refresh();
		b.move();
		b.fullScreen();
		
		Whale c = new Whale();
		c.setURL("https://www.google.com");
		c.refresh();
		c.move();
		c.papago();
		c.naverSearch();
		
		
	
	}

}
