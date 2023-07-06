package oop.poly1;

public class GalaxyBook extends NoteBook {

	@Override
	public void power() {
		System.out.println("갤럭시북 전원기능 테스트");
	}

	@Override
	public void video() {
		System.out.println("갤럭시북 영상재생 기능 테스트");
	}

	@Override
	public void typing() {
		System.out.println("갤럭시북 타이핑기능 테스트");
	}

	
}
