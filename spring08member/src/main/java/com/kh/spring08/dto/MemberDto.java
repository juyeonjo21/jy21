package com.kh.spring08.dto;

public class MemberDto {
	private String id;
	private String pw;
	private String nick;
	private String birth;
	private String email;
	private String contact;
	private String level;
	private int point;
	private String join;
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", pw=" + pw + ", nick=" + nick + ", birth=" + birth + ", email=" + email
				+ ", contact=" + contact + ", level=" + level + ", point=" + point + ", join=" + join + "]";
	}
	public MemberDto() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getJoin() {
		return join;
	}
	public void setJoin(String join) {
		this.join = join;
	}
}