package ksmart31.team01.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.admin.service.PersonnelSettingService;
import ksmart31.team01.member.domain.MemberPosition;

@Controller
public class PersonnelSettingController {
	
	@Autowired private PersonnelSettingService personnelSettingService;
		
	@GetMapping("/admin/personnelSetting/setting")
	public String getadminSetting(Model model) {
		System.out.println("관리자 인사 설정 출력 실행");
		
		List<MemberPosition> MemberPosition = personnelSettingService.getadminSetting();
		System.out.println("PersonnelSettingController 관리자 인사 설정 출력 리턴값 : " + MemberPosition);
		model.addAttribute("MemberPosition", MemberPosition);
	
		return "admin/personnelSetting/setting";
	}
}
