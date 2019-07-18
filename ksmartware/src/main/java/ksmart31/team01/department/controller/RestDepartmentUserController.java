package ksmart31.team01.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.department.domain.DepartmentJoinMember;
import ksmart31.team01.department.service.DepartmentService;
import ksmart31.team01.member.domain.Member;

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
	//getMemberId
	@GetMapping("/department/getMemberId")
	public List<Member> getMemberId(){
		List<Member> list = departmentService.getMemberId();
		System.out.println(list + "RestDepartmentAdminController getMemberId list");
		return list;
	}
	/*
	 * //getMemberIdMemberNameDepartmentName
	 * 
	 * @GetMapping("/getMemberIdMemberNameDepartmentName") public Member
	 * getMemberIdMemberNameDepartmentName(String memberId, String memberName,
	 * String departmentName) { System.out.println(memberId +
	 * "RestDepartmentAdminController getMemberIdMemberNameDepartmentName memberId"
	 * ); System.out.println(memberName +
	 * "RestDepartmentAdminController getMemberIdMemberNameDepartmentName memberName"
	 * ); System.out.println(departmentName +
	 * "RestDepartmentAdminController getMemberIdMemberNameDepartmentName departmentName"
	 * ); Member member =
	 * departmentService.getMemberIdMemberNameDepartmentName(memberId, memberName,
	 * departmentName); System.out.println(member +
	 * "RestDepartmentAdminController getMemberIdMemberNameDepartmentName member");
	 * return member; }
	 */	
}
