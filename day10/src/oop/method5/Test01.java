package oop.method5;

public class Test01 {
	public static void main(String[] args) {
		
		OnlineShop a = new OnlineShop();
		OnlineShop b = new OnlineShop();
		OnlineShop c = new OnlineShop();
		OnlineShop d = new OnlineShop();
		OnlineShop e = new OnlineShop();

		
		a.setup("참이슬후레쉬", "주류", 1200, true, false);
		b.setup("클라우드맥주", "주류", 3000, false, true);
		c.setup("바나나킥", "과자", 1500, false, true);
		d.setup("허니버터칩", "과자", 2000, true, false);
		
		a.show();
		b.show();
		c.show();
		d.show();
		
	
	
	
	}
}
