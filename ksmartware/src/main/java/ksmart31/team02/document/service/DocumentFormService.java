package ksmart31.team02.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.domain.DocumentFormCategory;
import ksmart31.team02.document.mapper.DocumentFormMapper;

@Service
public class DocumentFormService {
	@Autowired private DocumentFormMapper documentFormMapper;
	
	// 전체 문서양식 목록
	public List<DocumentForm> getDocumentFormList() {
		System.out.println("[DocumentFormService] getDocumentFormList() 실행");
		return documentFormMapper.selectDocumentForm();
	}
	
	// 카테고리별 문서양식 목록
	public List<DocumentForm> getDocumentFormByCategory(String documentFormCategoryCode) {
		System.out.println("[DocumentFormService] getDocumentFormByCategory() 실행");
		return documentFormMapper.selectDocumentFormByCategory(documentFormCategoryCode);
	}

	// 공통양식 카테고리 목록
	public List<DocumentFormCategory> getDocumentFormCategory() {
		System.out.println("[DocumentFormService] getDocumentFormCategory() 실행");
		return documentFormMapper.selectDocumentFormCategory();
	}
}
