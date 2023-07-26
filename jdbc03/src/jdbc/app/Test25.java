package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test25 {
	public static void main(String[] args) {
		//member 정보 상세 조회
		
		String id = "testuser";
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(id);
		
		if(dto == null) {
			System.out.println("회원 정보가 없습니다.");
		}
		else {
			System.out.println("<회원 정보>");
			System.out.println("ID : " + dto.getId());
			System.out.println("닉네임 : " + dto.getNickname());
			System.out.println("등급 : " + dto.getLevel());
			System.out.println("포인트 : " + dto.getPoint());
		}
	}

}
