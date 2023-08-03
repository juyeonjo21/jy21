<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<h1>도서 목록</h1>
	<h2><a href="insert">신규등록</a></h2>
	
	
	<table border="1" width="700">
	<thead>
	 <tr>
		<th>번호</th>
		<th width="30%">도서명</th>
		<th>저자</th>
		<th>출간일</th>
		<th>출판사</th>
		<th>판매가</th>
		<th>페이지 수</th>
		<th>장르</th>
		<th>메뉴</th>
	 </tr>
	</thead>
	
	<tbody align="center">
	<c:forEach var="dto" items="${list}">
	 <tr>
		<td>${dto.id}</td>
		<td align="left">
		<a href="detail?id=${dto.id}">${dto.title}</a>
		</td>
		<td>${dto.author}</td>
		<td>${dto.date}</td>
		<td>${dto.publisher}</td>
		<td>${dto.price}</td>
		<td>${dto.pageCount}</td>
		<td>${dto.genre}</td>
			<td>
			<a href="delete?id=${dto.id}">삭제</a>
			</td>
			
		
		</tr>
		</c:forEach>
		
	</tbody>
	</table>
	