package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team02.document.domain.DocumentFormCategory;
import ksmart31.team02.document.mapper.DocumentFormMapper;

@Controller
public class DocumentFormController {
	@Autowired private DocumentFormMapper documentFormMapper;

	// 구매요청서 작성폼
	@GetMapping("/purchaseRequisitionForm")
	public String addPurchaseRequisitionForm() {
		System.out.println("(C) addPurchaseRequisitionForm() 실행");
		return "member/documentForm/purchaseRequisitionForm";
	}
	
	// 프로젝트 업무보고 작성폼
	@GetMapping("/projectReportForm")
	public String addProjectReportForm() {
		System.out.println("(C) addProjectReportForm() 실행");
		return "member/documentForm/projectReportForm";
	}
	
	// 프로젝트 지출결의서 작성폼
	@GetMapping("/projectCashDisbursementVoucherForm")
	public String addProjectCashDisbursementVoucherForm() {
		System.out.println("(C) addProjectCashDisbursementVoucherForm() 실행");
		return "member/documentForm/projectCashDisbursementVoucherForm";
	}
	
	// 지출결의서 작성폼
	@GetMapping("/cashDisbursementVoucherForm")
	public String addCashDisbursementVoucherForm() {
		System.out.println("(C) addCashDisbursementVoucherForm() 실행");
		return "member/documentForm/cashDisbursementVoucherForm";
	}
	
	// 휴가신청서 작성폼
	@GetMapping("/leaveApplicationForm")
	public String getLeaveApplicationForm(String documentFormCode, Model model) {
		System.out.println("(C) getLeaveApplicationForm() 실행");
		System.out.println("(C) getLeaveApplicationForm() documentFormCode:"+documentFormCode);
		return "member/documentForm/leaveApplicationForm";
	}
	
	// 공통양식 카테고리 목록
	@GetMapping("/member/draftDocument/documentFormList")
	public String getDocumentFormCategory(Model model) {
		System.out.println("(C) getDocumentFormCategory() 실행");
		List<DocumentFormCategory> list = documentFormMapper.selectDocumentFormCategory();
		System.out.println("(C) getDocumentFormCategory() list : "+list);
		model.addAttribute("list",list);
		return "/member/draftDocument/documentFormList";
	}
}
