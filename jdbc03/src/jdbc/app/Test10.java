package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test10 {
	public static void main(String[] args) {
		//비밀번호 변경 프로그램 문제
		Scanner sc = new Scanner(System.in);
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("새로운 Pw : ");
		String pw = sc.next();
		System.out.println("다시 새로운 Pw : ");
		String pwRe = sc.next();
		
		sc.close();
		
		if(pw.equals(pwRe)) {
			MemberDto dto = new MemberDto();
			dto.setId(id);
			dto.setPw(pw);
			
			MemberDao dao = new MemberDao();
			boolean result = dao.updateMemberInfo(dto);
			if(result) {
			System.out.println("비밀번호가 변경되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 ID 입니다.");
		}
	}
			else {
				System.out.println("비밀번호가 확인과 일치하지 않습니다.");
			}
		}
	}

