package oop.inherit8;

public abstract class Player {
	private String ID;
	private int level;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level < 1) return;
		this.level = level;
	}
	//생성자 - 오직 id만 
	public Player(String ID) {
		this.setID(ID);
		this.setLevel(1);
	}
	public abstract void attack();
	
	public abstract void move();
	
	public abstract void store();

	
	public final void show() {
		System.out.println("<캐릭터 정보>");
		System.out.println("ID : " + this.ID);
		System.out.println("level : " + this.level);
	}
}