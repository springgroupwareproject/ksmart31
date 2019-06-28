package ksmart31.team03.leave.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team03.leave.domain.LeaveGrant;
import ksmart31.team03.leave.domain.LeaveGrantAndUsed;

@Mapper
public interface LeaveGrantMapper {
	// 조직원 아이디별 휴가 부여 내역 조회
	public List<LeaveGrant> selectLeaveGrantByMemeberId(Map<String, Object> paramMap);
	
	// 조직원 아이디별 휴가 부여일 합산 조회
	public LeaveGrantAndUsed selectTotalLeaveGrantByMemberId(Map<String, Object> paramMap);
}
