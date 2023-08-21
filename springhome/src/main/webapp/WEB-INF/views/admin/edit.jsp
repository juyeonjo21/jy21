<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>개인정보 변경</h2>
<form action="edit" method="post">
	
	닉네임<input type="text" name="memberNickname" 
		value="${findDto.memberNickname}" required><br><br>
	이메일<input type="email" name="memberEmail" 
		value="${findDto.memberEmail}"><br><br>
	전화번호<input type="tel" name="memberContact" 
		value="${findDto.memberContact}"><br><br>
	생년월일<input type="date" name="memberBirth" 
		value="${findDto.memberBirth}"><br><br>
	주소<input type="text" name="memberPost" size="6" maxlength="6" 
		placeholder="우편번호" value="${findDto.memberPost}"><br>
		<input type="text" name="memberAddr1" size="50"
		placeholder="기본주소" value="${findDto.memberAddr1}"><br>
		<input type="text" name="memberAddr2" size="50"
		placeholder="상세주소" value="${findDto.memberAddr2}"><br>
	
	<button>정보변경</button>
</form>




<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>