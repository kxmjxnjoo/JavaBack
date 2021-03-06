package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.ProductDao;
import com.ezen.dto.ProductVO;

public class ProductViewAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//전달된 상품 번호로 상품 검색하여
		String code = request.getParameter("code");
		ProductDao pdao = ProductDao.getInstance();
		ProductVO pvo = pdao.getProduct(code);
				
		request.setAttribute("product", pvo);
		//productView.jsp로 이동
		RequestDispatcher rd = request.getRequestDispatcher("product/productView.jsp");
		rd.forward(request, response);
	}
}