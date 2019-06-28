package ksmart31.team03.leave.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team03.leave.domain.LeaveCategory;
import ksmart31.team03.leave.domain.LeaveGrant;
import ksmart31.team03.leave.domain.LeaveGrantAndUsed;
import ksmart31.team03.leave.domain.LeaveHistory;
import ksmart31.team03.leave.domain.LeaveUsed;
import ksmart31.team03.leave.service.LeaveMyPageService;

@Controller
public class LeaveMyPageController {
	@Autowired
	private LeaveMyPageService leaveMyPageService;
	
	// 나의 휴가 정보
	@GetMapping("/leave/leaveMyPage")
	public String getleaveMyPage(HttpSession session, Model model) {
		Member loginMember = (Member) session.getAttribute("loginMember");
		System.out.println("LeaveMyPageController.getleaveMyPage [GET] loginMember : "+loginMember);
		if(loginMember == null) {
			return "redirect:"+"/login";
		}else {
			// 휴가 카테고리 리스트 조회
			List<LeaveCategory> leaveCategoryList = leaveMyPageService.getLeaveCategoryList();
			System.out.println("LeaveMyPageController.getleaveMyPage [GET] leaveCategoryList : "+leaveCategoryList);
			// 조직원 아이디별 휴가 내역 조회
			List<LeaveHistory> leaveHistoryList = leaveMyPageService.getLeaveHistoryByMemberId(loginMember.getMemberId());
			System.out.println("LeaveMyPageController.getleaveMyPage [GET] leaveHistoryList : "+leaveHistoryList);
			
			model.addAttribute("leaveCategoryList", leaveCategoryList);
			model.addAttribute("leaveHistoryList", leaveHistoryList);
			model.addAttribute("loginMember", loginMember);
			return "leave/leaveMyPage";
		}
	}
}
