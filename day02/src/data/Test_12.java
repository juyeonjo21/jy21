package data;

public class Test_12 {
	public static void main(String[] args) {
		//삼각김밥 1+1 문제 풀이
		
		//입력
		int price = 1400;
		int count = 5;
		
		//계산
		int free = count / 2;
		//System.out.println(free);
		int pay = count - free;
		//System.out.println(pay);
		
		int total = price * pay;
		
		//출력
		System.out.println(free);
		System.out.println(total);
		
	}

}
