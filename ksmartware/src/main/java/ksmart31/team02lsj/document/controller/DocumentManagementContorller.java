package ksmart31.team02lsj.document.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team02lsj.document.domain.ApprovalDocument;
import ksmart31.team02lsj.document.service.DocumentManagementService;

@Controller
public class DocumentManagementContorller {
	@Autowired
	DocumentManagementService documentManagementService;
	
	@GetMapping(value = "/documentApprovalManagement")
	public String documentApprovalManagement(Model model) {
		System.out.println("(C)documentApprovalManagement");
		List<ApprovalDocument> approvalDocumentList = null;
		/*
		 * if(approvalDocumentcode != null) { approvalDocumentDetailMap =
		 * documentManagementService.documentApprovalDetail(approvalDocumentcode);
		 * model.addAttribute("approvalDocumentDetailMap", approvalDocumentDetailMap); }
		 */
		approvalDocumentList = documentManagementService.documentApprovalList();
		model.addAttribute("approvalDocumentList", approvalDocumentList);
		
		return "admin/documentManagement/documentApprovalManagement";			
	}

}
