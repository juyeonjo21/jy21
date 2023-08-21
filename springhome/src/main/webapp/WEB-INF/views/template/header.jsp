<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ���� Ȩ������</title>
</head>
<body>
	<div align="center">
	<h1>Juyeon Home</h1>
	<hr>
	<%--
	JSP���� ���ǿ� ����� ���� Ȯ���Ϸ��� EL�� ���尴ä�� ���
	sessionScope ���尴ü�� ����ϸ� HttpSession�� ���� ��ȸ�� �� �ִ�
	 --%>
	 ����ID = ${pageContext.session.id},
	 name = ${sessionScope.name}
	 level = ${sessionScope.level}
	 <br>
	<%--
	�� �������� ������ ���̹Ƿ� ��� ������� �𸥴�
	���⼭ �ۼ��Ǵ� ��δ� ������ �����ο��� �Ѵ�
	 --%>
	 <%--���ǿ� ����� name�̶�� �̸��� ������ ȸ��/��ȸ������ ���� --%>
	 <c:choose>
	 <c:when test="${sessionScope.name != null}">
	<a href="/">Ȩ</a>
	<a href="/member/mypage">����������</a>
	<a href="/member/logout">�α׾ƿ�</a>
	<a href="/board/list">�Խ���</a>
	
	<%--�������� ��� �߰� �޴� ��� --%>
	<c:if test="${sessionScope.level == '������'}">
	<a href="/admin/home">[�����ڸ޴�]</a>
	</c:if>
	 </c:when>
	 <c:otherwise>
	<a href="/">Ȩ</a>
	<a href="/member/join">ȸ������</a>
	<a href="/member/login">�α���</a>
	 <a href="/board/list">�Խ���</a>
	 </c:otherwise>
	 </c:choose>

	<hr>