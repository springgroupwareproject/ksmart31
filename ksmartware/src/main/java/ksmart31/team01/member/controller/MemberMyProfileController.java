package ksmart31.team01.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.service.MemberMyProfileService;

@Controller
public class MemberMyProfileController {
	
	@Autowired private MemberMyProfileService memberMyProfileService;
	
	@GetMapping("/member/memberMyProfile/myProfile")
	public String myProfile(HttpSession session, Model model){
		System.out.println("마이 프로필 매서드 실행.");
		System.out.println("접속자 정보 확인중...");
		
		  //세션에담긴값 맴버vo로 담음 Member member = (Member)
		  Member member = (Member) session.getAttribute("loginMember"); 
		  
		  if(member.getMemberId() == null) { // 미로그인시 세션없으므로  로그인페이지 이동
		 	 System.out.println("아이디 확인불가");
		  		return "redirect:"+"/login"; 
		  }
		  
		  System.out.println(member.getMemberName()+"님 확인");
		  
		  String memberId = member.getMemberId(); 
		  Member memberProfile = memberMyProfileService.myProfile(memberId);
		  System.out.println("ksmart31.team01.member.controller.MemberMyProfileController. myProfile() memberProfile : "+ memberProfile);
		  model.addAttribute("memberProfile", memberProfile);
		 
		 
				
		return "/member/memberMyProfile/myProfile";
	}
	
}
