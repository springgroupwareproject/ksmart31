package ksmart31.team03.leave.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.department.domain.DepartmentJoinMember;
import ksmart31.team03.leave.domain.LeaveCategory;
import ksmart31.team03.leave.domain.LeaveDetail;
import ksmart31.team03.leave.domain.LeaveGrant;
import ksmart31.team03.leave.domain.LeaveGrantAndUsed;
import ksmart31.team03.leave.domain.LeaveHistory;
import ksmart31.team03.leave.domain.LeaveUsed;
import ksmart31.team03.leave.service.LeaveHistoryManagementService;

@RestController
public class LeaveHistoryRestController {
	@Autowired
	private LeaveHistoryManagementService leaveHistoryManagementService;
	
	// 휴가 차감
	@PostMapping("/leave/leaveUsed")
	public void addLeaveUsed(LeaveUsed leaveUsed) {
		System.out.println("LeaveHistoryRestController.addLeaveGrant leaveUsed : "+leaveUsed);
		leaveHistoryManagementService.addLeaveUsed(leaveUsed);
	}
	// 휴가 부여
	@PostMapping("/leave/leaveGrant")
	public void addLeaveGrant(LeaveGrant leaveGrant) {
		System.out.println("LeaveHistoryRestController.addLeaveGrant leaveGrant : "+leaveGrant);
		leaveHistoryManagementService.addLeaveGrant(leaveGrant);
	}
	// 특정 부서에 해당하는 조직원 정보 조회
	@GetMapping("/leave/departmentJoinMember")
	public List<DepartmentJoinMember> getDepartmentJoinMember(String departmentName){
		return leaveHistoryManagementService.getDepartmentJoinMember(departmentName);
	}
	// 디테일 코드 별 세부 휴가 정보
	@GetMapping("/leave/leaveDetailByDetailCode")
	public LeaveDetail getLeaveDetailByDetailCode(String detailCode) {
		System.out.println("LeaveHistoryRestController.getLeaveDetailByDetailCode [GET] detailCode : "+detailCode);
		return leaveHistoryManagementService.getLeaveDetailByDetailCode(detailCode);
	}
	// 세부 휴가 조회
	@GetMapping("/leave/leaveDetailList")
	public List<LeaveDetail> getLeaveDetailList(){
		return leaveHistoryManagementService.getLeaveDetailList();
	}
	// 휴가 종류 조회
	@GetMapping("/leave/leaveCategoryList")
	public List<LeaveCategory> getLeaveCategoryList(){
		return leaveHistoryManagementService.getLeaveCategoryList();
	}
	// 조직도 조회
	@GetMapping("/leave/leaveHistoryByMemberIdList")
	public List<LeaveHistory> getLeaveHistoryByMemberIdList(@RequestParam(required = false) String departmentName){
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
