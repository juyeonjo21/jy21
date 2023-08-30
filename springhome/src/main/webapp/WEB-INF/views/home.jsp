<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	매번 페이지 코드를 복사할 수 없으니 미리 만든 것을 불러오도록 설정
		- 템플릿 페이지(template page)라고 부름
		- 절대경로를 사용할 것
 --%>
	<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
	
	<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    
     <!-- 내가 만든 css 파일 -->
     <link rel="stylesheet" type="text/css" href="/css/reset.css">
     <link rel="stylesheet" type="text/css" href="/css/layout.css">
     <link rel="stylesheet" type="text/css" href="/css/commons.css">
    <!-- <link rel="stylesheet" type="text/css" href="/css/test.css">  -->
	<style>

body {
    background-color: #8B4513;
}
</style>
	
	<div class="row">
	<h2>Now I am become Death, the destroyer of worlds.</h2>
	<h4>나는 이제 죽음이요, 세상의 파괴자가 되었도다.</h4>
	<img src="https://dummyimage.com/1000x400/000/fff">
	</div>
		
	<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>