<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 변경</title>
</head>
<body>

		<h1>비밀번호 변경</h1>
	<form action="http://localhost:8080/member/password" method="post"><br><br>
		아이디 <input type="text" name="id" required><br><br>
		기존 비밀번호 <input type="password" name="memberpw" required><br><br>
		신규 비밀번호 <input type="password" name="changepw" required><br><br>
		<button>변경하기</button>
		</form>
		
</body>
</html>