package api.lang.string2;


public class Member {
		private String memberId;
		private String memberPw;
		private String memberName;
		private String memberLevel;
		private int memberPoint;
		
		
		public String getMemberId() {
			return memberId;
		}
		
		public void setMemberId(String memberId) {
			String regex = "^[a-zA-Z0-9]{8,20}$";
			if(memberId.matches(regex)) {
				this.memberId = memberId;
			}
			else {
				System.out.println("회원 아이디는 8~20글자의 알파벳과 숫자로만 구성되어야 합니다.");
			}
		}
		
		public String getMemberPw() {
			return memberPw;
		}
		
		public void setMemberPw(String memberPw) {
			String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,15}$";
			if(memberPw.matches(regex)) {
				this.memberPw = memberPw;
			}
			else {
				System.out.println("비밀번호는 8~15자의 알파벳, 숫자, 특수문자가 모두 포함되어야 합니다.");
			}
		}
		
		public String getMemberName() {
			return memberName;
		}
		
		public void setMemberName(String memberName) {
			String regex = "^[가-힣]{2,7}$";
			if(memberName.matches(regex)) {
			this.memberName = memberName;
			}
			else {
				System.out.println("이름은 2~7글자의 한글로만 입력해주세요.");
			}
		}
		
		public String getMemberLevel() {
			return memberLevel;
		}
		
		public void setMemberLevel(String memberLevel) { //기본값-일반회원
			if(memberLevel.equals("관리자")|| memberLevel.equals("우수회원")	
					|| memberLevel.equals("일반회원")) {
				this.memberLevel = memberLevel;
		}
	}
		
		public int getMemberPoint() {
			return memberPoint;
		}
		
		public void setMemberPoint(int memberPoint) {
			if(memberPoint < 0 ) return;
			this.memberPoint = memberPoint;		
		}

		public String getMaskingPw() {
			String star = "*";
			return memberPw.charAt(0)+ star.repeat(memberPw.length() - 1);
		}	

		public Member(String memberId, String memberPw, String memberName,	
										String memberLevel, int memberPoint ) {
			this.setMemberId(memberId);
			this.setMemberPw(memberPw);
			this.setMemberName(memberName);
			this.setMemberLevel("일반회원");
			this.setMemberPoint(100);
		}

		
		public void show() {
			System.out.println();
			System.out.println("<회원 정보>");
			System.out.println("회원 ID : " + this.getMemberId());
			System.out.println("비밀번호 : " + this.getMaskingPw());
			System.out.println("회원 이름 : " + this.getMemberName());
			System.out.println("회원 등급 : " + this.getMemberLevel());
			System.out.println("회원 포인트 : " + this.getMemberPoint());
		}
		
	}