package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08_1 {
	public static void main(String[] args) {
		//사다리게임 *풀이
		Scanner sc = new Scanner(System.in);
		
		//[1] 인원 설정
		int people = 3;
		
		//[2] 이름과 항목 입력
		List<String> names = new ArrayList<>();
		List<String> items = new ArrayList<>();
		
		names.add("A조");
		names.add("B조");
		names.add("C조");

		items.add("1등");
		items.add("2등");
		items.add("3등");
		
		Collections.shuffle(items);
		
		//[3] 출력
		System.out.println("<추첨 결과>");
		System.out.println(names.get(0) + "->" + items.get(0));
		System.out.println(names.get(1) + "->" + items.get(1));
		System.out.println(names.get(2) + "->" + items.get(2));

		

	}

}
