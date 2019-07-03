package ksmart31.team01.member.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.MemberEducation;
import ksmart31.team01.member.service.MemberMyEducationService;

@Controller
public class MemberMyEducationRestController {

	@Autowired private MemberMyEducationService memberMyEducaService;
	
	@GetMapping("/member/memberMyProfile/addmyEducation")
	public String myEducation(HttpSession session, MemberEducation memberEducation) {
		System.out.println("모달창 학력정보 입력 매서드 실행");
		
		
	
		return "member/memberMyProfile/myEducation";
	}

}
