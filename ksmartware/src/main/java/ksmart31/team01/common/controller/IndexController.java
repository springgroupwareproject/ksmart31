package ksmart31.team01.common.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
		
	@GetMapping(value = { "/", "/index" })
	public String index(HttpSession httpSession, Model model){
		System.out.println("IndexController.index()");
		System.out.println("Controller index()호출 ");
		// 세션값 확인 (로그인 정보)
		System.out.println("Session loginMember : " + httpSession.getAttribute("loginMember"));
		return "index";
	}
	
	@GetMapping("/error")
	public String error() {
		return "error";
	}
	
	@GetMapping("/ex")
	public String ex() {
		return "layoutTemplateSampleEx";
	}
	
}