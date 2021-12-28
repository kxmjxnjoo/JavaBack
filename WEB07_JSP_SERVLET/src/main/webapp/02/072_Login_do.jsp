<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!-- JSP문법에 의한 로그인 체크 동작만 필요한 페이지므로 별도의 HTML태그는 사용하지 않습니다 -->
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

//원하는 아이디 비번이 전달되었는지 확인 후 맞으면 073_loginOK.jsp로 이동함
//jsp문법으로 페이지 이동은 response.sendRedirect();
if(id.equals("hong")&& pwd.equals("1234") )
	response.sendRedirect("073_loginOk.jsp?name=" + URLEncoder.encode("홍길동", "UTF-8"));
else
	response.sendRedirect("071_loginForm.jsp");
	
//jsp파일에서 로그인 절차를 진행할 때 단점 #1
//한글 전달값에 대한 인코딩이 UTF-8이 아니라 글자 깨짐
//별도의 URLEncoding 객체를 사용해야함
%>