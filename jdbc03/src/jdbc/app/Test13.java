package jdbc.app;

import jdbc.dao.BoardDao;

public class Test13 {
	public static void main(String[] args) {
		//Board 삭제
		
		int no = 21;
		
		BoardDao dao = new BoardDao();
		boolean result = dao.delete(no);
		
		if(result) {
			System.out.println("책 정보 삭제 완료");
		}
		else {
			System.out.println("없는 정보입니다.");
		}
		
	}

}
