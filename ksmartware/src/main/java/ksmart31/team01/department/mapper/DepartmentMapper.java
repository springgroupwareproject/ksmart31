package ksmart31.team01.department.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.department.domain.Department;
import ksmart31.team01.department.domain.DepartmentJoinMember;

@Mapper
public interface DepartmentMapper {
	//조직도 리스트
	public List<Department> selectDepartmentList();
	//department부서명과 member조직원 기본정보를 조인
	public List<DepartmentJoinMember> selectDepartmentJoinMemberList(Map<String, Object> map);
	
	
	
}
