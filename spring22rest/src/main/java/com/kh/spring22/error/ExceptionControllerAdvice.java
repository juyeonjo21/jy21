package com.kh.spring22.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice(basePackages = {"com.kh.spring22.restcontroller"})
//@RestControllerAdvice(annotations = {RestController.class})
public class ExceptionControllerAdvice {
	
	//[1] NoTargetException이 발생하면 사용자에게 404를 반환
	@ExceptionHandler(NoTargetException.class)
	public ResponseEntity<?> error404(Exception e){ //제너릭에 <?> == object 같은 의미로 쓰임
		log.error("404 발생", e);
		return ResponseEntity.notFound().build();
	}
	//[2] 그 외 예외가 발생하면 사용자에게 500을 반환
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> error500(Exception e){
		log.error("오류 발생",e);
		return ResponseEntity.internalServerError().body("server error");//헷갈리면 status(500)으로 에러 번호 써도 됨
	}

}
