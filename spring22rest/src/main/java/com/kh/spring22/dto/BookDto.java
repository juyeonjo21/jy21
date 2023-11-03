package com.kh.spring22.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BookDto {
	
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublicationDate;
	private float bookPrice;
	private String bookPublisher;
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
