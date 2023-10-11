<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>My Homepage</title>

<!-- favicon 설정 -->
<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/kh.jpg">

<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    
     <!-- 내가 만든 css 파일 -->
     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css">
     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/commons.css">
     <!-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/test.css"> -->
	<style>
	.title{
	color:white;
	}
	</style>
	
	<%--
	절대경로를 설정하기 위한 스크립트 작성
	- 절대경로라는 개념은 백엔드에만 있다
	- 클래식 자바스크립트에서 절대경로를 알 수 있는 방법이 없다
	- window에 절대경로 값을 탑재시켜 사용
	 --%>
	 <script>
	 window.contextPath = "${pageContext.request.contextPath}";
	 </script>
	 
	 
	 <!-- jquery cdn -->
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>
    <main>
        <header>
            <div class="logo">
                <img src="${pageContext.request.contextPath}/images/tweety12.gif" width="200px">
            </div>
            <div class="title">
                <h1>Juyeon's</h1>
            </div>
            <div class="etc"></div>
        </header>
        <nav>
            <ul class="menu center">
            <c:choose>
            <c:when test="${sessionScope.name != null}">
              <li><a href="/">Home</a></li>
              <li><a href="${pageContext.request.contextPath}/board/list">게시판</a></li>
            
            <li>
              	<a href="${pageContext.request.contextPath}/pocketmon/list">포켓몬</a>
              <ul>
              <li><a href="${pageContext.request.contextPath}/pocketmon/insert">+등록</a></li>
              </ul>
            </li>
             
              <li><a href="${pageContext.request.contextPath}/member/mypage">내정보</a></li>
              <li><a href="${pageContext.request.contextPath}/member/logout">로그아웃</a></li>
        	
        	<%--관리자인 경우 추가 메뉴 출력 --%>    
   			 <c:if test="${sessionScope.level == '관리자'}">
				<li><a href="${pageContext.request.contextPath}/admin/home">[관리자메뉴]</a></li>
			</c:if>  
			
            </c:when>
            <c:otherwise>
             <li><a href="/">Home</a></li>
             <li><a href="member/join">회원가입</a></li>
             <li><a href="${pageContext.request.contextPath}/member/login">로그인</a></li>
             <li><a href="${pageContext.request.contextPath}/member/list">게시판</a></li>
            </c:otherwise>
            </c:choose>
            </ul>

        </nav>
        <section>