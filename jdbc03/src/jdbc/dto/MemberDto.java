package jdbc.dto;

import java.sql.Date;

public class MemberDto {
	private String id;
	private String pw;
	private String nickname;
	private String birth;
	private String email;
	private String contact;
	private String level;
	private int point;
	private Date join;
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", pw=" + pw + ", nickname=" + nickname + ", birth=" + birth + ", email=" + email
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	public Date getJoin() {
		return join;
	}
	public void setJoin(Date join) {
		this.join = join;
	}
	

}
