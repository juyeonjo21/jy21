package com.kh.spring03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterController {

	//목표 : 두 개의 값을 파라미터로 받아서 합계를 출력
	//- 값의 이름은 각각 left,right
	
	@RequestMapping("/plus")
	public String plus(int left, int right) {
		int total = left+right;
		return "합계 = " + total;
	}
}
