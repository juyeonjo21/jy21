<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>개인정보 변경</h2>
<form action="change" method="post">
	
	닉네임<input type="text" name="memberNickname" 
		value="${memberDto.memberNickname}" required><br><br>
	이메일<input type="email" name="memberEmail" 
		value="${memberDto.memberEmail}"><br><br>
	전화번호<input type="tel" name="memberContact" 
		value="${memberDto.memberContact}"><br><br>
	생년월일<input type="date" name="memberBirth" 
		value="${memberDto.memberBirth}"><br><br>
	주소<input type="text" name="memberPost" size="6" maxlength="6" 
		placeholder="우편번호" value="${memberDto.memberPost}"><br>
		<input type="text" name="memberAddr1" size="50"
		placeholder="기본주소" value="${memberDto.memberAddr1}"><br>
		<input type="text" name="memberAddr2" size="50"
		placeholder="상세주소" value="${memberDto.memberAddr2}"><br> 
		
	비밀번호 <input type="password" name="memberPw" required><br><br>
	
	<button>정보변경</button>
</form>

<c:if test="${param.error != null}">
	<h3 style="color:red">틀린 비밀번호</h3>
	<h3>개인 정보를 조회할 수 없습니다</h3>
	</c:if>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>