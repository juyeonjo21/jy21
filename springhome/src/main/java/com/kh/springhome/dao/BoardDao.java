package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;

public interface BoardDao {
	void insert(BoardDto boardDto);
	BoardDto selectOne(int boardNo);
	int sequence();
	boolean delete(int boardNo);
	boolean update(BoardDto boardDto);
	
	boolean updateReadcount(int boardNo);
	Integer selectMax(String boardWriter);
	
	//목록 처리 
	List<BoardListDto> selectList();
	List<BoardListDto> selectList(String type, String keyword);
	
	//페이징
	List<BoardListDto> selectListByPage(int page);
	List<BoardListDto> selectListByPage(String type, String keyword, int page);
	
	//갯수 구하는 명령
	int countList();
	int countList(String type, String keyword);
}
