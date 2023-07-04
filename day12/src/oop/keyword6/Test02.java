package oop.keyword6;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String ID = "test1234";
		System.out.print("비밀번호 : ");
		String PW = "test1234!";
		System.out.print("닉네임 : ");
		String nickname = "테스트";
		
		sc.close();
		
		
		Member a = new Member(ID, PW, nickname);
		
			a.show();
		}
	}

