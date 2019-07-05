package ksmart31.team03.leave.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team03.leave.domain.LeaveCategory;

@Mapper
public interface LeaveCategoryMapper {
	// 휴가 종류 입력
	public void insertLeaveCategory(LeaveCategory leaveCategory);
	// 휴가 종류 리스트 조회
	public List<LeaveCategory> selectLeaveCategoryList();
	
}
