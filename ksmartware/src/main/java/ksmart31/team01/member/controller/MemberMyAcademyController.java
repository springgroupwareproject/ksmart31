package ksmart31.team01.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberAcademy;
import ksmart31.team01.member.service.MemberMyAcademyService;

@Controller
public class MemberMyAcademyController {

	@Autowired private MemberMyAcademyService memberAcademyService;
	
	@GetMapping("/member/memberMyProfile/myAcademy")
	public String myAcademy (HttpSession session, Model model) {
		System.out.println("controller 교육 이력 정보 실행");
		
		Member member = (Member) session.getAttribute("loginMember"); 
		
		System.out.println(member.getMemberName()+"님 확인");
		String memberId = member.getMemberId();
		
		List<MemberAcademy> myAcademy = memberAcademyService.myAcatemy(memberId);
		
		System.out.println("MemberMyAcademyController myAcatemy : " + myAcademy);
		model.addAttribute("myAcademy", myAcademy);
		
		return "member/memberMyProfile/myAcademy";
		//수정
	}
	
	
	
}
