package jdbc.app;

import java.util.List;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test20 {
	public static void main(String[] args) {
		//게시글 목록 전체 출력
		
		BoardDao dao = new BoardDao();
		List<BoardDto> list = dao.selectList();
		
		//System.out.println("조회 결과 수 : " + list.size());
		for(BoardDto dto : list) {
			System.out.print("[" + dto.getNo() +"]");
			System.out.println(dto.getTitle());
		}
			
	}

}
