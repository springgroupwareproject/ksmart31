package ksmart31.team01.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.admin.service.PersonnelSettingService;
import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberPosition;

@RestController
public class PersonnelSettingRestController {

	@Autowired private PersonnelSettingService personnelSettingService;
	
	@GetMapping("/admin/personnelSetting/addsetting")
	public void addAdminSetting(HttpSession session, MemberPosition memberPosition) {
		System.out.println("관리자 직위/직책 항목  입력 실행");
		
		Member member = (Member) session.getAttribute("loginMember");
	 	System.out.println("member : " + member);
	 	
	 	personnelSettingService.addAdminSetting(member, memberPosition);
	 	
	}
}
