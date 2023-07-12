package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		//사다리게임
		// 인원수 선택 / 이름 및 항목 입력 / 당첨 결과 출력
		//각각의 사람이 같은 항목이 선택되면 안됨.
		//인원 모두 결과가 나와야 함.
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수 선택 : ");
		int number = sc.nextInt();
	
		
		ArrayList <String> participants = new ArrayList<>(); //이름
		for(int i = 1; i <= 24; i++ ) {
			System.out.println("이름 입력 : ");
			String name = sc.nextLine();
			participants.add(name);
		}
		
		ArrayList <String> item = new ArrayList<>(); //항목
		for(int i = 1; i <= 24; i++ ) {
			System.out.println("항목 입력 : ");
			String list = sc.nextLine();
			item.add(list);
		}
		

	}

}
