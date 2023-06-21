package data;

public class Test13_1 {
	public static void main(String[] args) {
		//커피 5+1 문제 풀이
		
		//입력
		int count = 28;
		int price = 2500;
		
		
		//계산
		int free = count / 6;     // (5+1)
		int pay = count - free;
		
		int total = price * pay;
		
		//출력
		System.out.println(free);
		System.out.println(total);
		
		
	}

}
