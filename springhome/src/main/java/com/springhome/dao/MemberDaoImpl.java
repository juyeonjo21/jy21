package com.springhome.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springhome.dto.MemberDto;
import com.springhome.mapper.MemberMapper;

@Repository
public class MemberDaoImpl implements MemberDao{
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		@Autowired
		private MemberMapper memberMapper;
		
		@Override
		public void insert(MemberDto memberDto) {
			String sql = "insert into memeber("
					+ "member_id, member_pw, member_nickname, member_email, memeber_contact,"
					+ "member_birth, member_post, member_addr1, member_addr2"
					+ ") "
					+ "values(?,?,?,?,?,?,?,?,?)";
			
			Object[] data = {
					memberDto.getMemberId(), memberDto.getMemberPw(), memberDto.getMemberNickname(),
					memberDto.getMemberEmail(), memberDto.getMemberContact(), memberDto.getMemberBirth(),
					memberDto.getMemberPost(), memberDto.getMemberAddr1(), memberDto.getMemberAddr2()
			};
			jdbcTemplate.update(sql, data);
		}

	}

