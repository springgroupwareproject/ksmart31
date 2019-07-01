package ksmart31.team01.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberAcademy;
import ksmart31.team01.member.service.MemberMyAcademyService;

@RestController
public class MemberMyAcademyRestController {

	@Autowired private MemberMyAcademyService memberAcademyService;
	
	@GetMapping("/member/memberMyProfile/myAcademy")
	public String myAcademy (HttpSession session, Model model) {
		System.out.println("controller 교육 이력 정보 실행");
		
		Member member = (Member) session.getAttribute("loginMember"); 
		if(member.getMemberId() == null) { // 미로그인시 세션없으므로  로그인페이지 이동
			System.out.println("아이디 확인불가");
		  	return "redirect:"+"/login"; 
		}
		System.out.println(member.getMemberName()+"님 확인");
		String memberId = member.getMemberId();
		
		List<MemberAcademy> myAcatemy = memberAcademyService.myAcatemy(memberId);
		
		System.out.println("MemberMyAcademyController myAcatemy : " + myAcatemy);
		model.addAttribute("myAcatemy", myAcatemy);
		
		return "member/memberMyProfile/myAcademy";
	}
	
	
	
}
