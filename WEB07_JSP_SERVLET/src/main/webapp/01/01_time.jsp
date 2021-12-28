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
<%java.util.Date d = new java.util.Date(); %>
<!-- HTML로 페이지를 구성하던중, JSP에 의한 컨텐츠가 중간에 나와야한다면 필요한 곳에 JSP명령을 사용 -->
<%--현재 JSP파일안에 HTML문법사이로 JSP문법이 끼어들어 코딩될 때는 <%%>를 사용--%>

<h2> 현재시간 : <%=new java.util.Date() %> </h2>

<%--다만 페이지에 출력될 내용을 기술한다면 <%=%>를 작성하고 변수명이나 출력할 내용을 씀 --%>


<!-- 일반텍스트와 JSP 명령의 주석처리 -->
<!-- 안녕하세요-일반텍스트에 주석처리 -->
<%-- 안녕하세요 오늘은 <%=new java.util.Date() %> 입니다 --%>


<%-- <%jsp 명령 %>: 명령의 실행 --%>
<%--<%=변수 또는 출력내용%>: 웹페이지에 출력--%>
<!-- jsp: 서버에서 계산하거나 처리할 명령을 써서 실행시키고 그 결과가 웹페이지에 jsp문법에 의해 표시되는 페이지 -->
<h2> <%=d%> => 계산된 현재날짜 시간을 body의 해당 위치에 표시</h2>


<!-- jsp명령은 html태그와 함꼐 파일로 저장되어 서버에 보관됨, 클라이언트의 요청을 받으면 해당파일 (~jsp)이 
클라이언트로 전송되어 웹브라우저에 표시되는데, 그 전에 jsp명령은 이미 실행되어 결과만 html태그와 같이 전성되어짐 -->

</body>
</html>