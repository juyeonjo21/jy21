<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>My Homepage</title>

<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    
     <!-- 내가 만든 css 파일 -->
     <link rel="stylesheet" type="text/css" href="/css/reset.css">
     <link rel="stylesheet" type="text/css" href="/css/layout.css">
     <link rel="stylesheet" type="text/css" href="/css/commons.css">
     <!-- <link rel="stylesheet" type="text/css" href="/css/test.css"> -->
	<style></style>

</head>
<body>
    <main>
        <header>
            <div class="logo">
                <img src="https://dummyimage.com/200x50/000/fff">
            </div>
            <div class="title">
                <h1>Juyeon's Home</h1>
            </div>
            <div class="etc"></div>
        </header>
        <nav>
            <ul class="menu center">
            <c:choose>
            <c:when test="${sessionScope.name != null}">
              <li><a href="/">Home</a></li>
              <li><a href="/member/mypage">내정보</a></li>
              <li><a href="/member/logout">로그아웃</a></li>
              <li><a href="/board/list">게시판</a></li>
        	
        	<%--관리자인 경우 추가 메뉴 출력 --%>    
   			 <c:if test="${sessionScope.level == '관리자'}">
				<li><a href="/admin/home">[관리자메뉴]</a></li>
			</c:if>  
			
            </c:when>
            <c:otherwise>
             <li><a href="/">Home</a></li>
             <li><a href="member/join">회원가입</a></li>
             <li><a href="/member/login">로그인</a></li>
             <li><a href="/member/list">게시판</a></li>
            </c:otherwise>
            </c:choose>
            </ul>

        </nav>
        <section>

