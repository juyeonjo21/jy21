<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>

</head>
<body>
	<h1>게시글 수정</h1>
	
	<form action="edit" method="post">
	<input type="hidden" name="boardNo" value="${boardDto.boardNo}">
	
	제목 <textarea cols="100" type="text" style='resize:none'
	 type="text" name="boardTitle">${boardDto.boardTitle}</textarea><br><br>
	 
	내용 <textarea rows="10" cols="100" type="text" style='resize:none'
	 name="boardContent">${boardDto.boardContent}</textarea><br><br>
	<button>수정하기</button>
	
	</form>
</body>
</html>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>