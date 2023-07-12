package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//끝말잇기 게임
		Scanner sc = new Scanner(System.in);		
		
		ArrayList<String> data = new ArrayList<>();
		
		data.add("자바");
	
		while(true) {
		String given = data.get(data.size()-1); //마지막 기록을 추출

		System.out.print(given);
		String input = sc.nextLine();
		
		
		
		if(input.matches("^[가-힣]{2,6}$") == false) {
			break;
		}
		else if(given.charAt(given.length()-1) != input.charAt(0)) {
			break;
		}
		else if(data.contains(input)) {
			break;
		}
		else {
			//System.out.println("통과");
			data.add(input);
		}
	}
		sc.close();

	System.out.println("게임 오버!");
	
	
	System.out.println("< 기록 >");
	for(int i = 0; i < data.size(); i++) {   // == for(String word : data)
		String word = data.get(i);
		System.out.println(" → " + word);
	}
 }
}
