package ksmart31.team01.department.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.department.domain.Department;
import ksmart31.team01.department.service.DepartmentService;
import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberPosition;

@RestController
public class RestDepartmentAdminController {
	@Autowired
	private DepartmentService departmentService;
	//member insert
	@PostMapping(value="addMember")
	public void addMember(Member member) {
		departmentService.addMember(member);
	}
	//departmentName select
	@GetMapping(value="getDepartmentName")
	public List<Department> getDepartmentName(){
		List<Department> list = departmentService.getDepartmentName();
		return list;
	}
	//getDepartmentCategoryName select
	@GetMapping(value="getDepartmentCategoryName")
	public List<Department> getDepartmentCategoryName(){
		List<Department> list = departmentService.getDepartmentCategoryName();
		return list;
	}
	//getDepartmentDivisionName select
	@GetMapping(value="getDepartmentDivisionName")
	public List<Department> getDepartmentDivisionName(){
		List<Department> list = departmentService.getDepartmentDivisionName();
		return list;
	}
	//getDepartmentSectionName select
	@GetMapping(value="getDepartmentSectionName")
	public List<Department> getDepartmentSectionName(){
		List<Department> list = departmentService.getDepartmentSectionName();
		return list;
	}
	//memberPositonName select
	@GetMapping(value="getMemberPositon")
	public List<MemberPosition> getMemberPositon(){
		List<MemberPosition> list = departmentService.getMemberPositon();
		return list;
	}
	//memberProfile select
	@GetMapping("/getmemberMyProfile")
	public Member getmemberMyProfile(String memberId){ 		 
		Member member = departmentService.getmemberMyProfile(memberId);
		System.out.println(member + "RestDepartmentAdminController getmemberMyProfile member");
		return member;
	}
	//memberInfo select
	@GetMapping("/getmemberMyInfo")
	public Member getmemberMyInfo(String memberId) {	
		Member member = departmentService.getmemberMyInfo(memberId);
		System.out.println(member + "RestDepartmentAdminController getmemberMyInfo member");
		return member;
	}	
}
