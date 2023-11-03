package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.PocketmonDao;
import com.kh.spring22.dto.PocketmonDto;



@CrossOrigin
//@CrossOrigin(value = {"http://localhost:3000", "http://localhost:5500"})
@RequestMapping("/pocketmon")
@RestController
public class PocketmonRestController {
	//아래 다섯 개의 매핑을 이용하여 프론트엔드에 대응하는 Rest 기능을 구현
//	@GetMapping - 조회
//	@PostMapping - 등록
//	@PutMapping - 전체 수정
//	@PatchMapping - 일부 수정
//	@DeleteMapping -삭제
	
	@Autowired
	private PocketmonDao pocketmonDao;
	

	@GetMapping("/")
	public List<PocketmonDto> list() {
		return pocketmonDao.selectList() ;
	}
	
	@PostMapping("/")
//	public void  insert(@ModelAttribute PocketmonDto pocketmonDto) {//from-data 수신용
	//@RequestBody 직접 해석 -> 스프링으로 import해야함. swagger(x)
	public void insert(@RequestBody PocketmonDto pocketmonDto) {
		pocketmonDao.insert(pocketmonDto);
	}
	
	//파라미터는 주소가 매우 지저분해지므로 최대한 경로변수를 활용해야 한다
	@DeleteMapping("/{no}")
	//데이터를 반환하면 상태 설정이 불가능
//	public boolean delete(@PathVariable int no) { //주소에 데이터가 들어가는 방식 = 경로변수
	public ResponseEntity<String> delete(@PathVariable int no){//상태 설정이 가능한 객체를 반환
		boolean result = pocketmonDao.delete(no);
		if(result) {
//			return ResponseEntity.ok().build();
			return ResponseEntity.status(200).build();
		}
		else {
			return ResponseEntity.status(404).build();			
		}
	}
}
