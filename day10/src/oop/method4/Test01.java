package oop.method4;

public class Test01 {

	public static void main(String[] args) {
		
		CoffeeShopMenu a = new CoffeeShopMenu();
		CoffeeShopMenu b = new CoffeeShopMenu();
		CoffeeShopMenu c = new CoffeeShopMenu();
		CoffeeShopMenu d = new CoffeeShopMenu();
		
		//이벤트의 경우는 설정하지 않으면 안하 는 걸로 할 수 있겠는가?
		//= setup의 처리방식을 2가지로 분리할 수 있는가?
		a.setup("아메리카노", "음료", 2500, true);  //4개짜리
		b.setup("모카라떼","음료", 3500);
		c.setup("치즈케이크", "디저트", 5000, true);
		d.setup("마카롱",  "디저트", 3000);  //3개짜리
		// * 자바가 알아서 3개짜린지 4개짜린지 구분해서 맞게 출력함.
		
		
		a.show();
		b.show();
		c.show();
		d.show();
		

		

	}

}
