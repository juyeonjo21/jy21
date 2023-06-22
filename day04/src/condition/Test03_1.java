package condition;

public class Test03_1 {
	public static void main(String[] args) {
		
		//입력
		int birth = 1950;
		int year = 2023;
		
		int price = 7500;
		int count = 1;
		
		//계산
		int age = year - birth +1;
		//System.out.println("나이:" + age + "세");
		
		int total = price * count;
		//int discount = 0 또는 30% 금액;
		int discount;
		if(age >=65) {
			discount = total * 30 / 100;
		}
		else {
			discount = 0;
		}
		int result = total - discount;
		
		//출력
	System.out.println("나이 : " + age + "세" );
	System.out.println("금액: " + result + "원");
	
		

		
		
	}

}
