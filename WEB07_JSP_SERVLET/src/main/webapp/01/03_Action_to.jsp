<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_Action_to</title>
</head>
<body>
<h3>method="get" 방식으로 요청된 주소</h3>
http://localhost:8090/WEB07_JSP_SERVLET/01/03_Action_to.jsp?name=%EA%B9%80%EC%A7%84%EC%A3%BC&id=asdf&pwd=123456&pwd_re=123456

<H3>method=""post방식으로 요청된 주소</H3>
http://localhost:8090/WEB07_JSP_SERVLET/01/03_Action_to.jsp

<!-- 위 주소를 이용해 서버에 요청전달되면 해당페이지(03_Action_to.jsp)가 내부에 포함된 JSP명령을 실행 후
클라이언트로 다운되어 웹브라우저에 보여지게 됨. 이 과정에서 Parameter로 전달되는 name과 value 들이
서버에서 JSP명령의 피연산자(연산의 대상)이 될 수 있음 -->

<!-- 요청방식
http://주소/경로/파일 이름.jp?첫번쨰 전달요소의 name=전달값&두번쨰요소name=전달값... -->
<!-- 한글은 인코딩 방식에 따라 위와같이 %16진수값으로 표시될 수 있음 -->
<!-- post방식은 회원가입이나 로그인할 때 입력한 비밀번호 또는 개인정보 등의 노출을 차단코자 할떄 사용하는 방식 -->

<!-- 아래는 서버에서 실행되어 HTML5로 구성될 내용들 -->
<%
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String pwd_re = request.getParameter("pwd_re"); 
	String superCar = request.getParameter("useritem");%> <br>
	
성명 : <%=name %><br>
아이디 : <%=id %><br>
비밀번호 : <%=pwd %><br>
비밀번호 확인 :<%=pwd_re %><br>
사용자아이템 : <%=superCar %> <br>
</body>
</html>