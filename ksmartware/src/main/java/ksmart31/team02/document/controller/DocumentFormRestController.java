package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.mapper.DocumentFormMapper;

@RestController
public class DocumentFormRestController {
	@Autowired private DocumentFormMapper documentFormMapper;

	// 전체 문서양식 목록
	@GetMapping("/member/getDocumentForm")
	public List<DocumentForm> getDocumentFormList() {
		System.out.println("[DocumentFormRestController] getDocumentFormList() 실행");
		
		List<DocumentForm> documentFormList = documentFormMapper.selectDocumentForm();
		System.out.println("[DocumentFormRestController] getDocumentFormList() documentFormList:"+documentFormList);
		
		return documentFormList;
	}
	 
	// 카테고리별 문서양식 목록
	@GetMapping("/member/getDocumentFormByCategory")
	public List<DocumentForm> getDocumentFormByCategory(@RequestParam(required = false) String documentFormCategoryCode) {
		System.out.println("[DocumentFormRestController] getDocumentFormByCategory() 실행");
		
		List<DocumentForm> documentFormByCategoryList = documentFormMapper.selectDocumentFormByCategory(documentFormCategoryCode);
		System.out.println("[DocumentFormRestController] getDocumentFormByCategory() documentFormByCategoryList:"+documentFormByCategoryList);
		
		return documentFormByCategoryList;
	}
}
