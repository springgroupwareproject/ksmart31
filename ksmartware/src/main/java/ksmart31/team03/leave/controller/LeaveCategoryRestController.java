package ksmart31.team03.leave.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.member.domain.Member;
import ksmart31.team03.leave.domain.LeaveCategory;
import ksmart31.team03.leave.domain.LeaveDetail;
import ksmart31.team03.leave.domain.LeavePolicy;
import ksmart31.team03.leave.service.LeaveCategoryManagementService;

@RestController
public class LeaveCategoryRestController {
	@Autowired
	private LeaveCategoryManagementService leaveCategoryManagementService;
	
	// 휴가 종류 입력
	@PostMapping("/leave/addLeaveCategory")
	public void addLeaveCategory(HttpSession session, LeaveCategory leaveCategory) {
		Member loginMember = (Member) session.getAttribute("loginMember");
		// 아이디 값 셋팅
		leaveCategory.setMemberId(loginMember.getMemberId());
		System.out.println("LeaveCategoryRestController.addLeaveCategory [POST] leaveCategory : "+leaveCategory);
		// 입력
		leaveCategoryManagementService.addLeaveCategory(leaveCategory);
	}
	// 상세 휴가 입력
	@PostMapping("/leave/addLeaveDetail")
	public void addLeaveDetail(HttpSession session, LeaveDetail leaveDetail) {
		Member loginMember = (Member) session.getAttribute("loginMember");
		// 아이디 값 셋팅
		leaveDetail.setMemberId(loginMember.getMemberId());
		System.out.println("LeaveCategoryRestController.addLeaveDetail [POST] leaveDetail : "+leaveDetail);
		// 입력
		leaveCategoryManagementService.addLeaveDetail(leaveDetail);
	}
	// 휴가 정책 입력
	@PostMapping("/leave/addLeavePolicy")
	public void addLeavePolicy(HttpSession session, LeavePolicy leavePolicy) {
		Member loginMember = (Member) session.getAttribute("loginMember");
		// 아이디 값 셋팅
		leavePolicy.setMemberId(loginMember.getMemberId());
		System.out.println("LeaveCategoryRestController.addLeaveDetail [POST] leavePolicy : "+leavePolicy);
		// 입력
		leaveCategoryManagementService.addLeavePolicy(leavePolicy);
	}
}
