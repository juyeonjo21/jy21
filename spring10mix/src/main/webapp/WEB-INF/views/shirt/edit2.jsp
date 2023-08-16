<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 변경</title>

</head>
<body>

	<h1>상품 정보 수정</h1>

	<form action="edit2" method="post">
			<input type="hidden" name="shirtNo" value="${dto.shirtNo}"><br><br>
	상품이름 <input type="text" name="shirtName" value="${dto.shirtName}"><br><br>
	상품색상 <select name="shirtColor" value="${dto.shirtColor}">
			<option value="">컬러</option>
			<%--
			EL의 특징
			- 외따옴표, 쌍따옴표 모두 문자열로 취급
			- 문자열도 비교연산이 가능
			 --%>
			<c:choose>
			<c:when test="${shirtDto.shirtColor =='블랙'}">
			<option selected>블랙</option>
			</c:when>
			</c:choose>
			<option>화이트</option>
			<option>그레이</option>
			<option>레드</option>
			<option>블루</option>
			</select><br><br>
	사이즈 <select name="shirtSize" value="${dto.shirtSize}">
			<option value="">선택</option>
			<option>XL</option>
			<option>L</option>
			<option>M</option>
			<option>S</option>
			<option>XS</option>
			</select><br><br>
	판매가 <input type="number" name="shirtPrice" value="${dto.shirtPrice}"><br><br>
	상품종류 <select name="shirtKind" value="${dto.shirtKind}">
			<option value="">선택</option>
			<c:choose>
			<c:when test="${shirtDto.shirtKind =='라운드'}">
			<option selected>라운드</option>
			<option>브이넥</option>
			<option>정장</option>
			</c:when>
			</c:choose>
			</select><br><br>
	상품유형 <select name="shirtType" value="${dto.shirtType}">
			<option>선택</option>
			<option >민소매</option>
			<option>반팔</option>
			<option>긴팔</option>
			</select><br><br>
	상품재질 <input type="text" name="shirtMaterial" value="${dto.shirtMaterial}"><br><br>
	판매수량 <input type="number" name="shirtStock" value="${dto.shirtStock}"><br><br>
	
	<!-- 체크박스를 만들 때 체크 처리해야됨(Pass) -->
		<hr>
		
		<input type="checkbox" name="size" value="S"> S
		<input type="checkbox" name="size" value="M"> M
		<input type="checkbox" name="size" value="L"> L
		<input type="checkbox" name="size" value="XL"> XL
		<input type="checkbox" name="size" value="2XL"> 2XL
		<input type="checkbox" name="size" value="3XL"> 3XL
		
		<hr>			
		
	<button>수정하기</button><br><br>
	</form>
	<button><a href="list">돌아가기</a></button>
	<h2><a href="detail2?shirtNo=${shirtDto.shirtNo}">상세보기</a></h2>
</body>
</html>