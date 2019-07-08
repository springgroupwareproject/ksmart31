package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.domain.DocumentFormCategory;
import ksmart31.team03.leave.domain.LeaveCategory;
import ksmart31.team03.leave.domain.LeaveDetail;
import ksmart31.team03.leave.domain.LeaveHistory;

@Mapper
public interface DocumentFormMapper {
	// 세부 휴가 전체 조회
	public List<LeaveDetail> selectLeaveDetailList();

	// 휴가 잔여일 조회
	public List<LeaveHistory> selectLeaveHistoryByMemberId(String memberId);
	
	// 전체 문서양식 목록
	public List<DocumentForm> selectDocumentForm();
	
	// 카테고리별 문서양식 목록
	public List<DocumentForm> selectDocumentFormByCategory(String documentFormCategoryCode);
	
	// 공통양식 카테고리 목록
	public List<DocumentFormCategory> selectDocumentFormCategory();
}
