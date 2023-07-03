package oop.getter2;

public class Test01 {
	public static void main(String[] args) {
		School a = new School();
		School a1 = new School();
		School a2 = new School();

		a.setup("마리오", 1, 90, 80, 70);
		a1.setup("루이지", 1, 85, 85, 83);
		a2.setup("쿠파", 3, 70, 60, 55);

		
		a.show();
		a1.show();
		a2.show();
		
	}

}
