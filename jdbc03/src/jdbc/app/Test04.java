package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04 {
	public static void main(String[] args) {
		
		MemberDto dto = new MemberDto();
		dto.setId("testerss2");
		dto.setPw("Tests0201!");
		dto.setNickname("테스트유저2");
		dto.setBirth("1995-05-01");
		dto.setEmail(null);
		dto.setContact("01012341234");
		
		MemberDao dao = new MemberDao();
		dao.insert(dto);
		
		System.out.println("회원가입 완료!");
	}
}
