package com.ezen.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.board.dto.MemberDto;
import com.ezen.board.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService ms;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String firstRequest(HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		String url = "";
		if(session.getAttribute("loginUser") != null ) 
			url = "main";
		else 
			url = "member/loginForm";

		return url;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String url = "member/loginForm";
		
		MemberDto mdto = ms.getMember(id); 
		//id를 이용 회원조회, 회원의 모든정보를 dto형태로 리턴받음
		
		if(mdto == null) { //조회한 아이디가 없는 경우
			model.addAttribute("message", "아이디가 없습니다");
		} else if (mdto.getPw() == null) { //DB오류
			model.addAttribute("message", "DB오류, 관리자에게 문의하세요");
		} else if (mdto.getPw().equals(pw)) { //정상 로그인
			url = "redirect:/boardList"; 
			//redirect:/리퀘스트 이름 -> 리퀘스트이름에 해당하는 매핑으로 이동
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mdto);
		} else if ( !mdto.getPw().equals(pw)) {//비밀번호 틀림
			model.addAttribute("message", "비밀번호가 틀렸습니다");
		} else { //알 수 없는 오류
			model.addAttribute("message", "알 수 없는 이유로 로그인이 불가합니다");
		}
		
		return url;
	}
}
