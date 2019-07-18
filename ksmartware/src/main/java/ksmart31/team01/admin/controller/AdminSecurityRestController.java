package ksmart31.team01.admin.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ksmart31.team01.admin.service.AdminSecurityService;
import ksmart31.team01.member.domain.AdminLevel;
import ksmart31.team01.member.domain.Member;

@RestController
public class AdminSecurityRestController {
	
	
	@Autowired AdminSecurityService adminSecurityService;
	
	
	@PostMapping("/admin/adminSecurity/modifyAdminSecurity")
	public void modifyAdminSecurity(HttpSession session, String json) {
		System.out.println("관리자 권한 부여 실행");	
		
		// Gson을 사용 문자열을 받아서 클래스안에 값을 넣는다 뷰쪽에서 보낼떄 객체내부 매개변수 명이 같아야한다
		Gson gson = new GsonBuilder().create();
		AdminLevel[] adminLevel = gson.fromJson(json, AdminLevel[].class);
		List<AdminLevel> adminLevelList = Arrays.asList(adminLevel);
		
		System.out.println("adminLevelList : " + adminLevelList);
	
		Member member = (Member) session.getAttribute("loginMember");
		
		
		
		adminSecurityService.modifyAdminLevel(adminLevelList, member);
	}
	
	/* 관리자 권한부여 출력 매서드 */
	@GetMapping("/admin/adminSecurity/getAdminSecurity")
	public List<AdminLevel> adminLevel() {
		System.out.println("관리자별 권한 현황 출력");
		
		List<AdminLevel> adminLevel = adminSecurityService.adminLevel();
		System.out.println("adminLevel : " + adminLevel);
		return adminLevel;
	}	

		

	
}
