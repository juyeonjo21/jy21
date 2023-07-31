<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>

<!-- 
	input은 여러가지의 입력을 처리할 수 있다.
	- type이라는 속성을 통해 입력창의 형태를 바꿀 수 있다.
	- type의 기본값은 text이다
	
	-(참고)
	- 반드시 입력해야 하는 값은 required="required" 속성 추가
	- 만약 이름이랑 값이 같다면 특별히 이름만 써도 처리해준다
 	- required, readonly, disabled, checkced, selected,...
 -->


</head>
<body>

<h1>도서 등록</h1>
	<form action="http://localhost:8080/save">
	제목 <input type="text" name="title" required> <br><br>
	저자 <input type="text" name="author" required> <br><br>
	출간일 <input type="date" name="date" required> <br><br>
	판매가 <input type="text" name="price" required> <br><br>
	출판사 <input type="text" name="publisher" required> <br><br>
	<!-- 1~1000사이에서 1씩 증가/감소하며 시작값은 1 -->
	페이지 <input type="number" name="pageCount" min="1"
	 max="1000" step="1" value="1" required> <br><br>
<!-- 장르 <input type="text" name="genre"> <br><br>  -->
	 <!-- select를 이용하여 선택 가능한 입력창을 만들 수 있다 -->
	 장르 <select name="genre" required>
	 <option>자기계발</option>
	 <option>수험서</option>
	 <option>무협지</option>
	 <option>IT</option>
	 <option>판타지</option>
	 <option>공포</option>
	 <option>추리</option>
	 </select>
	 <br><br>
	 
	<button>등록하기</button>
	
	</form>
</body>
</html>