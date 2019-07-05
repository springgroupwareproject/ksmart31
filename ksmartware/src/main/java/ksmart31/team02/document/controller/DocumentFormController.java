package ksmart31.team02.document.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02.document.domain.DocumentFormCategory;
import ksmart31.team02.document.domain.DraftDocument;
import ksmart31.team02.document.mapper.DocumentFormMapper;
import ksmart31.team02.document.service.DocumentFormService;

@Controller
public class DocumentFormController {
	@Autowired private DocumentFormMapper documentFormMapper;
	@Autowired private DocumentFormService documentFormService;
	
	// 구매요청서 작성폼
	@GetMapping("/purchaseRequisitionForm")
	public String addPurchaseRequisitionForm(HttpSession session, Model model) {
		System.out.println("[DocumentFormController] addPurchaseRequisitionForm() 실행");
		
		// 로그인된 아이디에서 직원 정보 조회
		Member loginMember = (Member) session.getAttribute("loginMember");
		System.out.println("[DocumentFormController] loginMember : "+loginMember);
		
		if(loginMember == null) {
			return "redirect:"+"/login";
		}else {
			model.addAttribute("loginMember", loginMember);
			return "member/documentForm/purchaseRequisitionForm";
		}
	}
	
	// 프로젝트 업무보고 작성폼
	@GetMapping("/projectReportForm")
	public String addProjectReportForm() {
		System.out.println("[DocumentFormController] addProjectReportForm() 실행");
		return "member/documentForm/projectReportForm";
	}
	
	// 프로젝트 지출결의서 작성폼
	@GetMapping("/projectCashDisbursementVoucherForm")
	public String addProjectCashDisbursementVoucherForm() {
		System.out.println("[DocumentFormController] addProjectCashDisbursementVoucherForm() 실행");
		return "member/documentForm/projectCashDisbursementVoucherForm";
	}
	
	// 지출결의서 작성폼
	@GetMapping("/cashDisbursementVoucherForm")
	public String addCashDisbursementVoucherForm() {
		System.out.println("[DocumentFormController] addCashDisbursementVoucherForm() 실행");
		return "member/documentForm/cashDisbursementVoucherForm";
	}
	
	// 휴가신청서 작성폼
	@GetMapping("/leaveApplicationForm")
	public String getLeaveApplicationForm(HttpSession session, Model model) {
		System.out.println("[DocumentFormController] getLeaveApplicationForm() 실행");
		
		// 로그인된 아이디에서 직원 정보 조회
		Member loginMember = (Member) session.getAttribute("loginMember");
		System.out.println("[DocumentFormController] loginMember : "+loginMember);
		
		if(loginMember == null) {
			return "redirect:"+"/login";
		}else {
			// 기안일 조회
			//List<DraftDocument> draftDocumentList = documentFormService.getLeaveApplicationForm();
			//System.out.println("[DocumentFormController] draftDocumentList:"+draftDocumentList);
			
			//model.addAttribute("draftDocumentList", draftDocumentList);
			model.addAttribute("loginMember", loginMember);
			return "member/documentForm/leaveApplicationForm";
		}
	}
	
	// 공통양식 카테고리 목록
	@GetMapping("/member/draftDocument/documentFormList")
	public String getDocumentFormCategory(Model model) {
		System.out.println("[DocumentFormController] getDocumentFormCategory() 실행");
		List<DocumentFormCategory> list = documentFormMapper.selectDocumentFormCategory();
		System.out.println("[DocumentFormController] getDocumentFormCategory() list : "+list);
		model.addAttribute("list",list);
		return "/member/draftDocument/documentFormList";
	}
}
