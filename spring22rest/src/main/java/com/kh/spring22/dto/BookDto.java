package com.kh.spring22.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "도서 정보 객체")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BookDto {
	
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublicationDate;
	private String bookPublisher;
	
	private float bookPrice;
	private int bookPageCount;
	private String bookGenre;
	
	@Schema(hidden = true)
	public boolean isEmpty() {
		 return bookId == 0 && bookTitle == null 
		            && bookAuthor == null && bookPublicationDate == null
		            && bookPrice == 0 && bookPublisher == null 
		            && bookPageCount == 0 && bookGenre == null;
	}

}
