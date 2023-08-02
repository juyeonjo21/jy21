package com.kh.spring10.dto;

import lombok.Data;

@Data
public class BoardDto {
	private int no;
	private String title;
	private String content;
	private String writer;
	private int readcount;

}
