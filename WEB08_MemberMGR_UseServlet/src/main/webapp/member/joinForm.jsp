<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinForm</title>
<script type="text/javascript">
	function idCheck(){
		if(document.frm.userid.value.length == 0) {// ==null 외에 이런 표현 방법도 있음
			alert("중복조회할 아이디를 입력하고 버튼을 눌러주세요");
			document.frm.userid.focus();
			return;
		}
		var inputid = document.frm.userid.value; //매번 작성하기 너무 길어 변수에 저장(아래도 동일)
		var opt = "toobar=no, menubar=no, scrollbars=yes, resizable=no, width=500, height=200";
		window.open("idcheck.do?userid=" + inputid ,"idcheck", opt);
		//팝업창 오픈 메뉴의 idcheck.do : 서블릿 -> 아이디 중복체크 동작 후 
		//결과를 포워딩되는 페이지의 팝업창에 표시될 예정. 서블릿 호출 시 
		//파라미터를 위와 같이 호출되는 주소에 ?와 함께 전달 할 수 있음
	}
	
	function joinCheck() {
		if(document.frm.name.value==""){
			alert("이름은 필수입력 사항입니다");
			document.frm.name.focus();
			return false;
		}
		if(document.frm.userid.value.langth==0){
			alert("아이디는 필수입력 사항입니다");
			document.frm.userid.focus();
			return false;
		}
		if(document.frm.userid.value != document.frmreid.value){
			alert("아이디 중복체크는 필수입니다");
			return false;
		}
		if(document.frm.pwd.value.langh==0){
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
<h2>회원 가입</h2> '*' 표시 항목은 필수 입력 항목입니다
<form action ="join.do" method="post" name="frm">
<table>
	<tr><td>이름</td><td><input type="text" name="name" size="20">&nbsp;*</td></tr>
	<tr><td>아이디</td><td><input type="text" name="userid" size="20">&nbsp;*
			<input type="button" value="중복 체크" onClick="idCheck();"/>
			<input type="hidden" name="reid" value=""></td></tr>
	<tr><td>비밀번호</td><td><input type="password" name="pwd" size="20">&nbsp;*</td></tr>	
	<tr><td>비밀번호 확인</td> 
		<td><input type="password" name="pwd_chek" size="20">&nbsp;*</td></tr>
	<tr><td>이메일</td><td><input type="text" name="email" size="20"></td> </tr>
	<tr><td>전화번호</td><td><input type="text" name="phone" size="20"></td> </tr>
	<tr><td>등급</td><td><input type="radio" name="admin" value="0" checked="checked">
		일반회원&nbsp;<input type="radio" name="admin" value="1">관리자</td></tr>
	<tr><td colspan="2" align="center">
		<input type="submit" value="회원 가입" onClick="return joinCheck()"/>
		<input type="reset" value="취소"></td></tr>	
	
</table>
</form>
</body>
</html>