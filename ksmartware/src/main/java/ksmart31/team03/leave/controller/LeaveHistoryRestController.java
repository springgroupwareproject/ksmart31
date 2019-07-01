package ksmart31.team03.leave.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team03.leave.domain.LeaveGrant;
import ksmart31.team03.leave.domain.LeaveGrantAndUsed;
import ksmart31.team03.leave.domain.LeaveHistory;
import ksmart31.team03.leave.domain.LeaveUsed;
import ksmart31.team03.leave.service.LeaveHistoryManagementService;

@RestController
public class LeaveHistoryRestController {
	@Autowired
	private LeaveHistoryManagementService leaveHistoryManagementService;
	
	// 조직도 조회
	@GetMapping("/leave/leaveHistoryByMemberIdList")
	public List<LeaveHistory> getleaveHistoryByMemberIdList(@RequestParam(required = false) String departmentName){
		System.out.println("LeaveHistoryRestController.getleaveHistoryByMemberIdList departmentName : "+departmentName);
		return leaveHistoryManagementService.getleaveHistoryByMemberIdList(departmentName);
	}
	
	// 조직원 한 명의 상세 휴가 내역 조회
	@GetMapping("/leave/leaveHistoryByMemberId")
	public Map<String, Object> getLeaveHistoryByMemberId(@RequestParam(required = false) String leaveCategorySort, String memberId){
		System.out.println("LeaveHistoryRestController.getLeaveHistoryByMemberId [GET] leaveCategorySort : "+leaveCategorySort);
		System.out.println("LeaveHistoryRestController.getLeaveHistoryByMemberId [GET] memberId : "+memberId);
		// 조직원 아이디별 휴가 부여 내역 조회
		List<LeaveGrant> leaveGrantList = leaveHistoryManagementService.getLeaveGrantByMemberId(memberId, leaveCategorySort);
		System.out.println("LeaveHistoryRestController.getLeaveHistoryByMemberId [GET] leaveGrantList : "+leaveGrantList);
		// 조직원 아이디별 휴가 사용 내역 조회
		List<LeaveUsed> leaveUsedList = leaveHistoryManagementService.getLeaveUsedByMemberId(memberId, leaveCategorySort);
		System.out.println("LeaveHistoryRestController.getLeaveHistoryByMemberId [GET] leaveUsedList : "+leaveUsedList);
		// 조직원 아이디별 휴가 부여일, 사용일 합산 조회
		LeaveGrantAndUsed totalLeaveGrantAndUsed = leaveHistoryManagementService.getTotalLeaveGrantAndUsed(memberId, leaveCategorySort);
		System.out.println("LeaveHistoryRestController.getLeaveHistoryByMemberId [GET] totalLeaveGrantAndUsed : "+totalLeaveGrantAndUsed);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("leaveGrantList", leaveGrantList);
		resultMap.put("leaveUsedList", leaveUsedList);
		resultMap.put("totalLeaveGrantAndUsed", totalLeaveGrantAndUsed);
		return resultMap;
	}
}
