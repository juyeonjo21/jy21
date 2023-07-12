package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08_2 {
	public static void main(String[] args) {
		//사다리게임 *풀이
		Scanner sc = new Scanner(System.in);
		
		//[1] 인원 설정
		System.out.println("인원 수를 설정하세요.");
		int people = sc.nextInt();
		
		
		//[2] 이름과 항목 입력
		List<String> names = new ArrayList<>();
		List<String> items = new ArrayList<>();
		
		
		for(int i = 0; i < people; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			names.add(name);
		}
		
		for(int i =0; i < people; i++) {
			System.out.println("항목 : ");
			String item = sc.nextLine();
			items.add(item);
		}	
		sc.close();
		
		Collections.shuffle(items);
		
		//[3] 출력
		System.out.println("<추첨 결과>");
		System.out.println(names.get(0) + "->" + items.get(0));
		System.out.println(names.get(1) + "->" + items.get(1));
		System.out.println(names.get(2) + "->" + items.get(2));

		

	}

}
