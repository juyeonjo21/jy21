package oop.inherit8;

public class Magician extends Player {

	public Magician(String ID) {
		super(ID);
	}

	@Override
	public void attack() {
		System.out.println("마법사가 마법으로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("마법사가 뛰어서 이동합니다!");
	}

	@Override
	public void store() {
		System.out.println("마법사가 상점을 개설합니다!");
	}
}
