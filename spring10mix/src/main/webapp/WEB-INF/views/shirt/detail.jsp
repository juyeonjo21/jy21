<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.shirtNo}번 상품정보</title>
</head>
<body>
	<c:choose>
	<c:when test="${dto!=null}">
	<h1>${dto.shirtNo}번 상품정보</h1>
	<h1>상품명 : ${dto.shirtName}</h1>
	<h1>색상 : ${dto.shirtColor}</h1>
	<h1>판매가 : ${dto.shirtPrice}원</h1>
	<h1>상품종류 : ${dto.shirtKind}</h1>
	<h1>상품유형 : ${dto.shirtType}</h1>
	<h1>재질 : ${dto.shirtMaterial}</h1>
	<h1>판매수량 : ${dto.shirtStock}ea</h1>
	
	</c:when>
	<c:otherwise>
	<h1>존재하지 않는 상품입니다.</h1>
	</c:otherwise>
	</c:choose>	
	<c:if test="${dto!=null}">
	<a href="edit?shirtNo=${dto.shirtNo}"><button>수정하기</button></a>
	<a href="delete?shirtNo=${dto.shirtNo}"><button>삭제하기</button></a>

	</c:if>
	<a href="list"><button>목록보기</button></a>
</body>
</html>