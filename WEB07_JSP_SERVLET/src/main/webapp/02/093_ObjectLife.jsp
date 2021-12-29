<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>093_Object</title>
</head>
<body>
<!-- 
*각 객체의 수명
pageContext : 현재 페이지까지
request : 다음페이지 까지 - forward에 의해 연장될 수 있음 -> 한번 쓰고 버릴 것
session : 브라우저가 닫힐 때 까지 ->ex) 홈페이지 로그인값, 
appliction : 서버가 꺼지거나 리셋 될 때 까지
 -->
 
 <h1>third의 pageContext 속성 : <%= pageContext.getAttribute("name") %> <br>
 third의 request 속성 : <%= request.getAttribute("name") %><br>
 third의 session 속성 : <%= session.getAttribute("name") %><br>
 third의 application 속성 : <%= application.getAttribute("name") %><br>
 </h1>
</body>
</html>