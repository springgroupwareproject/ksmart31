package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team02.document.domain.ApprovalOpinion;
import ksmart31.team02.document.service.DraftDocumentService;

@RestController
public class DraftDocumentRestController {
	@Autowired private DraftDocumentService draftDocumentService;
	
	// 기안시 의견목록
	@GetMapping("/member/approvalOpinionList")
	public List<ApprovalOpinion> getApprovalOpinionList() {
		System.out.println("[DraftDocumentRestController] getApprovalOpinionList() 실행");
		
		List<ApprovalOpinion> list = draftDocumentService.getApprovalOpinion();
		System.out.println("[DraftDocumentRestController] getApprovalOpinionList() list:"+list);
		
		return list;
	}
}
