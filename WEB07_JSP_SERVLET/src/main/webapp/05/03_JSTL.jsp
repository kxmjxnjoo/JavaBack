<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_JSTL</title>
</head>
<body>
<!-- EL에 없는 JSP기능의 대부분이 JSTL에서 제공함. 변수, 반복문, if 등등-->
<%--<c:태그이름> <\c:태그이름> --%>
단순 출력<br><!-- EL로 하는 경우가 더 많음 -->
<c:out value="Hello"/><br>
EL 출력 : ${"Hello"} 
<br><br><br>

변수생성과 초기화1<br>
<c:set var="msg" value="Hello"></c:set><br>
생성한 변수를 EL에 의해 출력<br>
\${msg} = ${msg}
<br><br><br>

변수생성과 초기화2<br>
<c:set var="age">30</c:set><br>
생성한 변수를 EL에 의해 출력<br>
\${age} = ${age}
<br><br><br>

객체 생성<br>
<c:set var="member" value="<%=new com.ezen.dto.MemberBean()%>"></c:set>
<!-- MemberBean member = new MemberBean(); -->
<!-- 멤버변수 값 변경 -->
<c:set target="${member}" property="name" value="홍길동"></c:set>
<c:set target="${member}" property="userid">Hong</c:set>
EL에 의한 멤버변수 출력-객체와 멤버변수 이름만으로 setter기능이 대체됨<br>
클래스에 각 멤버변수에 대한 getter와 setter가 존재해야 위의 실행이 가능함
\${member.name}= ${member.name}<br>
\${member.userid}= ${member.userid}<br>
<br><br><br>

그 외 변수와 출력 기능 - JSTL과 EL의 혼합 사용<br>
<c:set var="add" value = "${10 + 5}"></c:set>
\${add}=${add}<br>
<c:set var="flag" value = "${10 > 5}"></c:set>
\${flag}=${flag}<br>
<br>
<input type="text" value="${member.userid}"><br>

</body>
</html>