package api.lang.string2;

public class Member {
	
	protected String memberId;
	protected String memberPW;
	protected String memberName;
	protected String memberLevel;
	protected int memberPoint;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]){8,20}$";
		this.memberId = memberId;
	}
	public String getMemberPW() {
		return memberPW;
	}
	public void setMemberPW(String memberPW) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.[*!@#$%^&*_-]){8,15}$";
		this.memberPW = memberPW;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		String regex = "^[가-힣]{2,7}$";
		this.memberName = memberName;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		
		this.memberLevel = memberLevel;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	
	
	
	
}
