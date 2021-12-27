<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>안녕하세요</h2>
<h2>JAVA SERVER PAGE(JSP)</h2>
<!-- HTML로 페이지를 구성하던중, JSP에 의한 컨텐츠가 중간에 나와야한다면 필요한 곳에 JSP명령을 사용 -->
<%--현재 JSP파일안에 HTML문법사이로 JSP문법이 끼어들어 코딩될 때는 <%%>를 사용%>

<H2>현재시간 : <%=new java.util.Date() %></H2>
<%--다만 페이지에 출력될 내용을 기술한다면 <%=%>를 작성하고 변수명이나 출력할 내용을 씀 --%>
</body>
</html>