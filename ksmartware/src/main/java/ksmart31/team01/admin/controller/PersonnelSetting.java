package ksmart31.team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonnelSetting {

	@GetMapping("/admin/personnelSetting/setting")
	public String adminSetting() {
		System.out.println("관리자 인사 설정 실행");
	
	
		return "admin/personnelSetting/setting";
	}
}
