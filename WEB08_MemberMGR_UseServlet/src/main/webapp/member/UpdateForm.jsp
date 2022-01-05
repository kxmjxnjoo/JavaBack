<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty loginUser}">
	<jsp:forward page="login.do"/>
</c:if><!-- 로그인한 상태에서만, 보여주기 위해 사용하는 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateForm</title>
<script type = "text/javascript">
	function joinCheck() {
		if(document.frm.pwd.value.length==0){
			alert("비밀번호는 필수입력 사항입니다");
			document.frm.pwd.focus();
			return false;
		}
		if(document.frm.pwd.value != document.frm.pwd_chek.value){
			alert("비밀번호가 일치하지 않습니다");
			document.frm.pwd_chek.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<!-- 로그인한 사람의 아이디 한번 출력, 로그인한 사람의 아이디를 hidden으로 감춤 -> submit될 때 같이 전송되야함  -->
<h2>회원 정보 수정</h2>
<form action ="update.do" method="post" name="frm">
<table>
	<tr><td>이름</td>
	<td><input type="text" name="name" value="${loginUser.name}">*</td></tr>
	<tr><td>아이디</td><td>${loginUser.userid}<%--${loginUser.userid> --%>
		<input type="hidden" name="userid" value="${loginUser.userid}"></td></tr>
	<tr><td>비밀번호</td><td><input type="password" name="pwd" size="20"> *</td></tr>	
	<tr><td>비밀번호 확인</td><td><input type="password" name="pwd_chek" size="20"> *</td></tr>
	<tr><td>이메일</td>
		<td><input type="text" name="email" size="20" value="${loginUser.email}"></td> </tr>
	<tr><td>전화번호</td>
		<td><input type="text" name="phone" size="20" value="${loginUser.phone}"></td> </tr>
	<tr><td>등급</td><td>
		<c:choose>
			<c:when test="${loginUser.admin==0}">
				<input type="radio" name="admin" value="0" checked="checked"> 일반회원
				<input type="radio" name="admin" value="1"> 관리자
			</c:when>
			<c:otherwise>
				<input type="radio" name="admin" value="0"> 일반회원
				<input type="radio" name="admin" value="1" checked="checked"> 관리자
			</c:otherwise>			
		</c:choose></td></tr>
	<tr><td colspan="2" align="center">
		<input type="submit" value="확인" onClick="return joinCheck()";/>
		<input type="reset" value="취소"></td></tr>		
</table>
</form>
</body>
</html>