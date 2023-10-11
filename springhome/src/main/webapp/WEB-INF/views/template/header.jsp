<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>My Homepage</title>

<!-- favicon ���� -->
<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/kh.jpg">

<!-- ������ ����� ���� Font Awesome 6 CDN -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    
     <!-- ���� ���� css ���� -->
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
	�����θ� �����ϱ� ���� ��ũ��Ʈ �ۼ�
	- �����ζ�� ������ �鿣�忡�� �ִ�
	- Ŭ���� �ڹٽ�ũ��Ʈ���� �����θ� �� �� �ִ� ����� ����
	- window�� ������ ���� ž����� ���
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
              <li><a href="${pageContext.request.contextPath}/board/list">�Խ���</a></li>
            
            <li>
              	<a href="${pageContext.request.contextPath}/pocketmon/list">���ϸ�</a>
              <ul>
              <li><a href="${pageContext.request.contextPath}/pocketmon/insert">+���</a></li>
              </ul>
            </li>
             
              <li><a href="${pageContext.request.contextPath}/member/mypage">������</a></li>
              <li><a href="${pageContext.request.contextPath}/member/logout">�α׾ƿ�</a></li>
        	
        	<%--�������� ��� �߰� �޴� ��� --%>    
   			 <c:if test="${sessionScope.level == '������'}">
				<li><a href="${pageContext.request.contextPath}/admin/home">[�����ڸ޴�]</a></li>
			</c:if>  
			
            </c:when>
            <c:otherwise>
             <li><a href="/">Home</a></li>
             <li><a href="member/join">ȸ������</a></li>
             <li><a href="${pageContext.request.contextPath}/member/login">�α���</a></li>
             <li><a href="${pageContext.request.contextPath}/member/list">�Խ���</a></li>
            </c:otherwise>
            </c:choose>
            </ul>

        </nav>
        <section>