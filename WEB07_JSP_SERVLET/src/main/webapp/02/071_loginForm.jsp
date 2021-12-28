<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>071_loginForm</title>
</head>
<body>
<!-- 로그인 폼 제작시 action 란에는 서블릿과 데이터 베이스를 이용한 로그인을 할 때는 서블릿 이름을 써서 이동하게함
다만 지금은 데이터베이스와의 연동이 진행되지 않았으므로 약식 로그인 폼과 동작만 제작함 -->
<form method="post" action="072_Login_do.jsp">
	<label for="id"> 아이디 : </label>
	<input type="text" id="id" name="id"><br>
	<label for="pwd"> 암 &nbsp; 호 : </label>
	<input type="password" id="pwd" name="pwd"><br>
	<input type="submit" value="로그인"><br>
</form>

</body>
</html>