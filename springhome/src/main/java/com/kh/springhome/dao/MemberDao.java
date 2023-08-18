package com.kh.springhome.dao;

import com.kh.springhome.dto.MemberDto;

//메소드의 명세만 작성 (인터페이스) ->책으로치면 목차
public interface MemberDao {
	void insert(MemberDto memberDto);
	MemberDto selectOne(String memberId);
	boolean updateMemberLogin(String memberId);
	boolean updateMemberPw(String memberId,String changePw);
	boolean updateMemberInfo(MemberDto memberDto);
	boolean delete(String memberId);
	
	//포인트 추가
//	boolean updateMemberPoint(String memberId);//조회수의 경우엔 무조건 1씩 증가이므로 쓸 수 있지만
	//각기 다른 값이 추가될 가능성이 있는 경우 아래처럼 쓴다
	boolean increaseMemberPoint(String memberId, int point);
//	boolean decreaseMemberPoint(String memberId, int point);
	}