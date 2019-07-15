package ksmart31.team01.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.admin.service.AdminSecurityService;
import ksmart31.team01.member.domain.AdminLevel;

@RestController
public class AdminSecurityRestController {
	
	
	@Autowired AdminSecurityService adminSecurityService;
	
	
	@GetMapping("/admin/adminSecurity/addAdminSecurity")
	public void addAdminSecurity() {
		System.out.println("관리자 권한 부여 실행");	

		
	}
	
	/* 관리자 권한부여 출력 매서드 */
	@GetMapping("/admin/adminSecurity/getAdminSecurity")
	public List<AdminLevel> adminLevel() {
		System.out.println("관리자별 권한 현황 출력");
		
		List<AdminLevel> adminLevel = adminSecurityService.adminLevel();
	
		return adminLevel;
	}	

		

	
}
