package com.kh.spring21.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring21.dto.PaymentDetailDto;
import com.kh.spring21.dto.PaymentDto;
import com.kh.spring21.vo.PaymentListVO;

@Repository
public class PaymentDaoImpl implements PaymentDao{

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public int sequence() {
		return sqlSession.selectOne("payment.sequence");
	}

	@Override
	public void insert(PaymentDto paymentDto) {
		sqlSession.insert("payment.save", paymentDto);
	}

	@Override
	public void insertDetail(PaymentDetailDto paymentDetailDto) {
		sqlSession.insert("payment.saveDetail", paymentDetailDto);
	}

	@Override
	public List<PaymentDto> selectList() {
		return sqlSession.selectList("payment.list");
	}

	@Override
	public List<PaymentListVO> selectTotalList() {
		return sqlSession.selectList("payment.listAll");
	}

}