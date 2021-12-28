<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_Declare</title>

<%--jsp는 실행영역과 선언부영역으로 구분됨 보통 실행영역은 body안에서 <%%>로
표시된 곳에 기술쇧지만 선언부는 head부분에 <%! %>로 표시된 곳에 기술됨 --%>

<%! //선언부의 시작: 선언부 영역은 변수, 메소드등이 정의됨 
	//변수의 선언
	String str = "안녕하세요!!";
	int a = 5, b = -5;
	//메소드의 정의
	public int abs(int n) {
		if (n<0) n= -n; // n= -1 *n;
		return n;
	} //jsp의 메소드는 static으로 선언하지 않아도 사용가능
%>

</head>
<body>
<% //실행부의 시작
int c = 10;
c++;
a++;
out.print(str+ "<br>");
out.print(a + "의 절대값: " + abs(a) + "<br>");
out.print(c + "의 절대값: " + abs(c) + "<br>");
%>
<br><br>
<%=str %><br>
<%=a %>의 절대값: <%=abs(a)%><br>
<%=c %>의 절대값: <%=abs(c)%><br>
</body>
</html>