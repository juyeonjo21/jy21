package data;

public class Test13 {
	public static void main(String[] args) {
		//Q) kh커피숍에서는 커피 5잔당 1잔씩 무료로 제공하는 이벤트를 하고 있습니다.
		//커피 1잔의 가격은 2500원입니다.
		//우리반 학생 27명과 강사까지 마실 커피를 주문했을 때 다음 항목을 계산하여 출력하시오.
		// -무료로 계산되는 커피 잔 수, 최종 결제 금액
		
		int coffeePrice = 2500;
		int count = 28;
		int freeCount = 5;
		
		int eventCount = count / freeCount;
		int totalPrice = (count - eventCount) * coffeePrice;
		
		System.out.println(eventCount);
		System.out.println(totalPrice);
		
		
		
		
	}

}
