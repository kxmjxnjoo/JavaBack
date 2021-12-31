<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_ParameterNull</title>
</head>
<body>
<h3>JSP 코드 : <%=request.getParameter("id")%></h3>
<h3>EL 코드 : ${param.id }</h3>

JSP코드
<br>
request.getParameter("id").equals("hong") -> 에러 <br>
<%--<%=request.getParameter(\"id\").equals(\"hong\")--%>
equals() 사용 결과 : error - equals 메소드는 'null'값으로 비교하면 오류를 발생함
<br><br>


에러를 방지하기 위해 아래와 같은 '==' 연산자 사용 : <br>
request.getParameter("id")!null && request.getParmeter("id").equals("hong") =>"
<%=request.getParameter("id")!=null && request.getParameter("id").equals("hong") %>

<hr>
EL식
'==' 연산자 사용 결과 : \${param.id=="hong"} -> ${param.id=="hong"}
<br>
<hr>
equals()를 사용할 때의 null값 비교 오류 해결 방법:
<pre>
<!-- <pre> 태그 : 입력한 그대로를 화면에 보여주는 태그 : 주로 코딩 내역을 화면에 표시할 때 사용 -->
if(request.getParameter("id") != null){
	if(request.getParameter("id").equals("hong")){
	}
}
</pre>
</body>
</html>