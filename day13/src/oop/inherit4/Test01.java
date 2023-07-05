package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		
		Mp4 a = new Mp4();
		a.setFilename("상속.mp4");
		a.setFilesize(100000L);
		a.setSpeed(1.2f);
		a.excute();
		a.forward();
		a.rewind();
		
		Mp3 b = new Mp3();
		b.setFilename("자바의 정석.mp3");
		b.setFilesize(10000L);
		b.setDuration(180);
		b.excute();
		b.forward();
		b.rewind();
		
		Hwp c = new Hwp();
		c.setFilename("시험필기.hwp");
		c.setFilesize(999L);
		c.setPagesize(20);
		c.excute();
		c.preview();
		
		Ppt d = new Ppt();
		d.setFilename("자바 프로젝트.ppt");
		d.setFilesize(30000L);
		d.setPagesize(35);
		d.excute();
		d.slideShow();
	}

}
