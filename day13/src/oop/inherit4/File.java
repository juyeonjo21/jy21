package oop.inherit4;

public class File {
	
	private String filename;
	private long filesize; //int의 범위 - 2GB 미만
	
	

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public long getFilesize() {
		return filesize;
	}

	public void setFilesize(long filesize) {
		if(filesize < 0L)return;
		this.filesize = filesize;
	}

	public void excute() {
		System.out.println("파일 실행");
	}
}
