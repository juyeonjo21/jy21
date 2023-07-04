package oop.modifier2_1;

public class Test01_1 {
	public static void main(String[] args) {
		Account a = new Account("유재석", 3, 1000000, 15, 15000000);
		//Account b = new Account("강호동", 2, 500000, 15, 2500000);
		//Account c = new Account("신동엽", 2, 800000, 15, 10000000);

		a.next();
		a.next();
		
		a.show();
		//b.show();
		//c.show();
		
	}

}
