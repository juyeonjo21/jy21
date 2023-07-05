package oop.inherit4;

public class Mp4 extends MediaFile {
	private float speed;
	
	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public void speed() {
		System.out.println("재생 속도");
	}

}
