package ksmart31.team01.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.department.domain.DepartmentJoinMember;
import ksmart31.team01.department.service.DepartmentService;

@RestController
public class RestDepartmentUserController {
	@Autowired
	private DepartmentService departmentService;
	//memberid로 조회한 결과를 뿌려준다
	@GetMapping(value="/getDepartmentJoinMemberListByMemberId")
	public List<DepartmentJoinMember> getDepartmentJoinMemberListByMemberId(String memberId){
		System.out.println(memberId + "RestDepartmentUserController getDepartmentJoinMemberListByMemberId memberId");		
		List<DepartmentJoinMember> departmentJoinMemberListByMemberIdList = departmentService.getDepartmentJoinMemberListByMemberId(memberId);
		System.out.println(departmentJoinMemberListByMemberIdList + "RestDepartmentUserController getDepartmentJoinMemberListByMemberId departmentJoinMemberListByMemberIdList");
		return departmentJoinMemberListByMemberIdList;
	}
}
