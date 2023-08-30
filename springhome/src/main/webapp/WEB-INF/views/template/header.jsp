<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>My Homepage</title>

<!-- ������ ����� ���� Font Awesome 6 CDN -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    
     <!-- ���� ���� css ���� -->
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
              <li><a href="/member/mypage">������</a></li>
              <li><a href="/member/logout">�α׾ƿ�</a></li>
              <li><a href="/board/list">�Խ���</a></li>
        	
        	<%--�������� ��� �߰� �޴� ��� --%>    
   			 <c:if test="${sessionScope.level == '������'}">
				<li><a href="/admin/home">[�����ڸ޴�]</a></li>
			</c:if>  
			
            </c:when>
            <c:otherwise>
             <li><a href="/">Home</a></li>
             <li><a href="member/join">ȸ������</a></li>
             <li><a href="/member/login">�α���</a></li>
             <li><a href="/member/list">�Խ���</a></li>
            </c:otherwise>
            </c:choose>
            </ul>

        </nav>
        <section>

