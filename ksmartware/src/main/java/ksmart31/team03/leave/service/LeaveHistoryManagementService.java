package ksmart31.team03.leave.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.department.domain.Department;
import ksmart31.team01.department.domain.DepartmentJoinMember;
import ksmart31.team01.member.domain.Member;
import ksmart31.team03.leave.domain.LeaveCategory;
import ksmart31.team03.leave.domain.LeaveDetail;
import ksmart31.team03.leave.domain.LeaveGrant;
import ksmart31.team03.leave.domain.LeaveGrantAndUsed;
import ksmart31.team03.leave.domain.LeaveHistory;
import ksmart31.team03.leave.domain.LeaveUsed;
import ksmart31.team03.leave.mapper.LeaveCategoryMapper;
import ksmart31.team03.leave.mapper.LeaveDetailMapper;
import ksmart31.team03.leave.mapper.LeaveGrantMapper;
import ksmart31.team03.leave.mapper.LeaveHistoryMapper;
import ksmart31.team03.leave.mapper.LeaveUsedMapper;

@Service
@Transactional
public class LeaveHistoryManagementService {
	@Autowired
	private LeaveCategoryMapper leaveCategoryMapper;
	
	@Autowired
	private LeaveHistoryMapper leaveHistoryMapper;
	
	@Autowired
	private LeaveGrantMapper leaveGrantMapper;
	
	@Autowired
	private LeaveUsedMapper leaveUsedMapper;
	
	@Autowired
	private LeaveDetailMapper leaveDetailMapper;
	
	// 관리자 - 휴가 차감
	public void addLeaveUsed(LeaveUsed leaveUsed) {
		// 선택된 조직원의 아이디를 ',' 구분자로 분리해서 배열에 담는다
		String[] memberIdList = leaveUsed.getMemberId().split(", ");
		System.out.println("LeaveHistoryManagementService.addLeaveUsed memberIdList : "+memberIdList);
		// memberIdList 배열을 HashMap에 담는다
		Map<String, Object> memberIdMap = new HashMap<String, Object>();
		memberIdMap.put("memberIdList", memberIdList);
		// 부여 및 차감에서 선택된 조직원들의 기본 정보(사번, 이름, 부서명, 직위/직책)를 조회
		List<Member> memberInfoList = leaveHistoryMapper.selectMemberInfoList(memberIdMap);
		System.out.println("LeaveHistoryManagementService.addLeaveUsed memberInfoList : "+memberInfoList);
		// memberId 셋팅
		for (int i = 0; i < memberIdList.length; i++) {
			memberInfoList.get(i).setMemberId(memberIdList[i]);
		}
		System.out.println("LeaveHistoryManagementService.addLeaveUsed memberInfoList memberId 셋팅 후 : "+memberInfoList);
		// leave_used 테이블에 입력될 최종 값
		Map<String, Object> memberMap = new HashMap<String, Object>();
		memberMap.put("leaveUsed", leaveUsed);
		memberMap.put("memberInfoList", memberInfoList);
		// leave_used 테이블에 데이터 입력
		leaveUsedMapper.insertLeaveUsed(memberMap);
		// leave_history 테이블에 데이터 수정
		leaveHistoryMapper.updateLeaveHistoryForUsed(memberMap);
	}
	
	// 관리자 - 휴가 부여
	public void addLeaveGrant(LeaveGrant leaveGrant) {
		// 선택된 조직원의 아이디를 ',' 구분자로 분리해서 배열에 담는다
		String[] memberIdList = leaveGrant.getMemberId().split(", ");
		System.out.println("LeaveHistoryManagementService.addLeaveGrant memberIdList : "+memberIdList);
		// memberIdList 담긴 값 확인
		for (int i = 0; i < memberIdList.length; i++) {
			System.out.println("LeaveHistoryManagementService.addLeaveGrant memberIdList : "+memberIdList[i]);
		}
		// memberIdList 배열을 HashMap에 담는다
		Map<String, Object> memberIdMap = new HashMap<String, Object>();
		memberIdMap.put("memberIdList", memberIdList);
		// 부여 및 차감에서 선택된 조직원들의 기본 정보(사번, 이름, 부서명, 직위/직책)를 조회
		List<Member> memberInfoList = leaveHistoryMapper.selectMemberInfoList(memberIdMap);
		System.out.println("LeaveHistoryManagementService.addLeaveGrant memberInfoList : "+memberInfoList);
		// memberId 셋팅
		for (int i = 0; i < memberIdList.length; i++) {
			memberInfoList.get(i).setMemberId(memberIdList[i]);
		}
		System.out.println("LeaveHistoryManagementService.addLeaveGrant memberInfoList memberId 셋팅 후 : "+memberInfoList);
		// leave_grant 테이블에 입력될 최종 값
		Map<String, Object> memberMap = new HashMap<String, Object>();
		memberMap.put("leaveGrant", leaveGrant);
		memberMap.put("memberInfoList", memberInfoList);
		// leave_grant 테이블에 데이터 입력
		leaveGrantMapper.insertLeaveGrant(memberMap);
		// leave_history 테이블에 데이터 수정
		leaveHistoryMapper.updateLeaveHistoryForGrant(memberMap);
	}
			
	// 특정 부서에 해당하는 조직원 조회
	public List<DepartmentJoinMember> getDepartmentJoinMember(String departmentName){
		// StringUtils.countMatches() -> departmentName중에 -가 포함되어있는 갯수를 보여준다
		int departmentNumber = StringUtils.countMatches(departmentName, "-");
		System.out.println("LeaveHistoryManagementService.getDepartmentJoinMember departmentNumber -갯수 : " + departmentNumber);
		// replaceAll()메서드로 -가 포함된문자열을 없애준다 		
		if(departmentName != null){	
			departmentName = departmentName.replaceAll("-","");
			System.out.println("LeaveHistoryManagementService.getDepartmentJoinMember departmentName -제거 확인 : " + departmentName);
		}
		// 2개 이상의 데이터를 하나로 넘기기 위해 HashMap 사용
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("departmentName", departmentName);
		map.put("departmentNumber", departmentNumber);		
		//department부서명  member조직원 기본 정보 조인	
		return leaveHistoryMapper.selectDepartmentJoinMemberList(map);		
	}
	// 디테일 코드 별 세부 휴가 정보
	public LeaveDetail getLeaveDetailByDetailCode(String detailCode) {
		String leaveDetailCode = detailCode.substring(detailCode.lastIndexOf(",")+2);
		System.out.println("LeaveHistoryManagementService.getLeaveDetailByDetailCode leaveDetailCode : "+leaveDetailCode);
		return leaveDetailMapper.selectLeaveDetail(leaveDetailCode);
	}
	// 세부 휴가 조회
	public List<LeaveDetail> getLeaveDetailList(){
		return leaveDetailMapper.selectLeaveDetailList();
	}
	// 특정 부서에 해당하는 조직원의 휴가 내역 조회
	public List<LeaveHistory> getleaveHistoryByMemberIdList(String departmentName){	
		// StringUtils.countMatches() -> departmentName중에 -가 포함되어있는 갯수를 보여준다
		int departmentNumber = StringUtils.countMatches(departmentName, "-"); 
		System.out.println("LeaveHistoryManagementService.getleaveHistoryByMemberIdList departmentNumber -갯수 : " + departmentNumber);
		// replaceAll()메서드로 -가 포함된문자열을 없애준다 		
		if(departmentName != null){	
			departmentName = departmentName.replaceAll("-","");
			System.out.println("LeaveHistoryManagementService.getleaveHistoryByMemberIdList departmentName -제거 확인 : " + departmentName);
		}
		// 2개 이상의 데이터를 하나로 넘기기 위해 HashMap 사용
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("departmentName", departmentName);
		map.put("departmentNumber", departmentNumber);
		// 특정 부서에 해당하는  memberId 조회(휴가 내역 출력용)
		String[] memberId = leaveHistoryMapper.selectDepartmentJoinMemberListForLeaveHistory(map);		
		System.out.println("LeaveHistoryManagementService.getleaveHistoryByMemberIdList memberId.length : "+memberId.length);
		List<LeaveHistory> leaveHistoryByMemberList = new ArrayList<LeaveHistory>();
		if(memberId.length > 0) {
			// String 배열 값 확인
			for (int i=0; i<memberId.length; i++) {
				System.out.println("LeaveHistoryManagementService.getleaveHistoryByMemberIdList memberId : "+memberId[i]);
			}
			// String 배열을 ArrayList에 담고
			ArrayList<String> memberIdList = new ArrayList<String>();
			for(String item : memberId) {
				memberIdList.add(item);
			}
			System.out.println("LeaveHistoryManagementService.getleaveHistoryByMemberIdList memberIdList : "+memberIdList);
			// ArrayList를 HashMap에 담는다
			Map<String, Object> memberIdMap = new HashMap<String, Object>();
			memberIdMap.put("memberIdList", memberIdList);
			System.out.println("LeaveHistoryManagementService.getleaveHistoryByMemberIdList memberIdMap : "+memberIdMap.get("memberIdList"));
			// 특정 부서에 해당하는 조직원 휴가 내역 조회
			leaveHistoryByMemberList = leaveHistoryMapper.selectLeaveHistoryByMemberList(memberIdMap);
			System.out.println("LeaveHistoryManagementService.getleaveHistoryByMemberIdList leaveHistoryByMemberList : "+leaveHistoryByMemberList);
		}
		return leaveHistoryByMemberList;
	}	
	// 조직도 조회
	public List<Department> getDepartmentList(){
		//재귀쿼리 사용한 조직도 조회
		return leaveHistoryMapper.selectDepartmentList();
	}
	//조직도 departmentView.html
	public Map<String, Object> getDepartmentList(String departmentName){
		//재귀쿼리 사용한 departmentName 조직도 조회 리스트
		List<Department> recursiveList = leaveHistoryMapper.selectDepartmentList();
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
		List<DepartmentJoinMember> departmentJoinMemberList = leaveHistoryMapper.selectDepartmentJoinMemberList(map);		
		System.out.println(departmentJoinMemberList + "DepartmentService getDepartmentList departmentJoinMemberList");
			
		// 2개 이상의 데이터를 하나로 넘기기 위해 HashMap 사용	
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("recursiveList", recursiveList);		
		returnMap.put("departmentJoinMemberList", departmentJoinMemberList);		
		return returnMap;
	}	
	// 카테고리 리스트 조회
	public List<LeaveCategory> getLeaveCategoryList(){
		return leaveCategoryMapper.selectLeaveCategoryList();
	}
	// 조직원 아이디별 휴가 내역 조회
	public List<LeaveHistory> getLeaveHistoryByMemberId(String memberId){
		return leaveHistoryMapper.selectLeaveHistoryByMemberId(memberId);
	}
	// 조직원 아이디별 휴가 부여 내역 조회
	public List<LeaveGrant> getLeaveGrantByMemberId(String memberId, String leaveCategorySort){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("memberId", memberId);
		paramMap.put("leaveCategorySort", leaveCategorySort);
		return leaveGrantMapper.selectLeaveGrantByMemeberId(paramMap);
	}
	// 조직원 아이디별 휴가 사용 내역 조회
	public List<LeaveUsed> getLeaveUsedByMemberId(String memberId, String leaveCategorySort){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("memberId", memberId);
		paramMap.put("leaveCategorySort", leaveCategorySort);
		return leaveUsedMapper.selectLeaveUsedByMemberId(paramMap);
	}
	// 조직원 아이디별 휴가 부여일, 사용일 합산 조회
	public LeaveGrantAndUsed getTotalLeaveGrantAndUsed(String memberId, String leaveCategorySort) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("memberId", memberId);
		paramMap.put("leaveCategorySort", leaveCategorySort);
		// 부여일 조회
		LeaveGrantAndUsed totalGrant = leaveGrantMapper.selectTotalLeaveGrantByMemberId(paramMap);
		// 사용일 조회
		LeaveGrantAndUsed totalUsed = leaveUsedMapper.selectTotalLeaveUsedByMemberId(paramMap);
		// 최종 값을 담을 객체
		LeaveGrantAndUsed totalLeaveGrantAndUsed = new LeaveGrantAndUsed();
		// 부여일, 사용일 조회 결과값이 있을 경우에만 셋팅
		if(totalGrant != null || totalUsed != null) {
			int leaveTotalGrantHour = totalGrant.getLeaveTotalGrantHour();	// 부여 시간
			int leaveTotalGrantDay = totalGrant.getLeaveTotalGrantDay();	// 부여 일
			int leaveTotalUsedHour = totalUsed.getLeaveTotalUsedHour();		// 사용 시간 
			int leaveTotalUsedDay = totalUsed.getLeaveTotalUsedDay();		// 사용 일
			int leaveTotalHour = totalGrant.getLeaveTotalGrantHour() - totalUsed.getLeaveTotalUsedHour();	// 부여 시간 - 사용 시간
			int leaveTotalDay = totalGrant.getLeaveTotalGrantDay() - totalUsed.getLeaveTotalUsedDay();		// 부여 일 - 사용 일
			// 시간이 0보다 작을 경우(음수일 경우) 하루를 빼준다
			if(leaveTotalHour < 0) {
				leaveTotalHour = leaveTotalHour * -1;
				leaveTotalDay--;
			}
			totalLeaveGrantAndUsed.setLeaveTotalGrantHour(leaveTotalGrantHour);
			totalLeaveGrantAndUsed.setLeaveTotalGrantDay(leaveTotalGrantDay);
			totalLeaveGrantAndUsed.setLeaveTotalUsedHour(leaveTotalUsedHour);
			totalLeaveGrantAndUsed.setLeaveTotalUsedDay(leaveTotalUsedDay);
			totalLeaveGrantAndUsed.setLeaveTotalHour(leaveTotalHour);
			totalLeaveGrantAndUsed.setLeaveTotalDay(leaveTotalDay);
		}
		return totalLeaveGrantAndUsed;
	}
}
