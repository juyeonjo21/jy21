<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 변경</title>

</head>
<body>

	<h1>상품 정보 수정</h1>

	<form action="edit" method="post">
			<input type="hidden" name="shirtNo" value="${dto.shirtNo}"><br><br>
	상품이름 <input type="text" name="shirtName" value="${dto.shirtName}"><br><br>
	상품색상 <select name="shirtColor" value="${dto.shirtColor}">
			<option>컬러</option>
			<option>블랙</option>
			<option>화이트</option>
			<option>그레이</option>
			<option>레드</option>
			<option>블루</option>
			</select><br><br>
	판매가 <input type="number" name="shirtPrice" value="${dto.shirtPrice}"><br><br>
	상품종류 <select name="shirtKind" value="${dto.shirtKind}">
			<option>선택</option>
			<option>라운드</option>
			<option>브이넥</option>
			<option>정장</option>
			</select><br><br>
	상품유형 <select name="shirtType" value="${dto.shirtType}">
			<option>선택</option>
			<option >민소매</option>
			<option>반팔</option>
			<option>긴팔</option>
			</select><br><br>
	상품재질 <input type="text" name="shirtMaterial" value="${dto.shirtMaterial}"><br><br>
	판매수량 <input type="number" name="shirtStock" value="${dto.shirtStock}"><br><br>
	<button>수정하기</button><br><br>
	</form>
	<button><a href="list">돌아가기</a></button>
</body>
</html>