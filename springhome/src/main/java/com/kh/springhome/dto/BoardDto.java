package com.kh.springhome.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo;
	private String boardWriter, boardTitle, boardContent;
	private int boardReadcount, boardLikecount, boardReplycount;
	private Date boardCtime, boardUtime;
	
	//작성자 출력용 메소드
	public String getBoardWriterString() {
		if(boardWriter == null) 
		return "(탈퇴한 사용자)";
		return boardWriter;
	}
	
	//날짜에 따라 다른 값을 반환하는 메소드
	public String getBoardCtimeString() {
		LocalDate current = LocalDate.now(); //현재날짜
		LocalDate ctime = boardCtime.toLocalDate();//작성일
		
		if(ctime.isEqual(current)) { //작성일이 오늘이라면
			//작성일을 시간으로 바꾸는 작업
			//날짜-시간으로 추출한 다음에 시간만 잘라냄
			Timestamp stamp = new Timestamp(boardCtime.getTime());
			LocalDateTime time = stamp.toLocalDateTime();
			LocalTime result = time.toLocalTime();
			
			return result.format(DateTimeFormatter.ofPattern("HH:mm"));
		}
		else {
			return ctime.toString();
		}
	}
}
