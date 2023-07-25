package jdbc.app;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test06 {
	public static void main(String[] args) {
		// Pocketmon 정보 수정
		
		// 데이터 준비- DTO
		PocketmonDto dto = new PocketmonDto();
		dto.setNo(3); //조건
		dto.setName("이상해꽃"); //변경할 할목
		dto.setType("독"); //변경할 항목
		
		//DB처리
		PocketmonDao dao = new PocketmonDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("변경 완료!");
		}
		else {
			System.out.println("존재하지 않는 몬스터 번호");
		}
	}
}
