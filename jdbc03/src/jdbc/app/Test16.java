package jdbc.app;

import jdbc.dao.ProductDao;

public class Test16 {
	public static void main(String[] args) {
		//Product 정보 삭제
		
		int no = 1;
	
		ProductDao dao = new ProductDao();
		boolean result = dao.delete(no);
		
		if(result) {
			System.out.println("상품 정보가 삭제되었습니다");
		}
		else {
			System.out.println("상품을 찾을 수 없습니다.");
		}
	}

}
