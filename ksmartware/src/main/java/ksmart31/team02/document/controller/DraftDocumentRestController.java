package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team02.document.domain.ApprovalFile;
import ksmart31.team02.document.domain.ApprovalOpinion;
import ksmart31.team02.document.service.DraftDocumentService;

@RestController
public class DraftDocumentRestController {
	@Autowired private DraftDocumentService draftDocumentService;
	
	// 기안시 첨부파일목록
	@GetMapping("/member/approvalFileList")
	public List<ApprovalFile> getApprovalFileList() {
		System.out.println("[DraftDocumentRestController] getApprovalFileList() 실행");
		
		List<ApprovalFile> list = draftDocumentService.getApprovalFile();
		System.out.println("[DraftDocumentRestController] getApprovalFileList() list:"+list);
		
		return list;
	}
	
	// 기안시 의견 등록
	@PostMapping("/member/addApprovalOpinion")
	public void addApprovalOpinion(ApprovalOpinion approvalOpinion) {
		System.out.println("[DraftDocumentRestController] addApprovalOpinion() 실행");
		System.out.println("[DraftDocumentRestController] addApprovalOpinion() approvalOpinion:"+approvalOpinion);
		
		//draftDocumentService.addApprovalOpinion(approvalOpinion);
	}
	
	// 기안시 의견목록
	@GetMapping("/member/approvalOpinionList")
	public List<ApprovalOpinion> getApprovalOpinionList() {
		System.out.println("[DraftDocumentRestController] getApprovalOpinionList() 실행");
		
		List<ApprovalOpinion> list = draftDocumentService.getApprovalOpinion();
		System.out.println("[DraftDocumentRestController] getApprovalOpinionList() list:"+list);
		
		return list;
	}
}
