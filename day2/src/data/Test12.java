package data;

public class Test12 {
	public static void main(String[] args) {
		//Q)편의점에서 삼각김밥을 '1+1' 행사로 판매하고 있습니다.
				//한개의 가격은 1400원 입니다. 5개를 샀을 때 다음 항목을 계산하여 출력하시오.
				// -무료 처리되는 갯수, 최종 구매 금액  *참고로 알바생은 절대 한 개 더 가져오라고 하지 않음.
				
		int count = 5;
		int price = 1400;
		int eventCount = count / 2;
	
		int freeCount = (count - eventCount) * price;
		
		System.out.println(eventCount);
		System.out.println(freeCount);
		
	}
}
