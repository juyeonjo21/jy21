package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test23 {
	public static void main(String[] args) {
		//book정보 상세 조회
		int id = 1;
		
		BookDao dao = new BookDao();
		BookDto dto = dao.selectOne(id);
		
		if(dto == null) {
			System.out.println("찾으시는 책이 없습니다.");
		}
		else {
			System.out.println("<도서 정보>");
			System.out.println("도서명 : " + dto.getTitle());
			System.out.println("저자 : " + dto.getAuthor());
			System.out.println("출판사 : " + dto.getPublisher());
			System.out.println("도서 가격: " + dto.getPrice());
		}
	}

}
