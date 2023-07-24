package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test02 {
	public static void main(String[] args) {
		//게시글 작성 프로그램
		
		//데이터
//		String title = "하이루";
//		String content = "방가방가";
//		String writer = "user0201";
		BoardDto dto = new BoardDto();
		dto.setTitle("테스트 제목");
		dto.setContent("테스트 내용");
		dto.setWriter("tester0201");
		
		
		//처리
		BoardDao dao = new BoardDao();
		//dao.insert(title, content, writer);
		dao.insert(dto);
		
		//확인
		System.out.println("등록 완료!");
	}
}
