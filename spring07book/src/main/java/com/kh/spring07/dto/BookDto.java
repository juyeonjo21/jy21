package com.kh.spring07.dto;

public class BookDto {
	private int id;
	private String title;
	private String author;
	private String date;
	private double price;
	private String publisher;
	private int pageCount;
	private String genre;
	@Override
	public String toString() {
		return "BookDto [id=" + id + ", title=" + title + ", author=" + author + ", date=" + date + ", price=" + price
				+ ", publisher=" + publisher + ", pageCount=" + pageCount + ", genre=" + genre + "]";
	}
	public BookDto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
