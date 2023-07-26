package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test24 {
	public static void main(String[] args) {
		//Board 정보 상세 조회
		
		int no = 2;
		
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.selectOne(no);
		
		if(dto == null) {
			System.out.println("게시글이 존재하지 않습니다");
		}
		else {
			System.out.print("[" + dto.getNo() + "] ");
			System.out.println("제목 :" + dto.getTitle());
			System.out.println("작성자 :" + dto.getWriter());
		}
	}

}
