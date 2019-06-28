package ksmart31.team01.department.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.department.service.DepartmentService;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;		
	//조직도 리스트
	@GetMapping(value="/department/departmentView")
	public String getDepartmentList(Model model,String departmentName) {		
		System.out.println(departmentName + "DepartmentController getDepartmentList [GET] departmentName");
		Map<String,Object> returnMap = departmentService.getDepartmentList(departmentName);	
		// 데이터를 html로 뿌려주기 위해 model로 묶는다
		model.addAttribute("recursiveList", returnMap.get("recursiveList"));		
		model.addAttribute("departmentJoinMemberList", returnMap.get("departmentJoinMemberList"));
		return "/department/departmentView";		
	}	
}
