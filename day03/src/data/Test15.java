package data;

public class Test15 {
	public static void main(String[] args) {
		//kh여행사에서는 다음과 같이 프로모션을 진행 중입니다.
		//국내 어디든 한 사람당 1박 10만원
		//추가로 25% 할인까지 챙겨가세요.
		//(Q)성인 3명이 7일동안 여행갈 때의 예상 경비를 출력하세요.
		
		int price = 100000;
		int rate = 25;
		int people = 3;
		int travelDays = 7;
		
		int countPrice = price * people * travelDays ;
		int discount = countPrice * rate / 100;
		int totalPrice = countPrice - discount;
		
		System.out.println(totalPrice);
		
		//복잡하니까 비추천
		
	}

}
