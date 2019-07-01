package ksmart31.team02.document.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.ApprovalProcess;
import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.domain.DocumentFormCategory;
import ksmart31.team02.document.domain.DraftDocument;
import ksmart31.team02.document.mapper.DocumentManagementMapper;

@Service
public class DocumentManagementService {
	@Autowired private DocumentManagementMapper documentManagementMapper;
	
	/*
	// 문서양식 목록(페이징)
	public Map<String, Object> getDocumentForm(int currentPage) {
		int ROW_PER_PAGE = 1;
		int beginRow = (currentPage - 1)*ROW_PER_PAGE;
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("beginRow", beginRow);
		map.put("rowPerPage", ROW_PER_PAGE);
		
		List<DocumentForm> documentFormList = documentManagementMapper.selectDocumentForm(map);
		System.out.println("(S) getDocumentForm documentFormList:"+documentFormList);
		
		int documentManagementCount = documentManagementMapper.selectDocumentFormCount();
		
		int lastPage = documentManagementCount/ROW_PER_PAGE;
		if(documentManagementCount/ROW_PER_PAGE != 0 ) {
			lastPage++;
		}
		
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("documentFormList", documentFormList);
		returnMap.put("lastPage", lastPage);
		returnMap.put("documentManagementCount", documentManagementCount);
		returnMap.put("currentPage", currentPage);
		return returnMap;
	}
	 */
	
	// 기안문서 조회(워크플로우 문서 관리)
	public List<DraftDocument> getDraftDocument() {
		System.out.println("(S) getDraftDocument() 실행");
		List<DraftDocument> list = documentManagementMapper.selectDraftDocument();
		System.out.println("(S) getDraftDocument() list : "+ list);
		return list;
	}

	// 관리자 결재선 관리(공통프로세스 목록)
	public List<ApprovalProcess> getApprovalProcess() {
		System.out.println("(S) getApprovalProcess() 실행");
		List<ApprovalProcess> list = documentManagementMapper.selectApprovalProcess();
		System.out.println("(S) getApprovalProcess() list : " + list);
		return list;
	}
}
