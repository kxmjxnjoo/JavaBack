<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="CSS/board.css">
<script src="script/script.js" type="text/javascript"></script>
</head>
<body>
<form action="board.do" method="post" name="frm">
	<input type="hidden" name="command" value="idcheck">
		아이디 <input type="text" name="userid" value="${userid}">
				 <input type=submit value="중복 체크"><br> <!-- 아이디재검색 -->
</form><br><br><br>

<c:if test="${result==1}">
		<script type="text/javascript">
		opener.document.frm.id.value = "";
		</script>
		${id}는 이미 사용 중인 아이디입니다.
</c:if>
<c:if test="${result==-1}">
		${ userid}는 사용 가능한 아이디입니다.
		<input type="button" value="사용" class="cancel"  onclick="idok('${userid}')">
</c:if>
</body>
</html>