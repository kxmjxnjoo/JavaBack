package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.ProductDao;
import com.ezen.dto.ProductVO;

public class UpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//전달된 상품번호로 상품 조회, request에 담아 updateForm으로 이동
		String code = request.getParameter("code");
		
		ProductDao pdao = ProductDao.getInstance();
		ProductVO pvo = pdao.getProduct(code);
		
		request.setAttribute("product", pvo);
		
		RequestDispatcher rd = request.getRequestDispatcher("product/updateForm.jsp");
		rd.forward(request, response);
	}
}