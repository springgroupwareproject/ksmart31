package ksmart31.team01.common.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ksmart31.team01.common.service.MemberLoginService;
import ksmart31.team01.member.domain.Member;

@Controller
public class MemberLoginController {
	
	@Autowired private MemberLoginService memberLoginService;
	
	// 3. 로그아웃 MemberController.logout -> index.jsp
	@GetMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:"+"/";
	}
	// 2. 로그인 액션  MemberController.getMember -> MemberService.getMemberForLogin -> MemberMapper.selectMemberForLogin -> 역순으로 리턴 -> index.jsp
	@PostMapping("/login")
	public String getMember(HttpSession session, Member member){
		System.out.println("MemberController.getMember POST 메소드 호출");
		System.out.println("MemberController.getMember POST memberId :"+member);
		
		Member loginMember = memberLoginService.getMemberForLogin(member);
		System.out.println("MemberController.getMember POST loginMember :"+loginMember);
		if(loginMember == null){
			return "member/login";
		} else {
			session.setAttribute("loginMember", loginMember);
			System.out.println("MemberController.getMember POST session :"+session);
			return "redirect:"+"/";
		}
	}
	// 1. 로그인 폼 MemberController.getMember -> login.jsp
	@GetMapping("/login")
	public String getMember(HttpSession session){
		System.out.println("MemberController.getMember GET session.loginMember :"+session.getAttribute("loginMember"));
		if(session.getAttribute("loginMember") != null) {
			return "redirect:"+"/";
		} else {
			return "member/login";
		}
	}	
}