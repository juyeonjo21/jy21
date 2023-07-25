package jdbc.app;

import jdbc.dao.MemberDao;

public class Test15 {
	public static void main(String[] args) {
		//Member 정보 삭제
		
		String id = "Test0201!";
		
		MemberDao dao = new MemberDao();
		boolean result = dao.delete(id);
		
		if(result) {
			System.out.println("회원 정보가 삭제되었습니다.");
		}
		else {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}
	}

}
