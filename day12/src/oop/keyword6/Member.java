package oop.keyword6;

public class Member {
	
	//필드
	private  final String ID;
	private String PW;
	private String nickname;
	
	//메소드
	public String getPW() {
		return PW;
	}
	public void setPW(String PW) {
		PW = PW;
	}
	public String getID() {
		return ID;
	}

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
//	public String getPasswordMasking() {
//		return this.PW.charAt(0) + this.PW.charAt(1)+"**********";
//	}
	public String getPasswordMasking() {
		String total =  " ";
		for(int i = 0; i < this.PW.length(); i++) {
			if(i <= 1) {
		total += this.PW.charAt(0);
			}
			else {
				total += "*";
			}
		}
		return total;
		
	}
	
	
	public void show() {
		System.out.println("<회원 정보>");
		System.out.println("ID : " + this.ID);
		System.out.println("PW : " + this.getPasswordMasking());
		System.out.println("닉네임 : " + this.nickname);
	}
	
	//생성자
	public Member(String ID, String PW, String nickname ) {
		this.ID = ID;
		this.PW = PW;
		this.nickname = nickname;
	}
	
	}



