package ksmart31.team01.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.service.MemberMyInfoService;

@Controller
public class MemberMyInfoController {


	@Autowired private MemberMyInfoService memberMyInfoService;
	
	@GetMapping("/member/memberMyProfile/myInfo")
	public String memberMyInfo(HttpSession session, Model model) {
		System.out.println("나의 정보 실행");
		Member member = (Member) session.getAttribute("loginMember"); 
		  
		if(member.getMemberId() == null) { // 미로그인시 세션없으므로  로그인페이지 이동
			System.out.println("아이디 확인불가");
		  	return "redirect:"+"/login"; 
		  }
		System.out.println(member.getMemberName()+"님 확인");
		String memberId = member.getMemberId(); 
		
		Member memberInfo = memberMyInfoService.memberMyInfo(memberId);
		System.out.println("memberInfo" + memberInfo);
		model.addAttribute("memberInfo", memberInfo);
	
		return "member/memberMyProfile/myInfo";
	}
	
	
}
