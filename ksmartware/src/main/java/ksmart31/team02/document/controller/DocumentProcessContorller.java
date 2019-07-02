package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team02.document.domain.ApprovalProcess;
import ksmart31.team02.document.domain.DocumentFormCategory;
import ksmart31.team02.document.mapper.DocumentFormMapper;
import ksmart31.team02.document.service.DocumentProcessService;

@Controller
public class DocumentProcessContorller {
	@Autowired private DocumentProcessService documentProcessService;
	@Autowired private DocumentFormMapper documentFormMapper;
	
	// 관리자 결재선 관리(공통프로세스 목록)
	@GetMapping("/documentProcessManagement")
	public String getApprovalProcess(Model model) {
		System.out.println("(C) getApprovalProcess() 실행");
		List<ApprovalProcess> list = documentProcessService.getApprovalProcess();
		System.out.println("(C) getApprovalProcess() list : "+list);
		model.addAttribute("list",list);
		return "admin/documentManagement/documentProcessManagement";
	}
	
	// 공통양식 카테고리 목록
	@GetMapping("/admin/documentManagement/documentFormManagement")
	public String getDocumentFormManagement(Model model) {
		System.out.println("(C) getDocumentFormManagement() 실행");
		List<DocumentFormCategory> list = documentFormMapper.selectDocumentFormCategory();
		System.out.println("(C) getDocumentFormManagement() list : "+list);
		model.addAttribute("list",list);
		return "admin/documentManagement/documentFormManagement";
	}

}
