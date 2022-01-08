package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "member/loginForm.jsp";
		HttpSession session = request.getSession();
		
		if( session.getAttribute("loginUser") != null )
			url = "member.do?command=main";
		
		RequestDispatcher  dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
	}
	/*public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dp = request.getRequestDispatcher("member/loginForm.jsp");
		dp.forward(request, response); //해당 코드만 오버라이딩된 메소드에 올라가면 됨
		LoginFormAction lfa = new LoginFormAction();
		lfa.execute(request, response);
	}*/
}