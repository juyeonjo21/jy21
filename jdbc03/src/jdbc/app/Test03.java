package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test03 {
	public static void main(String[] args) {
		//도서등록
		
		BookDto dto = new BookDto();
		dto.setTitle("테스트제목");
		dto.setAuthor("테스트작가");
		dto.setPublication("2023-07-24");
		dto.setPrice(22.11f);
		dto.setPublisher("테스트출판");
		dto.setPageCount(100);
		dto.setGenre("fantasy");
		
		BookDao dao = new BookDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}

}
