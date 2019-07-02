package ksmart31.team02lsj.document.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team02lsj.document.domain.DraftDocument;
import ksmart31.team02lsj.document.service.DocumentManagementService;

@Controller
public class DocumentManagementContorller {
	@Autowired
	DocumentManagementService documentManagementService;
	//문서관리 리스트
	@GetMapping(value = "/documentManagement")
	public String documentManagementList(Model model) {
		System.out.println("(C)documentApprovalManagement");
		List<DraftDocument> documentManagementList = null;
		documentManagementList = documentManagementService.draftDocumentList();
		model.addAttribute("documentManagementList", documentManagementList);
		
		return "admin/documentManagement/documentManagement";			
	}
	//문서관리 상세보기
	@GetMapping(value = "/documentManagement/detail")
	public String documentManagementList(Model model, @RequestParam(value = "draftDocumentCode")String draftDocumentCode) {
		System.out.println("(C)documentApprovalManagement");
		 Map<String, Object> documentDetailMap = documentManagementService.documentManagementDetail(draftDocumentCode);
		 model.addAttribute("approvalDocumentDetailMap", documentDetailMap);
		
		return "admin/documentManagement/documentManagement";			
	}

}
