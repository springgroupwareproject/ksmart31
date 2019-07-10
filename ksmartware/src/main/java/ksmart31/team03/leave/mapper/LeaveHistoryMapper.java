package ksmart31.team03.leave.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.department.domain.Department;
import ksmart31.team01.department.domain.DepartmentJoinMember;
import ksmart31.team01.member.domain.Member;
import ksmart31.team03.leave.domain.LeaveHistory;

@Mapper
public interface LeaveHistoryMapper {
	// 관리자 - 휴가 부여
	public void insertLeaveGrant(Map<String, Object> memberMap);
	// leave_grant_code 최대값+1 조회
	public int selecMaxOfLeaveGrantCode();
	// 부여 및 차감에서 선택된 조직원들의 기본 정보(사번, 이름, 부서명, 직위/직책)를 조회
	public List<Member> selectMemberInfoList(Map<String, Object> memberIdList);
	// 특정 부서에 해당하는 조직원 정보
	public List<DepartmentJoinMember> selectDepartmentJoinMemberList(Map<String, Object> map);
	// 조직원 아이디별 휴가 내역 조회
	public List<LeaveHistory> selectLeaveHistoryByMemberId(String memberId);
	// 조직도 리스트
	public List<Department> selectDepartmentList();
	// department부서명과 member조직원 기본정보를 조인
	public String[] selectDepartmentJoinMemberListForLeaveHistory(Map<String, Object> map);
	// 특정 부서에 해당하는 조직원 휴가 내역 조회
	public List<LeaveHistory> selectLeaveHistoryByMemberList(Map<String, Object> memberIdMap);
}
