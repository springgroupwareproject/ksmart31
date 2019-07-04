package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.domain.DocumentFormCategory;

@Mapper
public interface DocumentFormMapper {
	// 문서양식 목록 페이징
	// public int selectDocumentFormCount();
	
	// 전체 문서양식 목록
	public List<DocumentForm> selectDocumentForm();
	
	// 카테고리별 문서양식 목록
	public List<DocumentForm> selectDocumentFormByCategory(String documentFormCategoryCode);
	
	// 공통양식 카테고리 목록
	public List<DocumentFormCategory> selectDocumentFormCategory();
}
