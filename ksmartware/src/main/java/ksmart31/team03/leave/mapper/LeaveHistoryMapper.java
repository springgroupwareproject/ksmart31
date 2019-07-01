package ksmart31.team03.leave.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.department.domain.Department;
import ksmart31.team03.leave.domain.LeaveHistory;

@Mapper
public interface LeaveHistoryMapper {
	// 조직원 아이디별 휴가 내역 조회
	public List<LeaveHistory> selectLeaveHistoryByMemberId(String memberId);
	// 조직도 리스트
	public List<Department> selectDepartmentList();
	// department부서명과 member조직원 기본정보를 조인
	public String[] selectDepartmentJoinMemberListForLeaveHistory(Map<String, Object> map);
	// 특정 부서에 해당하는 조직원 휴가 내역 조회
	public List<LeaveHistory> selectLeaveHistoryByMemberList(Map<String, Object> memberIdMap);
}
