package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.dao.MemberDao;
import com.ezen.dto.MemberDto;

public class DeleteMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDto mdto = (MemberDto)session.getAttribute("loginUser");
		//Object형식은 항상 꺼내올 떄 형변환이 필요함을 잊지말자
		
		MemberDao mdao = MemberDao.getInstance();
		mdao.deleteMember(mdto.getUserid());

		session.invalidate();
		
		request.setAttribute("message", mdto.getUserid() + " 회원탈퇴가 정상적으로 처리되었습니다");
		
		RequestDispatcher dp = request.getRequestDispatcher("member/loginForm.jsp");
		dp.forward(request, response);
	}
}