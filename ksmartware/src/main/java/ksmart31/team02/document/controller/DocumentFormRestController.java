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
	
	/*
	// 휴가신청서 작성폼
	@GetMapping("/leaveApplicationForm")
	public String getLeaveApplicationForm(String documentFormCode) {
		System.out.println("(C) getLeaveApplicationForm() 실행");
		System.out.println("(C) getLeaveApplicationForm() documentFormCode:"+documentFormCode);
		return "member/documentForm/leaveApplicationForm";
	}
	*/
	
	// 전체 문서양식 목록
	@GetMapping("/member/getDocumentForm")
	public List<DocumentForm> getDocumentFormList() {
		System.out.println("(C) getDocumentFormList() 실행");
		
		List<DocumentForm> documentFormList = documentFormMapper.selectDocumentForm();
		System.out.println("(C) getDocumentFormList() documentFormList:"+documentFormList);
		
		return documentFormList;
	}
	 
	// 카테고리별 문서양식 목록
	@GetMapping("/member/getDocumentFormByCategory")
	public List<DocumentForm> getDocumentFormByCategory(@RequestParam(required = false) String documentFormCategoryCode) {
		System.out.println("(C) getDocumentFormByCategory() 실행");
		
		List<DocumentForm> documentFormByCategoryList = documentFormMapper.selectDocumentFormByCategory(documentFormCategoryCode);
		System.out.println("(C) getDocumentFormByCategory() documentFormByCategoryList:"+documentFormByCategoryList);
		
		return documentFormByCategoryList;
	}
}
