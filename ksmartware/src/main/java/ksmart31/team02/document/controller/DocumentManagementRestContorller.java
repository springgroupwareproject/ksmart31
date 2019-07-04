package ksmart31.team02.document.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.domain.DraftDocument;
import ksmart31.team02.document.mapper.DocumentFormMapper;
import ksmart31.team02.document.mapper.DocumentManagementMapper;

@RestController
public class DocumentManagementRestContorller {
	@Autowired private DocumentManagementMapper documentManagementMapper;
	@Autowired private DocumentFormMapper documentFormMapper;
	
	// 기안문서 삭제
	@PostMapping("/removeDraftDocument")
	public void removeDraftDocument(@RequestParam(value="ck[]") String[] ck) {
		System.out.println("(C) removeDraftDocument() 실행");
		System.out.println("(C) removeDraftDocument() ck:"+ ck);
		for(String draftDocumentCode : ck) {
			DraftDocument draftDocument = new DraftDocument();
			draftDocument.setDraftDocumentCode(draftDocumentCode);
			System.out.println("(C) removeDraftDocument() draftDocumentCode:"+draftDocumentCode);
			documentManagementMapper.deleteDraftDocument(draftDocument);
		}
	}
	
	// 전체 문서양식 목록
	@GetMapping("/admin/getDocumentForm")
	public List<DocumentForm> getDocumentForm() {
		System.out.println("(C) getDocumentForm() 실행");
		
		List<DocumentForm> documentFormList = documentFormMapper.selectDocumentForm();
		System.out.println("(C) getDocumentForm() documentFormList:"+documentFormList);
		
		return documentFormList;
	}
	
	// 카테고리별 문서양식 목록
	@GetMapping("/admin/getDocumentFormByCategory")
	public List<DocumentForm> getDocumentFormByCategory(@RequestParam(value = "documentFormCategoryCode", required = false) String documentFormCategoryCode) {
		System.out.println("(C) getDocumentFormByCategory() 실행");
		System.out.println("(C) getDocumentFormByCategory() documentFormCategoryCode : "+ documentFormCategoryCode);
		
		// documentFormCategoryCode에 따른 문서양식 목록
		List<DocumentForm> documentFormList = documentFormMapper.selectDocumentFormByCategory(documentFormCategoryCode);
		System.out.println("(C) getDocumentFormByCategory() documentFormList:"+documentFormList);
		return documentFormList;
	}
	
	/*
	// 문서양식 목록(페이징)
	@GetMapping("/getDocumentForm")
	public Map<String, Object> getDocumentForm(@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage) {
		System.out.println("(C) getDocumentForm() 실행");
		Map<String, Object> map = documentManagementService.getDocumentForm(currentPage);
		System.out.println("(C) getDocumentForm() map:"+map);
		return map;
	}
	*/
}
