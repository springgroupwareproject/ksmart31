package ksmart31.team03.leave.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team01.member.domain.Member;
import ksmart31.team03.leave.domain.LeaveCategory;
import ksmart31.team03.leave.service.LeaveCategoryManagementService;

@Controller
public class LeaveCategoryManagementController {
	@Autowired
	private LeaveCategoryManagementService leaveCategoryManagementService;
	
	// 휴가 종류, 세부 휴가, 휴가 정책 리스트
	@GetMapping("/leave/leaveCategoryManagement")
	public String getleaveCategoryManagement(HttpSession session, Model model, @RequestParam(required = false) String leaveCategoryCode) {
		Member loginMember = (Member) session.getAttribute("loginMember");
		System.out.println("LeaveCategoryManagementController.getleaveCategoryManagement [GET] loginMember : "+loginMember);
		if(loginMember == null) {
			return "redirect:"+"/login";
		}else if(loginMember.getMemberLevelTitle().equals("슈퍼관리자")) {
			// 휴가 종류 리스트
			List<LeaveCategory> categoryList = leaveCategoryManagementService.getLeaveCategoryList();
			System.out.println("LeaveCategoryManagementController.getleaveCategoryManagement [GET] categoryList : "+categoryList);
			model.addAttribute("leaveCategoryList", categoryList);	// 휴가 종류 리스트
			
			System.out.println("LeaveCategoryManagementController.getleaveCategoryManagement [GET] leaveCategoryCode : "+leaveCategoryCode);
			Map<String, Object> map = new HashMap<String, Object>();
			if(leaveCategoryCode != "") {
				// 세부 휴가, 휴가 정책 리스트
				map =  leaveCategoryManagementService.getLeaveDetailAndPolicyList(leaveCategoryCode);
			}
			model.addAttribute("resultMap", map);	// 세부 휴가, 휴가 정책 리스트
			model.addAttribute("leaveCategoryCode", leaveCategoryCode);
			System.out.println("LeaveCategoryManagementController.getleaveCategoryManagement [GET] model : "+model);
			return "leave/leaveCategoryManagement";
		}else {
			return "redirect:"+"/";
		}
	}
}
