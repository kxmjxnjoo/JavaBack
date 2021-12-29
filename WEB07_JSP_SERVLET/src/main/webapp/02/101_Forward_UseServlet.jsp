<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>101_Forward_UseServlet</title>
</head>
<body>
<!-- 정보입력 페이지 -> 정보 처리 페이지 -> 처리 결과 페이지 이 세단계를 거친 자료 처리 방식은 
옛날 방식으로 주로 윈도우 서버에서 (WIndow NT) ASP언어를 사용할 때 쓰던 방식임

다른 방식으로 JAVA JSP로 넘어오며 자바 프로그래밍을 실행가능케 하는 WAS 서버를 사용하고, 
이 서버에선 정보처리 페이지를 사용하지 않는 대신 Servlet이라는 웹용 클래스(서버에 생성, 실행하는)
를 생성하여 명령을 실행하게 함 -->

<form method="post" action="../Forward_useServlet"> 
	<label for="userid">아이디 : </label>
	<input type = "text" name = "id" id="userid"><br>
	<label for="userpwd"> 암 &nbsp; 호 : </label>
	<input type = "password" name="pwd" id="userpwd"><br>
	<input type="submit" value="로그인">
</form>

<!-- 서블릿을 사용한다는 의미는 앞선예제(081~ 083, 071 ~ 073)의 XXX_do.jsp파일의 역할을
서버 내부에 감춰져서 공개되지 않을 웹클래스에 일임하는 것과 같음 -->

<!-- 프로그래밍 명령등의 로직과 알고리즘이 공개되는 것이 부담스럽거나 자료이동을 감추고 있다면 위와 같은
서블릿에 그 동작을 일임하듯 이름 불러 사용함 Forward_userServlet: 서블릿의 이름 -->

<!-- 사용할 서블릿의 위치는 파일들이 저장되는 최상단 위치한 것 으로 인식하기 때문에 현재 페이치에서의 
상대 위치는 (../)로 연결하여 지정함 -->
</body>
</html>