<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<% 
String sAge = request.getParameter("age");
int age= Integer.parseInt(sAge);
String abe = request.getParameter("abc");

if(age<=19){
%>
		<script type = "text/javascript">
			alert("20세 미만이므로 입장 불가능");
			history.go(-1); /* 한페이지 뒤로 가는 jsp명령 */
		</script>
<%
}else{
	//request객체에는 Attribute라는 저장소가있음
	//전달할 데이터를 Arttribute에 각 자료의 이름을 같이 저장하고 forward(이동)하면
	//목적지에 해당 데이터가 같이 이동함
	
	//Atrribute라는 저장소에 name이라는 이름으로 "홍길동"을 저장해두고 
	//083_ForwardResult.jsp로 이동(Forward)합니다. 083.ForwardResult.jsp에서는
	//이전 페이지에서 보내준 request와 response를 이용해 저쟁해준 name값을 꺼내 사용 할 수 있음
	//저장 메소드 : setArrtibute() 		추출 메소드 : getAttribute()

	//파라미터 저장
	request.setAttribute("name", "홍길동");
	
	//포워드를 위한 객체 생성 및 이동 페이지 설정
	RequestDispatcher dp = request.getRequestDispatcher("083_ForwardResult.jsp");
	//현재의 request와 response를 갖고 목적지로 이동
	dp.forward(request, response);
	
	//현재 페이지의 request 객체의 수명은 forward로 전달될 다음 페이지 까지임
	//보통 파라미터를 통해 정보를 전달하고 request.getParameter()를 사용하여 전달된 값을
	//추출하여 사용하지만 위의 RequestDispatcher는 전달인수 대신 request내부의 
	//Attribute를 사용하여 전달인자를 저장하고, 수명을 다할지 모를 이전 페이지의 request와 response를
	//전달인수로 전달하여 forward라는 명령으로 페이지를 이도한 다음 이동한 페이지의 Attribute를 사용하게 함
	
	//forward 방식으로 이동된 페이지는 한글에 대한 인코딩 작업이 불필요함
}
%>