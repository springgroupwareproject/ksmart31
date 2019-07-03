package ksmart31.team01.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.department.domain.Department;
import ksmart31.team01.department.service.DepartmentService;
import ksmart31.team01.member.domain.Member;

@RestController
public class RestDepartmentAdminController {
	@Autowired
	private DepartmentService departmentService;
	//member insert
	@PostMapping(value="addMember")
	public void addMember(Member member) {
		departmentService.addMember(member);
	}
	//departmentName selectList
	@GetMapping(value="getDepartmentNameList")
	public List<Department> getDepartmentNameList(String departmentName){
		List<Department> list = departmentService.getDepartmentNameList(departmentName);
		return list;
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
		
}
