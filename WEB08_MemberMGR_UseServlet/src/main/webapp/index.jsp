<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>index</title>
</head>
<body>
<!-- 안녕하세요 -->
<%
//response.sendRedirect("member/loginForm.jsp");
//바로 가면 경로가 노출되기 때문에 서블릿을 통해 감
response.sendRedirect("login.do");
%>

</body>
</html>