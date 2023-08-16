<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
	<h1>게시글 수정</h1>
	<form action="edit" method="post">
	<input type="hidden" name="no" value="${dto.no}">
	제목 <input type="text" name="title" value="${dto.title}" ><br><br>
	<!-- (참고) textarea에는 value가 없다 -->
	내용 <textarea name="content">${dto.content}</textarea><br><br>
	<button>수정하기</button>
	
	</form>
</body>
</html>
