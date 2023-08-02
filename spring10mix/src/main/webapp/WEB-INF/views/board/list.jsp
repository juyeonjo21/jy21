<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<h1>게시판 목록</h1>
	<h2>타인에 대한 비방은 경고 없이 삭제됩니다</h2>
	
	<table border="1" width="700">
	<thead>
	 <tr>
		<th>번호</th>
		<th width="50%">제목</th>
		<th>작성자</th>
		<th>조회수</th>
	 </tr>
	</thead>
	
	<tbody align="center">
	<c:forEach var="dto" items="${list}">
	 <tr>
		<td>${dto.no}</td>
		<td align="left">
		<a href="detail?no=${dto.no}">${dto.title}</a>
		</td>
		<td>${dto.writer}</td>
		<td>${dto.readcount}</td>
		
		</tr>
		</c:forEach>
		
	</tbody>
	</table>
	