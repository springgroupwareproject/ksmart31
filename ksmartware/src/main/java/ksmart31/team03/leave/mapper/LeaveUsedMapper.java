package ksmart31.team03.leave.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team03.leave.domain.LeaveGrantAndUsed;
import ksmart31.team03.leave.domain.LeaveUsed;

@Mapper
public interface LeaveUsedMapper {
	// 조직원 아이디별 휴가 사용 내역 조회
	public List<LeaveUsed> selectLeaveUsedByMemberId(Map<String, Object> paramMap);
	// 조직원 아이디별 휴가 부여일 합산 조회
	public LeaveGrantAndUsed selectTotalLeaveUsedByMemberId(Map<String, Object> paramMap);
}
