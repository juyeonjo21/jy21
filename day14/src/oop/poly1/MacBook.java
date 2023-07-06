package oop.poly1;

public class MacBook extends NoteBook{

	@Override
	public void power() {
		System.out.println("맥북 전원기능 테스트");
	}

	@Override
	public void video() {
		System.out.println("맥북 영상재생 기능 테스트");
	}

	@Override
	public void typing() {
		System.out.println("맥북 타이핑기능 테스트");
	}
}