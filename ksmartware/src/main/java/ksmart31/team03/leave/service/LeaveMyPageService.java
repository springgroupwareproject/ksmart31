package ksmart31.team03.leave.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team03.leave.domain.LeaveCategory;
import ksmart31.team03.leave.domain.LeaveGrant;
import ksmart31.team03.leave.domain.LeaveGrantAndUsed;
import ksmart31.team03.leave.domain.LeaveHistory;
import ksmart31.team03.leave.domain.LeaveUsed;
import ksmart31.team03.leave.mapper.LeaveCategoryMapper;
import ksmart31.team03.leave.mapper.LeaveGrantMapper;
import ksmart31.team03.leave.mapper.LeaveHistoryMapper;
import ksmart31.team03.leave.mapper.LeaveUsedMapper;

@Service
@Transactional
public class LeaveMyPageService {
	@Autowired
	private LeaveCategoryMapper leaveCategoryMapper;
	
	@Autowired
	private LeaveHistoryMapper leaveHistoryMapper;
	
	@Autowired
	private LeaveGrantMapper leaveGrantMapper;
	
	@Autowired
	private LeaveUsedMapper leaveUsedMapper;
	
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
