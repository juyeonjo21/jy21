package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test07 {
	public static void main(String[] args) {
		//[Q] 게시글 수정 프로그램
		// 항목 - 제목, 내용
		
		//데이터
		BoardDto dto = new BoardDto();
		dto.setNo(3);
		dto.setTitle("테스트수정제목");
		dto.setContent("테스트수정내용");
		
		//처리
		BoardDao dao = new BoardDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("수정 완료");
		}
		else {
			System.out.println("해당 글이 존재하지 않습니다.");
		}	
	}
}
