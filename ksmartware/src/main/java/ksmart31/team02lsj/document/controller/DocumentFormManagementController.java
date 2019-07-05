package ksmart31.team02lsj.document.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team02lsj.document.domain.DocumentForm;
import ksmart31.team02lsj.document.service.DocumentFormManagementService;

//워크플로우 데이터관리(관리자) (문서양식별 문서관리) 
@Controller
public class DocumentFormManagementController {
	@Autowired
	DocumentFormManagementService documentFormManagementService;

	@GetMapping(value = "/documentFormManagement")
	public String documentFormList(
			@RequestParam(value = "documentFormCategory", required = false) String documentFormCategory,
			@RequestParam(value = "documentForm", required = false) String documentForm,
			@RequestParam(value = "draftDocumentCode", required = false) String draftDocumentCode, Model model) {
		System.out.println("(C)get documentFormManagement(문서양식별 문서관리)");
		Map<String, Object> documentFormManagementMap = new HashMap<String, Object>();
		List<DocumentForm> documentFormList = null;
		Map<String, Object> approvalDocumentListMap = null;
		documentFormList = documentFormManagementService.documentFormList(); 
		if (documentFormCategory != null) { /* 문서 카테고리 */
			documentFormList = documentFormManagementService.documentFormListByCategory(documentFormCategory); 																												
			documentFormManagementMap.put("documentFormList", documentFormList);
		}
		if (documentForm != null) { /* 문서양식클릭시 */
			approvalDocumentListMap = documentFormManagementService.approvalDocumentListBydocumentForm(documentForm);
			documentFormManagementMap.put("documentFormList", approvalDocumentListMap);
			}
		model.addAttribute("documentFormManagementMap", documentFormManagementMap);
		if (draftDocumentCode != null) { /* 문서상세보기 클릭시 */
			
		}

		return "/admin/documentManagement/documentDataManagement.html";
	}

}
