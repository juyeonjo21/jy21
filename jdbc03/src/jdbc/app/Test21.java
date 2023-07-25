package jdbc.app;

import java.util.List;

import jdbc.dao.MemberDao;
import jdbc.dto.BoardDto;
import jdbc.dto.MemberDto;

public class Test21 {
	public static void main(String[] args) {
		//회원 전체 목록 출력
		
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.selectList();
		
		System.out.println("총 회원 수 : " + list.size());
		for(MemberDto dto : list) {
			System.out.println(dto.getId());
			System.out.println( "(" + dto.getNickname() + ")");
	}
}
}