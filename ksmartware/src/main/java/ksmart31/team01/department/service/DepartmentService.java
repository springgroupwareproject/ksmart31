package ksmart31.team01.department.service;

import java.util.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.department.mapper.DepartmentMapper;
import ksmart31.team01.department.domain.Department;
import ksmart31.team01.department.domain.DepartmentJoinMember;

@Service
@Transactional
public class DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;		
	//조직도 departmentView.html
	public Map<String, Object> getDepartmentList(String departmentName){
		//재귀쿼리 사용한 departmentName 조직도 조회 리스트
		List<Department> recursiveList = departmentMapper.selectDepartmentList();
		System.out.println(recursiveList +"DepartmentService getDepartmentList recursiveList");		
		// StringUtils.countMatches() -> departmentName중에 -가 포함되어있는 갯수를 보여준다
		int departmentNumber = StringUtils.countMatches(departmentName, "-");
		System.out.println("DepartmentService getDepartmentList departmentNumber -갯수 : " + departmentNumber);
		// replaceAll()메서드로 -가 포함된문자열을 없애준다 		
		if(departmentName != null){	
			departmentName = departmentName.replaceAll("-","");
			System.out.println("DepartmentService getDepartmentList departmentName -제거 확인 : " + departmentName);
		}
		// 2개 이상의 데이터를 하나로 넘기기 위해 HashMap 사용
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("departmentName", departmentName);
		map.put("departmentNumber", departmentNumber);		
		//department부서명  member조직원 기본 정보 조인	
		List<DepartmentJoinMember> departmentJoinMemberList = departmentMapper.selectDepartmentJoinMemberList(map);		
		System.out.println(departmentJoinMemberList + "DepartmentService getDepartmentList departmentJoinMemberList");
		// 2개 이상의 데이터를 하나로 넘기기 위해 HashMap 사용	
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("recursiveList", recursiveList);		
		returnMap.put("departmentJoinMemberList", departmentJoinMemberList);
		return returnMap;
	}	
	
}	
