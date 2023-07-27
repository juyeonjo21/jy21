package com.kh.spring06.dto;

public class BoardDto {
	private int no;
	private String title;
	private String content;
	private String writer;
	private int readcount;
	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", readcount=" + readcount + "]";
	}
	public BoardDto() {
		super();
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	
	
}
