<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>08_Import</title>
</head>
<body>
<!-- JSP의 include와 같은 역활을 하는 명령 : 다른 점은 include된 내용을 변수에 저장하여 사용가능 -->
<c:import url="http://localhost:8090/WEB07_JSP_SERVLET/05/01_EL.jsp"
	var="data1"></c:import>
${data1}
<hr>

<c:url value="../images/Koala.jpg" var="data2"></c:url>
<h3>${data2}</h3> 
<img src="${data2}" width='150' height='150'>
</body>
