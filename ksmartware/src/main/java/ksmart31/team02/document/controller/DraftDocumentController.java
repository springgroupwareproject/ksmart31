package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team02.document.domain.ApprovalDocument;
import ksmart31.team02.document.domain.DraftDocument;
import ksmart31.team02.document.service.DraftDocumentService;

@Controller
public class DraftDocumentController {
	@Autowired private DraftDocumentService draftDocumentService;
	
	// 최근 승인 문서 목록
	@GetMapping("/member/draftDocument/lastestApprovalDocumentList")
	public String getLastestApprovalDocumentList(Model model) {
		System.out.println("[DraftDocumentController] getLastestApprovalDocumentList() 실행");
		
		// 쿼리실행결과 콘솔창에 확인
		List<ApprovalDocument> list = draftDocumentService.getLastestApprovalDocument();
		System.out.println("[DraftDocumentController] getTemporaryDocumentList() list:"+list);
		
		// 쿼리실행결과를 model에 할당
		model.addAttribute("list",list);
		return "/member/draftDocument/lastestApprovalDocumentList";
	}
	
	// 임시저장문서목록
	@GetMapping("/member/draftDocument/temporaryDocumentList")
	public String getTemporaryDocumentList(Model model) {
		System.out.println("[DraftDocumentController] getTemporaryDocumentList() 실행");
		
		// 쿼리실행결과 콘솔창에 확인
		List<DraftDocument> list = draftDocumentService.getTemporaryDocumentList();
		System.out.println("[DraftDocumentController] getTemporaryDocumentList() list:"+list);
		
		// 쿼리실행결과를 model에 할당
		model.addAttribute("list",list);
		
		return "/member/draftDocument/temporaryDocumentList";
	}
}
