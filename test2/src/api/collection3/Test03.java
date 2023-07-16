package api.collection3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test03 {
	public static void main(String[] args) {
	//투표 프로그램
			//요즘 유행하는 TV 경연 프로그램들처럼 사용자에게 투표할 이름을 입력받아 투표를 처리하는 프로그램을 만드세요
			Scanner sc = new Scanner(System.in);

			Map<String,Integer> vote = new TreeMap<>();
		
			while(true) {
				System.out.print("이름  : ");
				String name = sc.next();
				if(name.equals("종료")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				if(vote.containsKey(name)) {
					int count = vote.get(name);
					vote.put(name,count+1);
					System.out.println("[" + name + "] 현재 " +(count+1)+ "표 획득!");
				}
				else {
					vote.put(name, 1);
					System.out.println(  name +  "현재"  + 1 + "표 획득");
				}
			}
			sc.close();
			System.out.println(vote);

			
}
}