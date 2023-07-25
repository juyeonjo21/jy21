package jdbc.app;

import java.util.List;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test20_1 {
	public static void main(String[] args) {
		//게시글 한 페이지당 10개씩 조회
		//데이터
		int page = 1;
		
		//DB처리
		BoardDao dao = new BoardDao();
		List<BoardDto> list = dao.selectListByPage(page);
		
//		System.out.println("조회 결과 수 : " + list.size()); 의미없음
		for(BoardDto dto : list) {
			System.out.print("[" + dto.getNo() +"]");
			System.out.println(dto.getTitle());
		}
			
	}

}
