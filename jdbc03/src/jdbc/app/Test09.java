package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test09 {
	public static void main(String[] args) {
		//도서명, 저자, 출판사 수정 프로그램 문제

		//데이터
		BookDto dto = new BookDto();
		dto.setId(5);
		dto.setTitle("테스트제목");
		dto.setAuthor("테스트작가");
		dto.setPublisher("테스트출판사");
		
		//DB처리
		BookDao dao = new BookDao();
		boolean result = dao.updateBookInfo(dto);

		if(result) {
			System.out.println("도서 정보 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 도서 번호");
		}
	}
}
