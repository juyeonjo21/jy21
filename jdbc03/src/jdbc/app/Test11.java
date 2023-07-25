package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test11 {
	public static void main(String[] args) {
		//개인 정보 변경 프로그램 문제
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
//		String pw = sc.next();
//		String pwRe = sc.next();
		String nickName = sc.next();
		String birth = sc.next();
		String email = sc.next();
		String contact = sc.next();
		
		// 비밀번호 DB 검사 및 비밀번호 일치 검사 등을 추가할 수 있다
		
		MemberDto dto = new MemberDto();
		dto.setId(id);
		dto.setNickname(nickName);
		dto.setEmail(email);
		dto.setBirth(birth);
		dto.setContact(contact);
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberInfo(dto);
		
		if(result) {
			System.out.println("개인정보가 수정되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}

}
