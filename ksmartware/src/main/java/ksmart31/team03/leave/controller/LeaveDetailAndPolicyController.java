package ksmart31.team03.leave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team03.leave.domain.LeaveDetail;
import ksmart31.team03.leave.domain.LeavePolicy;
import ksmart31.team03.leave.service.LeaveCategoryManagementService;

@RestController
public class LeaveDetailAndPolicyController {
	@Autowired
	private LeaveCategoryManagementService leaveCategoryManagementService;
	
	// 세부 휴가
	@GetMapping("/leave/leaveDetail")
	public LeaveDetail getleaveDetail(String leaveDetailCode) {
		System.out.println("LeaveCategoryController.getleaveDetail [GET] 메소드 실행");
		System.out.println("LeaveCategoryController.getleaveDetail [GET] leaveDetailCode : "+leaveDetailCode);
		return leaveCategoryManagementService.getLeaveDetail(leaveDetailCode);
	}
	// 휴가 정책
	@GetMapping("/leave/leavePolicy")
	public LeavePolicy getleavePolicy(String leavePolicyCode) {
		System.out.println("LeaveCategoryController.getleavePolicy [GET] 메소드 실행");
		System.out.println("LeaveCategoryController.getleavePolicy [GET] leavePolicyCode : "+leavePolicyCode);
		return leaveCategoryManagementService.getLeavePolicy(leavePolicyCode);
	}
	
}
