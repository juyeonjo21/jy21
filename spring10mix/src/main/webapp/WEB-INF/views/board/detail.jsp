<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.no}번 게시글 정보</title>
</head>
<body>
	<c:choose>
		<c:when test="${dto!=null}">
		<h1>${dto.no}번 게시글 정보</h1>
		<h1>제목 : ${dto.title}</h1>
		<h1>내용 : ${dto.content}</h1>
		<h1>작성자 : ${dto.writer}</h1>
		<h1>조회수 : ${dto.readcount}</h1>
		</c:when>
		<c:otherwise>
		<h1>게시글이 존재하지 않습니다.</h1>
		</c:otherwise>
	</c:choose>
	<a href="list">목록보기</a>

</body>
</html>