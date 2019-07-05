package ksmart31.team01.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.member.domain.MemberAwards;
import ksmart31.team01.member.service.MemberMyAwardsService;


@RestController
public class MemberMyAwardsRestController {

	@Autowired private MemberMyAwardsService memberMyAwardsService;
	
	@GetMapping("/member/memberMyProfile/addMyAwards")
	public void myAcademy(HttpSession session,  MemberAwards memberAwards/* , MemberFiles memberFiles */) {
		System.out.println("수상 이력 정보 입력 실행");
		System.out.println("memberAcademy : " + memberAwards);
		/* System.out.println("memberFiles : " + memberFiles); */
		
		
		memberMyAwardsService.insertMyAwards(session, memberAwards/* , memberFiles */);
	}
	
	
	
}
