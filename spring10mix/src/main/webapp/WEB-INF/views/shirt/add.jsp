<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>의류 관리 시스템</title>
</head>
<body>
		<h1>의류 관리 시스템</h1>
	<form action="add" method="post">
	상품이름 <input type="text" name="shirtName" required><br><br>
	상품색상 <select style="background:#cccccc" name="shirtColor" required>
			<option value="">컬러</option>
			<option style="background:#FFCCFF" >블랙</option>
			<option style="background:#FFCCFF" >화이트</option>
			<option style="background:#FFCCFF" >그레이</option>
			<option style="background:#FFCCFF" >레드</option>
			<option style="background:#FFCCFF">블루</option>
			</select><br><br>

	판매가 <input name="shirtPrice"><br><br>
	상품종류 <select style="background:#cccccc" name="shirtKind" required>
			<option value="">선택</option>
			<option style="background:#FFCCFF">라운드</option>
			<option style="background:#FFCCFF">브이넥</option>
			<option style="background:#FFCCFF">정장</option>
			</select><br><br>
	상품유형 <select style="background:#cccccc" name="shirtType" required>
			<option value="">선택</option>
			<option style="background:#FFCCFF">민소매</option>
			<option style="background:#FFCCFF">반팔</option>
			<option style="background:#FFCCFF">긴팔</option>
			</select><br><br>
	상품재질 <input name="shirtMaterial" required><br><br>
	판매수량 <input name="shirtStock" required><br><br>
	<button>상품등록</button>
	</form>

	<h2><a href="list">목록으로</a></h2>



</body>
</html>