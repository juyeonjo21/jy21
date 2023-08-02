<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보</title>
</head>
<body>


	<h1>도서 상세 정보</h1>
	
	<c:choose>
		<c:when test="${dto!=null}">
		
		<!-- 
		리스트 태그
		- 외부에<ul> 또는 <ol>을 사용
		- ul은 순서가 없는 리스트(unorder list)
		- ol은 순서가 있는 리스트(order list)
		- 내부 항목에 <li>를 사용(list item)
		 -->
	<ul>
		<li>번호 : ${dto.id}</li>
		<li>제목 : ${dto.title}</li>
		<li>저자 : ${dto.author}</li>
		<li>출간일 : ${dto.date}</li>
		<li>판매가 : ${dto.price}</li>
		<li>출판사 : ${dto.publisher}</li>
		<li>페이지 수 : ${dto.pageCount}</li>
		<li>장르 : ${dto.genre}</li>
	</ul>
		
 		</c:when>
		<c:otherwise>
		<h1>존재하지 않는 도서입니다.</h1>
		</c:otherwise>
	</c:choose>
	
</body>
</html>