package ksmart31.team03.leave.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.member.domain.Member;
import ksmart31.team03.leave.domain.LeaveGrant;
import ksmart31.team03.leave.domain.LeaveGrantAndUsed;
import ksmart31.team03.leave.domain.LeaveUsed;
import ksmart31.team03.leave.service.LeaveMyPageService;

@RestController
public class LeaveMyPageRestController {
	@Autowired
	private LeaveMyPageService leaveMyPageService;
	
	// 나의 휴가 내역 비동기 요청
	@GetMapping("/leave/leaveMyHistory")
	public Map<String, Object> getLeaveMyHistory(HttpSession session, @RequestParam(required = false) String leaveCategorySort){
		System.out.println("LeaveMyPageRestController.getLeaveMyHistory [GET] leaveCategorySort : "+leaveCategorySort);
		Member loginMember = (Member) session.getAttribute("loginMember");
		System.out.println("LeaveMyPageRestController.getLeaveMyHistory [GET] loginMember : "+loginMember);
		// 조직원 아이디별 휴가 부여 내역 조회
		List<LeaveGrant> leaveGrantList = leaveMyPageService.getLeaveGrantByMemberId(loginMember.getMemberId(), leaveCategorySort);
		System.out.println("LeaveMyPageRestController.getLeaveMyHistory [GET] leaveGrantList : "+leaveGrantList);
		// 조직원 아이디별 휴가 사용 내역 조회
		List<LeaveUsed> leaveUsedList = leaveMyPageService.getLeaveUsedByMemberId(loginMember.getMemberId(), leaveCategorySort);
		System.out.println("LeaveMyPageRestController.getLeaveMyHistory [GET] leaveUsedList : "+leaveUsedList);
		// 조직원 아이디별 휴가 부여일, 사용일 합산 조회
		LeaveGrantAndUsed totalLeaveGrantAndUsed = leaveMyPageService.getTotalLeaveGrantAndUsed(loginMember.getMemberId(), leaveCategorySort);
		System.out.println("LeaveMyPageRestController.getLeaveMyHistory [GET] totalLeaveGrantAndUsed : "+totalLeaveGrantAndUsed);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("leaveGrantList", leaveGrantList);
		resultMap.put("leaveUsedList", leaveUsedList);
		resultMap.put("totalLeaveGrantAndUsed", totalLeaveGrantAndUsed);
		return resultMap;
	}
}
