<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JSP에서는 JAVA에서 사용하던 거의 모든 문법이 똑같이 사용됨 -->
<%
	int sum = 0;
	for(int i=1; i<=100; i++) {
		sum += i;
	}
%>
<h2><%=sum %></h2>



<%
	sum = 0;
	for(int i=1; i<=100; i++){
		sum += i;
%>
<h3><%=sum %></h3>
<%
	}
%>
<!-- JSP명령들 사이에 HTML같은 요소들이 끼어들어야 한다면 JSP영역을 끝내고
해당내용을 기술한후 다시 JSP영역을 시작시킴 한페이지 안에서
JSP명령은 중간 영역이 끝나고 다시시작해도 한 프로그램처럼 이어짐 -->
</body>
</html>