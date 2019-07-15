package ksmart31.team02.document.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.service.DocumentFormService;

@RestController
public class DocumentFormRestController {
	@Autowired private DocumentFormService documentFormService;
	
	// 전체 문서양식 목록
	@GetMapping("/member/getDocumentForm")
	public List<DocumentForm> getDocumentFormList() {
		System.out.println("[DocumentFormRestController] getDocumentFormList() 실행");
		
		List<DocumentForm> documentFormList = documentFormService.getDocumentFormList();
		System.out.println("[DocumentFormRestController] getDocumentFormList() documentFormList:"+documentFormList);
		
		return documentFormList;
	}
	 
	// 카테고리별 문서양식 목록
	@GetMapping("/member/getDocumentFormByCategory")
	public List<DocumentForm> getDocumentFormByCategory(@RequestParam(required = false) String documentFormCategoryCode) {
		System.out.println("[DocumentFormRestController] getDocumentFormByCategory() 실행");
		
		List<DocumentForm> documentFormByCategoryList = documentFormService.getDocumentFormByCategory(documentFormCategoryCode);
		System.out.println("[DocumentFormRestController] getDocumentFormByCategory() documentFormByCategoryList:"+documentFormByCategoryList);
		
		return documentFormByCategoryList;
	}
	
	// 휴가 종류 종류 및 잔여일 조회
	@GetMapping("/member/getLeaveCategoryAndHistory")
	public Map<String, Object> getLeaveCategoryAndHistory(HttpSession session){
		Member loginMember = (Member) session.getAttribute("loginMember");
		System.out.println("[DocumentFormRestController] getLeaveCategoryAndHistory() loginMember : "+loginMember);
		
		// 휴가 종류 및 잔여일 조회
		Map<String, Object> resultMap = documentFormService.getLeaveCategoryAndHistory(loginMember.getMemberId());
		System.out.println("[DocumentFormRestController] getLeaveCategoryAndHistory() resultMap : "+resultMap);
		
		return resultMap;
	}
}
