package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
	void insert(BoardDto boardDto);
	BoardDto selectOne(int boardNo);
	List<BoardDto> selectList();
	int sequence();
	boolean delete(int boardNo);
	boolean update(BoardDto boardDto);
	
	boolean updateReadcount(int boardNo);
	Integer selectMax(String boardWriter);
	List<BoardDto> selectList(String type, String keyword);
}
