package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//투표 프로그램
		//요즘 유행하는 TV 경연 프로그램들처럼 사용자에게 투표할 이름을 입력받아 투표를 처리하는 프로그램을 만드세요
		Map<String,Integer> vote = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
	

		while(true) {
			System.out.println("당신의 아이돌에게 투표하세요! ");
			String name = sc.nextLine();
			sc.close();
			
		name = name.replace(" ", "").toLowerCase();      //띄어쓰기 제거 / 영문 대소문자
		
		Integer count	= vote.get(name);
		if(count == null ) { //득표수가 null이라면(이름이 없다면)
			vote.put(name, 1);
		}
		else { //아니면
		vote.put(name, count +1); // 득표수 1 증가 처리
		}
		
			System.out.println(vote);
		}
	}
}

