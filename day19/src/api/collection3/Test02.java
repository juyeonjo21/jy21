package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//로그인 프로그램
	
		
		
//		Map<String,String> map = Map.of("admin", "admin1234", "teacher", "teacher1234", 
//																		"student", "student1234", "manager", "manager1234");


		Map<String,String> db = new HashMap<>();
		db.put("admin", "admin1234");
		db.put("teacher", "teacher1234");
		db.put("student", "student1234");
		db.put("manager", "manager1234");
		
		//아이디 비번 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userPw = sc.nextLine();
		sc.close();
		
		if(db.containsKey(userId)&& userPw.equals(db.get(userId))) {
			System.out.println("로그인성공");
		}
		else {
			System.out.println("로그인실패");
		}

	}
}





/*	while(true) {
		System.out.println("아이디 :");
		System.out.println("비번 : ");
		
		String input = sc.next();
		if(plus.containsKey(input) && plus.containsValue(input)) {
			map.get(input);
			System.out.println("로그인 성공!");
		}
			else {
				System.out.println("로그인 실패");*/