package oop.inherit4;

public class TextFile extends File {
	private int pagesize;

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public void pagesize() {
		System.out.println("페이지 수");
	}
}

