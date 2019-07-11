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
	//문서관리 상세보기
	@GetMapping(value = "/documentManagement/detail")
	public String documentManagementList(Model model, @RequestParam(value = "draftDocumentCode")String draftDocumentCode) {
		String path = null;
		System.out.println("(C)documentApprovalManagement");
		 Map<String, Object> documentDetailMap = documentManagementService.documentManagementDetail(draftDocumentCode);
		 model.addAttribute("approvalMemberList",documentDetailMap.get("approvalMemberList"));		//결재라인
		 model.addAttribute("documentAttachedFile",documentDetailMap.get("documentAttachedFile"));	//첨부파일
		 model.addAttribute("documentOpinion",documentDetailMap.get("documentOpinion"));			//의견
		/* 맵에서 문서양식 꺼내서 양식별로 포워딩 주소(리턴값) 다르게 만들기 */
		 String documentFormTitle = documentDetailMap.get("documentFormTitle").toString();
		 System.out.println("documentFormTitle : " + documentFormTitle);
		 if(documentFormTitle.contains("구매요청서")) {
			 model.addAttribute("purchaseRequisitionList", documentDetailMap.get("purchaseRequisitionList"));
			 path= "documentDetail/purchaseRequisitionDetail";
		 }else if(documentFormTitle.contains("지출결의서")){
			 model.addAttribute("disbursementDocumentList", documentDetailMap.get("disbursementDocumentList"));
			 path= "documentDetail/disbursementDocumentDetail";
		 }else if(documentFormTitle.contains("휴가신청서")){
			 model.addAttribute("leaveApplicationList", documentDetailMap.get("leaveApplicationList"));
			 path= "documentDetail/leaveApplicationDetail";
		 }else if(documentFormTitle.contains("프로젝트 업무보고")){
			 model.addAttribute("projectReportList", documentDetailMap.get("projectReportList"));
			 path= "documentDetail/projectReportDetail";
		 }else if(documentFormTitle.contains("프로젝트 지출결의서")){
			 model.addAttribute("projectDisbursementList", documentDetailMap.get("projectDisbursementList"));
			 path= "documentDetail/projectDisbursementDetail";
		 }
		return path;
	}

}
