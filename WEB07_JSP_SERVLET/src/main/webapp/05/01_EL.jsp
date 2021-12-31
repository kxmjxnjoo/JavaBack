<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_EL</title>
</head>
<body>
JSP 문법 사용 1 : <%="Hello" %><br>
JSP 문법 사용 2 : <% out.println("Hello"); %><br>
EL 문법 사용 : ${"Hello"}<br> 
<br><br>


정수형 : ${10}<br>
실수형 : ${5.6}<br>
문자형 : ${"홍길동"}<br>
논리형 : ${true}<br>
null : ${null}<br>
<br><br>


10과 2의 합 : ${10 + 2}<br>
<!--  \${10 - 2}는 모양 그대로 출력, ${10 - 2}는 계산된 결과 출력 -->
\${ 10 - 2 } = ${ 10 - 2 }<br>
\${ 10 * 2 } = ${ 10 * 2 }<br>
\${ 10 / 2 } = ${ 10 / 2 }<br>
\${ 10 % 3 } = ${ 10 % 3 }<br>
\${ 10 mod 3 } = ${ 10 mod 3 }<br>
<br><br>


<!-- 관계연산(비교연산) -->
\${ 10 == 2 } = ${ 10 == 2 }<br>
\${ 10 eq 2 } = ${ 10 eq 2 }<br>
\${ 10 < 2 } = ${ 10 < 2 }<br>
\${ 10 lt 3 } = ${ 10 lt 3 }<br>
\${ 5>=4 } = ${ 5>=4 }<br>
\${ empty("") } = ${ empty("") }<br>
<br><br>


<!-- 서로 다른 자료형 간의 
연산 문자+정수형 연산도 가능함 --->
\${ "2" + 5 } = ${ "2" + 5  }<br>
\${ "2" * 5 } = ${ "2" * 5 }<br>
\${ null + 1 } = ${ null + 1 }<br>
<br><br>


<!-- 문자열 연결(이어 붙이기_ -->
<%--\${"문자" + "열"} = ${"문자" + "열"}연산은 에러임 --%>

<%-- 문자열 연결(EL 3.0추가 --%>
\${"문자" += "열 " += "연결"} =  ${"문자" += "열 " += "연결"}<br>
<br><br>


<!-- 서버 객체의 내용을 getAttribute 메소드 없이 사용 -->
<%
request.setAttribute("name","홍길동");
pageContext.setAttribute("name","홍길서");
session.setAttribute("name","홍길남");
application.setAttribute("name","홍길북");
%>

JSP문법 : <%=request.getAttribute("name") %><br>
JSP문법 : <% String str = (String) request.getAttribute("name"); %>
			  <%=str %><br> 
EL 문법 : ${name}<br> 
EL 문법 : ${requestScope.name}<br>
EL 문법 : ${sessionScope.name}<br>
EL 문법 : ${applicationScope.name}<br>
<br><br>

</body>
</html>