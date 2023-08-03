<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 수정</title>
</head>
<body>
	<h1>도서 정보 수정</h1>
	<form action="edit" method="post">
	<input type="hidden" name="id" value="${dto.id}">
	제목 <input type="text" name="title" value="${dto.title}" required><br><br>
	저자 <input type="text" name="author" value="${dto.author}" required><br><br>
	출간일 <input type="date" name="date" value="${dto.date}" required><br><br>
	판매가 <input type="number" step="0.01" name="price" value="${dto.price}" required><br><br>
	출판사 <input type="text" name="publisher" value="${dto.publisher}" required><br><br>
	페이지 <input type="number" name="pageCount" value="${dto.pageCount}" required><br><br>
	장르 <input type="text" name="genre" value="${dto.genre}" required><br><br>
	<button>수정</button>
	</form>
</body>
</html>