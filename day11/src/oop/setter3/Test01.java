package oop.setter3;

public class Test01 {
	public static void main(String[] args) {
		
		Mobile a1 = new Mobile();
		Mobile a2 = new Mobile();
		Mobile a3 = new Mobile();
		Mobile a4 = new Mobile();

		a1.setup("갤럭시23s" ,"SK", 1800000);
		a2.setup("갤럭시 23s", "KT", 1750000, 24);
		a3.setup("아이폰14", "LG", 2000000, 30);
		a4.setup("아이폰 14", "SK", 1990000);
		
		
		a1.show();
		a2.show();
		a3.show();
		a4.show();
		
	}

}
