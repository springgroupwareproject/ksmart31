package ksmart31.team01.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.member.domain.MemberAcademy;
import ksmart31.team01.member.service.MemberMyAcademyService;

@RestController
public class MemberMyAcademyRestController {

	@Autowired private MemberMyAcademyService memberAcademyService;
	
	@GetMapping("/member/memberMyProfile/addmyAcademy")
	public void myAcademy(HttpSession session, MemberAcademy memberAcademy/* , MemberFiles memberFiles */) {
		System.out.println("교육 이력 정보 입력 실행");
		System.out.println("memberAcademy : " + memberAcademy);
		/* System.out.println("memberFiles : " + memberFiles); */
		
		
		memberAcademyService.insertMyacademy(session, memberAcademy/* , memberFiles */);
	}
	
	
	
}
