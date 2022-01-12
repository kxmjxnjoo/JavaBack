package com.ezen.board.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;
import com.ezen.board.util.Paging;

public class MainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDao bdao = BoardDao.getInstance();
		
		Paging paging = new Paging();
		int page=1;  // 처음 게시판을 열었을때
		
		// 2페이지를 클릭했을때 -> board.do?command=main&page=2
		if( request.getParameter("page") != null)
			page = Integer.parseInt( request.getParameter("page") );
		paging.setPage(page);
		
		int count = bdao.getAllCount();
		// setTotalCount 메서드 안에는 pagein() 메서드 호출명령이 같이 들어있음
		paging.setTotalCount(count);  // 레코드 총갯수 세팅 + 각 멤버변수 값 계산
		
		ArrayList<BoardDto> list = bdao.selectBoard( paging );
		
		for( BoardDto bdto : list) {
			int cnt = bdao.getReplycnt( bdto.getNum() );
			bdto.setReplycnt(cnt);
		}
		
		request.setAttribute("boardList" , list);
		request.setAttribute("paging", paging);
		
		RequestDispatcher dp = request.getRequestDispatcher("main.jsp");
		dp.forward(request, response);
	}
}