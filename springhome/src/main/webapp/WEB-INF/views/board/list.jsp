<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page= "/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>게시글 목록</h1>
<h2>타인에 대한 비방은 경고 없이 삭제됩니다</h2>

<h2><a href="write">글쓰기</a></h2>

<h2><a href="/">홈으로</a></h2>
<table border= "1"  width= "900">
    <thead>
        <tr>
            <th>게시글 번호</th>
            <th>작성자</th>
            <th width="40%">게시글 제목</th>
            <th>조회수</th>
            <th>좋아요</th>
            <th>댓글수</th>
            <th>작성일</th>
            <th>이동</th>
        </tr>
    </thead>
    <tbody align="center">
    <c:forEach var= "boardDto" items= "${list}">
        <tr>
            <td>${boardDto.boardNo}</td>
            <td>${boardDto.boardWriter}</td>
            <td align="left">
            <a href="detail?boardNo=${boardDto.boardNo}">${boardDto.boardTitle}</a>
            </td>
            <td>${boardDto.boardReadcount}</td>
            <td>${boardDto.boardLikecount}</td>
            <td>${boardDto.boardReplycount}</td>
            <td>${boardDto.boardCtime}</td>
            <td>
            <a href="detail?boardNo=${boardDto.boardNo}">글보기</a>
             </td>
        </tr>
    </c:forEach>
    </tbody>
    </table>

<jsp:include page= "/WEB-INF/views/template/footer.jsp"></jsp:include>