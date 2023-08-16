<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page= "/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>자유 게시판</h1>
<h3>타인에 대한 비방은 경고 없이 삭제됩니다</h3>
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
        </tr>
    </thead>
    <tbody align="center">
    <c:forEach var= "boardDto" items= "${list}">
        <tr>
            <td>${boardDto.boardNo}</td>
            <td>${boardDto.getBoardWriterString()}</td>
            <td align="left">
            <!-- 제목을 누르면 상세페이지로 이동 -->
            <a href="detail?boardNo=${boardDto.boardNo}">
            ${boardDto.boardTitle}
            </a>
    
            <!--댓글이 있다면 개수를 표시 -->
         	<c:if test="${boardDto.boardReplycount > 0}">
            [%{boardDto.boardReplycount}]
            </c:if>
            </td>
            
            <%--사용자가 없으면 탈퇴한 사용자로 표시 --%>
           <%--
            <c:choose>
            <c:when test = "${boardDto.boardWriter != null}">
            	<td>${boardDto.boardWriter}</td>
            </c:when>
            <c:otherwise>
            <td>(탈퇴한 사용자)</td>
            </c:otherwise>
            </c:choose>
             --%>

            <td>${boardDto.boardReadcount}</td>
            <td>${boardDto.boardLikecount}</td>
            <td>${boardDto.boardReplycount}</td>
            <td>${boardDto.boardCtimeString}</td>
        </tr>
    </c:forEach>
    </tbody>
    </table>
    <c:if test="${sessionScope.name != null }">
<h3 align="center"><a href="write">글쓰기</a></h3>
</c:if>

<jsp:include page= "/WEB-INF/views/template/footer.jsp"></jsp:include>