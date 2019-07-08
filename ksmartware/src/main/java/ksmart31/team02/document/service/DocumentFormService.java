package ksmart31.team02.document.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.domain.DocumentFormCategory;
import ksmart31.team02.document.mapper.DocumentFormMapper;
import ksmart31.team03.leave.domain.LeaveDetail;
import ksmart31.team03.leave.domain.LeaveHistory;

@Service
public class DocumentFormService {
	@Autowired private DocumentFormMapper documentFormMapper;
	
	// 휴가 종류 종류 및 잔여일 조회
	public Map<String, Object> getLeaveCategoryAndHistory(String memberId){
		System.out.println("[DocumentFormService] getLeaveCategoryAndHistory() 실행");
		// 휴가 종류 조회
		List<LeaveHistory> leaveHistory = documentFormMapper.selectLeaveHistoryByMemberId(memberId);
		// 휴가 세부 종류 조회
		List<LeaveDetail> leaveDetail = documentFormMapper.selectLeaveDetailList();
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("leaveHistory", leaveHistory);
		resultMap.put("leaveDetail", leaveDetail);
		return resultMap;
	}
	
	// 전체 문서양식 목록
	public List<DocumentForm> getDocumentFormList() {
		System.out.println("[DocumentFormService] getDocumentFormList() 실행");
		return documentFormMapper.selectDocumentForm();
	}
	
	// 카테고리별 문서양식 목록
	public List<DocumentForm> getDocumentFormByCategory(String documentFormCategoryCode) {
		System.out.println("[DocumentFormService] getDocumentFormByCategory() 실행");
		return documentFormMapper.selectDocumentFormByCategory(documentFormCategoryCode);
	}

	// 공통양식 카테고리 목록
	public List<DocumentFormCategory> getDocumentFormCategory() {
		System.out.println("[DocumentFormService] getDocumentFormCategory() 실행");
		return documentFormMapper.selectDocumentFormCategory();
	}
}
