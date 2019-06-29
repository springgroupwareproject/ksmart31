package ksmart31.team01.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberEducation;
import ksmart31.team01.member.service.MemberMyEducationService;

@Controller
public class MemberMyEducationController {

	@Autowired private MemberMyEducationService memberMyEducaService;
	
	@GetMapping("/member/memberMyProfile/myEducation")
	public String myEducation(HttpSession session, Model model) {
		System.out.println("컨트롤러 학력정보 매서드 실행");
		
		Member member = (Member) session.getAttribute("loginMember"); 
		if(member.getMemberId() == null) { // 미로그인시 세션없으므로  로그인페이지 이동
			System.out.println("아이디 확인불가");
		  	return "redirect:"+"/login"; 
		}
		System.out.println(member.getMemberName()+"님 확인");
		String memberId = member.getMemberId(); 
		
		List<MemberEducation> myEducation = memberMyEducaService.myEducation(memberId);	
		System.out.println("MemberMyEducationController myEducation : " + myEducation);
		
		model.addAttribute("myEducation", myEducation);
	
		return "member/memberMyProfile/myEducation";
	}

}
