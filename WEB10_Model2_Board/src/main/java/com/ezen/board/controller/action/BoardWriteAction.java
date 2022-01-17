package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDto bdto = new BoardDto();
		
		//파일이 저장될 서버내의 경로를 얻는 동작이 필요함
		HttpSession session = request.getSession(); 
		ServletContext context = session.getServletContext();
		String path = context.getRealPath("images");
		
		MultipartRequest multi = new MultipartRequest(
				request, path, 5*1024*1024, "UTF-8", new DefaultFileRenamePolicy() 
			);
		
		bdto.setUserid( multi.getParameter("userid") );
		bdto.setPass( multi.getParameter("pass") );
		bdto.setTitle( multi.getParameter("title") );
		bdto.setEmail( multi.getParameter("email") );
		bdto.setEmail( multi.getParameter("content") );
		bdto.setContent( multi.getFilesystemName("imgfilename") );

		BoardDao bdao = BoardDao.getInstance();
		bdao.insertBoard(bdto);
		
		response.sendRedirect("board.do?command=main");
		//RequestDispatcher dp = request.getRequestDispatcher("board.do?command=main");
		//dp.forward(request, response);
	}
}