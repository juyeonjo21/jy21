<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    
     <!-- 내가 만든 css 파일 -->
     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css">
     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/commons.css">
   
   <div class="row margin-top:30px">
    <h1>결제를 배웁시다</h1>
   </div>
    
    	<form action="login" method="post">
    <div class="container w-400" align="center">
	<div class="row mv-30">
	<hr>
		<h2>로그인</h2>
	</div>
    <c:choose>
    <c:when test="${sessionScope.name == null}">
    	<div class="row">
    		<input type="text" name="memberId" placeholder="아이디" class="form-input w-100"><br><br>
    		</div>
    		<div class="row">
    		<input type="password" name="memberPw" placeholder="비밀번호" class="form-input w-100"><br><br>
    		</div>
    		<div class="row mv-30"> 
    		<button type="submit" class="btn btn-positive w-100">로그인</button>
    		</div>
    </c:when>
    <c:otherwise>
    <h1>${sessionScope.name}으로 로그인 중...</h1>
    <a href="logout">로그아웃</a>
    </c:otherwise>
    </c:choose>
    </div>
    	</form>
    
    <hr>
    <div class="row mt-30" align="center">
<!--     <h2><a href="pay/test1">첫번째 예제</a></h2>
    <h2><a href="pay/test2">두번째 예제</a></h2> -->
    <h2><a href="pay/test3">구매하러 가기~^^</a></h2>
</div>