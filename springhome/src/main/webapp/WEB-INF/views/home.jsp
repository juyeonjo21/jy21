<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	매번 페이지 코드를 복사할 수 없으니 미리 만든 것을 불러오도록 설정
		- 템플릿 페이지(template page)라고 부름
		- 절대경로를 사용할 것
 --%>
	<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
	
	<style>

body {
    background-color: #8B4513;
}
</style>
	
	<h2>Now I am become Death, the destroyer of worlds.</h2>
	<h4>나는 이제 죽음이요, 세상의 파괴자가 되었도다.</h4>
	<img src="https://image-cdn.hypb.st/https%3A%2F%2Fkr.hypebeast.com%2Ffiles%2F2023%2F06%2Fchristopher-nolans-oppenheimer-gets-a-green-light-in-the-us-01.jpg?cbr=1&q=90">
		
	<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>