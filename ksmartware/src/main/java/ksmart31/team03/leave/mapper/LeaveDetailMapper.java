package ksmart31.team03.leave.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team03.leave.domain.LeaveDetail;

@Mapper
public interface LeaveDetailMapper {
	// 세부 휴가 전체 조회
	public List<LeaveDetail> selectLeaveDetailList();
	// 세부 휴가 입력
	public void insertLeaveDetail(LeaveDetail leaveDetail);
	// 카테고리 코드별 상세 휴가 리스트 조회
	public List<LeaveDetail> selectLeaveDetailListByCategoryCode(String leaveCategoryCode);
	// 디테일 코드별 상세 휴가 데이터 조회
	public LeaveDetail selectLeaveDetail(String leaveDetailCode);
}
