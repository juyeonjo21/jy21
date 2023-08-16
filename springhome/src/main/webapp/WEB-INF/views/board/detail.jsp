<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>${boardDto.boardWriter}님의 게시글</h1>
	<form action="detail" method="post">
	<table border="1">
	<tr>
 	<c:choose>
		<c:when test="${boardDto!=null}">
		<h2>NO : ${boardDto.boardNo}</h2>
		<h2>제목 : ${boardDto.boardTitle}</h2>
		<h2>내용 : ${boardDto.boardContent}</h2>
		<h2>작성자 : ${boardDto.boardWriter}</h2>
		<h2>조회수 : ${boardDto.boardReadcount}</h2>
		<h2>좋아요수 : ${boardDto.boardLikecount}</h2>
		<h2>댓글수 : ${boardDto.boardReplycount}</h2>
		<h2>마지막 수정시간 : <fmt:formatDate value="${boardDto.boardUtime}" 
			pattern="y년 M월 d일 E a h시 m분 s초"/> </h2>
		
		</c:when>
		<c:otherwise>
		</table>
		<h1>존재하지 않는 게시글입니다.</h1>
		</c:otherwise>
	</c:choose>
	<c:if test="${boardDto!=null}">
	<h3><a href="edit?boardNo=${boardDto.boardNo}">게시글 수정</a></h3>
	<h3><a href="delete?boardNo=${boardDto.boardNo}">게시글 삭제</a></h3>
	</c:if>
	<a href="list">글 목록 Go</a>
	
    </form>
	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>