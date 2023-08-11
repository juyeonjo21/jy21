<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>


<h2>게시글 작성</h2>

	<form action="write" method="post">
	<textarea cols="100" type="text" style='resize:none' name="boardTitle" placeholder="게시글 제목"></textarea><br><br>
	<textarea rows="40" cols="100" type="text" style='resize:none' name="boardContent" placeholder="게시글 내용" maxlength="4000"></textarea><br><br>
	<button>글 등록</button>
	</form>
	


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>