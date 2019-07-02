package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.mapper.DocumentFormMapper;

@RestController
public class DocumentManagementRestContorller {
	@Autowired private DocumentFormMapper documentFormMapper;
	
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
}
