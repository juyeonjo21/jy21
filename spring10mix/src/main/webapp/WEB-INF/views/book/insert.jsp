<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>
	<h1>도서 등록</h1>
	
	<form action="insert" method="post">
	제목 <input type="text" name="title" required><br><br>
	저자 <input type="text" name="author" required><br><br>
	출간일 <input type="date" name="date" required><br><br>
	판매가 <input type="number" step="0.01" name="price" required><br><br>
	출판사 <input type="text" name="publisher" required><br><br>
	페이지 수 <input type="number" name="pageCount" required><br><br>
	장르 <input type="text" name="genre" required><br><br>
	<button>등록하기</button>
	</form>
	
	<h2><a href="list">목록으로</a></h2>
	
</body>
</html>