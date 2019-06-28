package ksmart31.team01.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.admin.service.PersonnelSetUpService;
import ksmart31.team01.member.domain.AdminLevel;
import ksmart31.team01.member.domain.Member;

@Controller
public class PersonnelSetUpController {
	
	// 리베이스 테스트
	
	@Autowired PersonnelSetUpService personnelSetUpService;
	
	/* 관리자 권한부여 매서드 */
	@GetMapping("/adminLevel/adminLevel")
	public String adminLevel(HttpSession session, Model model) {
		System.out.println("관리자별 권한부여 실행");
		
		System.out.println("맴버객체생성시작");
		Member member = (Member) session.getAttribute("loginMember"); //세션에담긴값 맴버vo로 담음
		if(member == null) { // 미로그인시 세션없으므로 로그인페이지 이동
			System.out.println("PersonnelSetUpController.memberLevel session=null");
			return "redirect:"+"/login";
		}
		String memberLevelTitle = member.getMemberLevelTitle(); // 맴버vo내부 전역변수값을 get메서드로 불러와서 변수에담음 
		System.out.println("맴버객체생성완료");
		
		if(memberLevelTitle.equals("마스터관리자") || memberLevelTitle.equals("슈퍼관리자")) { //세션에있는 레벨값이 마스터또는슈퍼 관리자일경우
			if(memberLevelTitle.equals("마스터관리자")){
				System.out.println("마스터관리자님 환영합니다.");
			}
			if(memberLevelTitle.equals("슈퍼관리자")){
				System.out.println("슈퍼관리자님을 확인하였습니다. 어서오세요.");
			}
			
			List<AdminLevel> adminLevel = personnelSetUpService.adminLevel();
			model.addAttribute("adminLevel", adminLevel);
			
				return "adminLevel/adminLevel";
		}			
		
		System.out.println("마스터or슈퍼관리자가 아닙니다.");
		return "redirect:"+"/";
	}
	
}
