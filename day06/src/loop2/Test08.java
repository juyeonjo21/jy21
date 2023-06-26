package loop2;

public class Test08 {
	public static void main(String[] args) {
		//30일동안 첫날은 1원만
		//둘쨋날부터는 두배만큼
		
		//[1] 일자별로 받는 돈
		//int total = 0;
		int money = 0;
		for(int day = 1; day <= 30; day++) {
			System.out.println(day+ "일차 금액 : " );
			money += 2;			
		}
		System.out.println(money);
		//[2] 총 금액
	
		
	}

}
