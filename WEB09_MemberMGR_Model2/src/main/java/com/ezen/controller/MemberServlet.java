package com.ezen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.controller.action.Action;
import com.ezen.controller.action.JoinFormAction;
import com.ezen.controller.action.LoginAction;
import com.ezen.controller.action.LoginFormAction;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member.do")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		//같이 전달된 command parameter를 getParameter method로 받음
		String command = request.getParameter("command");
		//command에 전달된 값에 따라 어떤 작업을 할지 결정되어 실행될 예정
		
		//각 command별 실행할 작업들은 해당 실행코드가 들어있는 클래스 내부로
		//그 중 execute 메소드 안에 있음 Model2방식은 각 기능별로 클래스가 제작되어 
		//실행되길 기다리고 command 값에 따라 선택되어 실행되는 형식
		
		
		
		Action ac = null;
		
		/*		
		if(command.equals("loginForm")) {
			//LoginFormAction lfa = new LoginFormAction();
			//lfa.execute(request, response); 
			ac = new LoginFormAction();
		} else if (command.equals("login")) {
			//로그인 동작이 들어있는 클래스의 new 인스턴스를 만들고 execute 메소드 호출
			//LoginAction la = new LoginAction();
			//la.execute(request, response);
			ac = new LoginAction();
		} else if(command.equals("joinForm") ) {
			//JoinFormAction jfa = new JoinFormAction();
			//jfa.execute(request, response);
			ac = new JoinFormAction();
			
			//interface implements함으로 인해
			//부모 객체로 한번에 설정하여 코드 간단해짐
		}
		
	*/
		//각 기능을 탑재하고 있는 new 인스턴스 생성과 execute()의 실행은
		//클래스가 implement(상속)받은 부모 인터페이스(Action)의 
		//레퍼런스 변수에 저장하고 레퍼런스 변수명.execute로 실행함
		
		//각 클래스에 있는 execute 메소드는 Action 인터페이스에 존재하는 추상메소드로
		//각 클래스에 Action인터페이스를 상속하여 execute메소드가 오버라이딩되면
		//Action 인터페이스의 레퍼런스 변수로 자식 클래스의 execute메소드를 호출하여 사용함
		ActionFactory af = ActionFactory.getInstance();
		//싱글톤으로 제작되었기 때문에 new로 사용안됨
		ac = af.getAction(command); 
		//command를 전달 -> 메소드에서 위 조립동작 후 결과 객체를 리턴함
		
		if(ac==null) System.out.println("ac가 null입니다. command를 확인해주세요"
				+ " command : " + command );
		else ac.execute(request, response);
	} 	
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
