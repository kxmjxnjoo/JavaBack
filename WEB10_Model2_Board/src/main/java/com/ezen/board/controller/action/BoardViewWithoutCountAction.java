package com.ezen.board.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;
import com.ezen.board.dto.ReplyDto;

public class BoardViewWithoutCountAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 게시물의 조회수를 1증가
		int num = Integer.parseInt( request.getParameter("num") );
		BoardDao bdao = BoardDao.getInstance();
		
		// bdao.plusReadCount(num);  // 조회수 증가 생략
				
		// 게시물을 읽어 와서 request 에 담고, boardView.jsp 로 이동함
		BoardDto bdto  = bdao.getBoard(num);
		request.setAttribute("board", bdto);
		
		ArrayList<ReplyDto> list  = bdao.selectReply( num );
		request.setAttribute("replyList", list);
			
		RequestDispatcher dp = request.getRequestDispatcher("board/boardView.jsp");
		dp.forward(request, response);
	}
}