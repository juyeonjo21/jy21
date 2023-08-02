package com.kh.spring10.dto;

import lombok.Data;

@Data
public class BookDto {
	private int id;
	private String title;
	private String author;
	private String date;
	private double price;
	private String publisher;
	private int pageCount;
	private String genre;

}
