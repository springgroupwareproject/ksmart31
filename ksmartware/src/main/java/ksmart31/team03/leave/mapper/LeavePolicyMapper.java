package ksmart31.team03.leave.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team03.leave.domain.LeavePolicy;

@Mapper
public interface LeavePolicyMapper {
	// 카테고리 코드별 휴가 정책 리스트 조회 
	public List<LeavePolicy> selectLeavePolicyList(String leaveCategoryCode);
	
	// 휴가 코드별 휴가 정책 데이터 조회
	public LeavePolicy selectLeavePolicy(String leavePolicyCode);
}
