package ksmart31.team03.leave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team03.leave.domain.LeaveHistory;
import ksmart31.team03.leave.service.LeaveHistoryManagementService;

@RestController
public class LeaveHistoryRestController {
	@Autowired
	private LeaveHistoryManagementService leaveHistoryManagementService;
	
	@GetMapping("/leave/leaveHistoryByMemberIdList")
	public List<LeaveHistory> getleaveHistoryByMemberIdList(@RequestParam(required = false) String departmentName){
		System.out.println("LeaveHistoryRestController.getleaveHistoryByMemberIdList departmentName : "+departmentName);
		return leaveHistoryManagementService.getleaveHistoryByMemberIdList(departmentName);
	}
}
