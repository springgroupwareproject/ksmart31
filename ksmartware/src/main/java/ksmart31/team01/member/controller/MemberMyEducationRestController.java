package ksmart31.team01.member.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberEducation;
import ksmart31.team01.member.service.MemberMyEducationService;

@RestController
public class MemberMyEducationRestController {

	@Autowired private MemberMyEducationService MemberMyEducationService;
	
	@GetMapping("/member/memberMyProfile/addmyEducation")
	public void addmyEducation(HttpSession session, MemberEducation memberEducation) {
		System.out.println("모달창 학력정보 입력 매서드 실행 : memberEducation" + memberEducation);
		
		Member member = (Member) session.getAttribute("loginMember");
	
		MemberMyEducationService.addmyEducation(memberEducation, member);	
	}

}
