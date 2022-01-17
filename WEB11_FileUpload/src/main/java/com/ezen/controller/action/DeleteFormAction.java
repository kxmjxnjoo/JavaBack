package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.ProductDao;

public class DeleteFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//전달되는 상품번호로 상품을 삭제, productList.jsp로 이동
		int code = Integer.parseInt(request.getParameter("code"));
		ProductDao pdao = ProductDao.getInstance();
		pdao.deleteProduct(code);
		
		RequestDispatcher dp = request.getRequestDispatcher("product.do?command=index");
		dp.forward(request, response);
	}
}