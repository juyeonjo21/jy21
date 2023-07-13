package api.collection3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test03 {
	public static void main(String[] args) {
		//투표 프로그램
		//요즘 유행하는 TV 경연 프로그램들처럼 사용자에게 투표할 이름을 입력받아 투표를 처리하는 프로그램을 만드세요
		Scanner sc = new Scanner(System.in);
		String name = "피카츄";
		int score = 1;
		
		
		Map<String,Integer> tv = new TreeMap<>();
		
		
		if(tv.containsKey(name)) {
			tv.put(name, score);
		}
	}

}
