<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>072_Login_do</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

if(id.equals("hong") && pwd.equals("1234")) {
	session.setAttribute("loginUser",id); //로그인 사용자 id를 세션에 저장
	response.sendRedirect("073_main.jsp"); 
	//Forward는 무언갈 저장하고 가져가는 용도라 지금은 필요없음
} else {
		response.sendRedirect("071_LoginForm.jsp");
}
%>

</body>
</html>