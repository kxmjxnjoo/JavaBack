package com.ezen.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.ProductDao;
import com.ezen.dto.ProductVO;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDao pdao = ProductDao.getInstance();
		ArrayList<ProductVO> list = pdao.selectAll();
		// System.out.println(list.size());
		request.setAttribute("productList", list);
		
		String url = "product/productList.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}