package com.kh.spring17.vo;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberComplexSearchVO {
	private Integer memberId;
	private String memberPw;
	private String memberNickname;
	private String memberEmail;
	private String memberContact;
	private String memberBirth;
	private String memberPost;
	private String memberAddr1;
	private String memberAddr2;
	private List<String> memberLevelList;
	private int memberPoint;
	private Date memberJoin;
	private Date memberLogin;
	private Date memberChange;
	
	


}
