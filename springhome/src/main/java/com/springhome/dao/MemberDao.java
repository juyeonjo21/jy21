package com.springhome.dao;

import com.springhome.dto.MemberDto;

//메소드의 명세만 작성 (인터페이스) ->책으로치면 목차
public interface MemberDao {
	void insert(MemberDto memberDto);
	MemberDto selectOne(String memberId);
	}
