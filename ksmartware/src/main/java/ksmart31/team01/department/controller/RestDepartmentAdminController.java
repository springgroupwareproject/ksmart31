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
import ksmart31.team01.member.domain.MemberAcademy;
import ksmart31.team01.member.domain.MemberAwards;
import ksmart31.team01.member.domain.MemberCareer;
import ksmart31.team01.member.domain.MemberEducation;
import ksmart31.team01.member.domain.MemberLicense;
import ksmart31.team01.member.domain.MemberPosition;
import ksmart31.team01.member.domain.MemberProject;

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
	@GetMapping("/getMemberMyProfile")
	public Member getMemberMyProfile(String memberId){ 		 
		Member member = departmentService.getMemberMyProfile(memberId);
		System.out.println(member + "RestDepartmentAdminController getMemberMyProfile member");
		return member;
	}
	//memberInfo select
	@GetMapping("/getMemberMyInfo")
	public Member getMemberMyInfo(String memberId) {	
		Member member = departmentService.getMemberMyInfo(memberId);
		System.out.println(member + "RestDepartmentAdminController getMemberMyInfo member");
		return member;
	}	
	//memberEducation select
	@GetMapping("/getMemberMyEducation")
	public List<MemberEducation> getMemberMyEducation(String memberId){
		List<MemberEducation> list = departmentService.getMemberMyEducation(memberId);
		System.out.println(list + "RestDepartmentAdminController getMemberMyEducation list");
		return list;
	}
	//memberProject select
	@GetMapping("/getMemberMyProject")
	public List<MemberProject> getMemberMyProject(String memberId){
		List<MemberProject> list = departmentService.getMemberMyProject(memberId);
		System.out.println(list + "RestDepartmentAdminController getMemberMyProject list");
		return list;
	}
	//getMemberMyLicense
	@GetMapping("/getMemberMyLicense")
	public List<MemberLicense> getMemberMyLicense(String memberId){
		List<MemberLicense> list = departmentService.getMemberMyLicense(memberId);
		System.out.println(list + "RestDepartmentAdminController getMemberMyLicense list");
		return list;
	}
	//getMemberMyAcademy
	@GetMapping("/getMemberMyAcademy")
	public List<MemberAcademy> getMemberMyAcademy(String memberId){
		List<MemberAcademy> list = departmentService.getMemberMyAcademy(memberId);
		System.out.println(list + "RestDepartmentAdminController getMemberMyAcademy list");
		return list;
	}
	//getMemberMyCareer
	@GetMapping("/getMemberMyCareer")
	public List<MemberCareer> getMemberMyCareer(String memberId){
		List<MemberCareer> list = departmentService.getMemberMyCareer(memberId);
		System.out.println(list + "RestDepartmentAdminController getMemberMyCareer list");
		return list;
	}
	//getMemberMyAwards
	@GetMapping("/getMemberMyAwards")
	public List<MemberAwards> getMemberMyAwards(String memberId){
		List<MemberAwards> list = departmentService.getMemberMyAwards(memberId);
		System.out.println(list + "RestDepartmentAdminController getMemberMyAwards list");
		return list;
	}
	
}
