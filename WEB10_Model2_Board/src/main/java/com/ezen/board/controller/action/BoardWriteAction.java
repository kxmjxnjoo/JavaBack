package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDto bdto = new BoardDto();
		bdto.setUserid( request.getParameter("userid") );
		bdto.setPass( request.getParameter("pass") );
		bdto.setTitle( request.getParameter("title") );
		bdto.setEmail( request.getParameter("email") );
		bdto.setContent( request.getParameter("content") );

		BoardDao bdao = BoardDao.getInstance();
		bdao.insertBoard(bdto);
		
		response.sendRedirect("board.do?command=main");
		//RequestDispatcher dp = request.getRequestDispatcher("board.do?command=main");
		//dp.forward(request, response);
	}
}