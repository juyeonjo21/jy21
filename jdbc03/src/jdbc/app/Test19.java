package jdbc.app;

import java.util.List;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test19 {
	public static void main(String[] args) {
		// 도서목록 전체 조회
		
		BookDao dao = new BookDao();
		List<BookDto> list =  dao.selectList();
		
		System.out.println(" 조회 결과 수 : " + list.size());
		for(BookDto dto : list) {
			System.out.println(dto);
		}
	}

}
