package ksmart31.team01.admin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.admin.service.PersonnelSetUpService;
import ksmart31.team01.member.domain.AdminLevel;

@RestController
public class PersonnelSetUpRestController {
	
	
	@Autowired PersonnelSetUpService personnelSetUpService;
	
	/* 관리자 권한부여 저장 매서드 */
	@GetMapping("/adminLevelSave")
	public String adminLevel(AdminLevel adminLevel) {
		System.out.println("관리자별 권한부여 실행");
		System.out.println(adminLevel);
		
		
		return null;
		
	}

	
}
