package ksmart31.team02lsj.document.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team02lsj.document.domain.ApprovalDocument;
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
	//문서관리 상세보기(구매요청서)
	@GetMapping(value = "/documentManagement/detail")
	public String documentManagementList(Model model, @RequestParam(value = "draftDocumentCode")String draftDocumentCode
											, @RequestParam(value = "documentForm") String documentForm) {
		String path = null;
		System.out.println("(C)documentApprovalManagement");
		 Map<String, Object> documentDetailMap = documentManagementService.documentManagementDetail(draftDocumentCode);
		 model.addAttribute("approvalDocumentDetailMap", documentDetailMap);
		/* 맵에서 리스트 꺼내서 리스트별로 포워딩 주소(리턴값) 다르게 만들기 */
		 if(documentDetailMap != null) {  
			 path= "admin/documentManagement/documentManagement";
		 }
		return path;
	}

}
