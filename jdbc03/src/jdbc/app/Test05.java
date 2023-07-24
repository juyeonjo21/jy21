package jdbc.app;

import java.sql.Date;

import jdbc.dao.ProductDao;
import jdbc.dto.ProductDto;

public class Test05 {
	public static void main(String[] args) {
		
		ProductDto dto = new ProductDto();
		dto.setName("자두바");
		dto.setType("아이스크림");
		dto.setPrice(1100);
		dto.setMade(Date.valueOf("2022-07-01")); //문자열 -> Date로 변환
		dto.setExpire(Date.valueOf("2022-12-31"));
		
		ProductDao dao = new ProductDao();
		dao.insert(dto);
		System.out.println("상품 등록 완료");
	}

}
