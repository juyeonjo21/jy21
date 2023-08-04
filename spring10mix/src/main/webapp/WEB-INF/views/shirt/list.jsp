<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>상품List</title>
</head>
<body>
	<h1>상품List</h1>
	<a href="add"><button>상품등록</button></a><br><br>
	
	<table border="1" width="700">
	<thead>
	<tr>
	<th bgcolor="#ffeaa7">번호</th>
	<th>상품명</th>
	<th>상품색상</th>
	<th>판매가</th>
	<th>상품종류</th>
	<th>상품유형</th>
	<th>재질</th>
	<th>판매수량</th>
	<th bgcolor="#b2bec3">메뉴</th>
	</tr>
	</thead>
	
	<tbody align="center">
	<c:forEach var="dto" items="${list}">
	<tr>
	<td>${dto.shirtNo}</td>
	<td align="left">
		<a href="detail?shirtNo=${dto.shirtNo}">${dto.shirtName}</a>
		</td>
		<td>${dto.shirtColor}</td>
		<td>${dto.shirtPrice}원</td>
		<td>${dto.shirtKind}</td>
		<td>${dto.shirtType}</td>
		<td>${dto.shirtMaterial}</td>
		<td>${dto.shirtStock}ea</td>
		
		<td>
		<a href="edit?shirtNo=${dto.shirtNo}"><button>수정</button></a>
		<a href="delete?shirtNo=${dto.shirtNo}"><button>삭제</button></a>
		</td>
		</tr>
	</c:forEach>

	
	</tbody>
	</table>
</body>
</html>