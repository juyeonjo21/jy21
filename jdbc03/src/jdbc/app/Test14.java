package jdbc.app;

import jdbc.dao.BookDao;

public class Test14 {
	public static void main(String[] args) {
		//Book 정보 삭제
		
		int id = 61;
		
		BookDao dao = new BookDao();
		boolean result = dao.delete(id);
		
		if(result) {
			System.out.println("책 정보가 삭제되었습니다.");
		}
		else {
			System.out.println("책 정보를 찾을 수 없습니다.");
		}
	}

}
