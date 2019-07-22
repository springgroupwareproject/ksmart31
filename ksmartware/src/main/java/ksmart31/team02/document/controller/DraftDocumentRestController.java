package ksmart31.team02.document.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02.document.domain.ApprovalFile;
import ksmart31.team02.document.domain.ApprovalOpinion;
import ksmart31.team02.document.domain.DraftDocument;
import ksmart31.team02.document.service.DraftDocumentService;

@RestController
public class DraftDocumentRestController {
	@Autowired private DraftDocumentService draftDocumentService;
	
	// 문서 기안
	@PostMapping("/member/addDraftDocument")
	public void addDraftDocument(HttpSession session, DraftDocument draftDocument) {
		System.out.println("[DraftDocumentRestController] addDraftDocument() 실행");
		System.out.println("[DraftDocumentRestController] addDraftDocument() documentFormCode:"+draftDocument.getDocumentFormCode());
		System.out.println("[DraftDocumentRestController] addDraftDocument() documentFormCategoryCode:"+draftDocument.getDocumentFormCategoryCode());
		
		// 세션에 저장된 아이디의 회원정보 확인
		Member loginMember = (Member) session.getAttribute("loginMember");
		System.out.println("[DraftDocumentRestController] addDraftDocument() loginMember : "+loginMember);

		// 기안문서에 셋팅
		draftDocument.setDraftDocumentMemberId(loginMember.getMemberId());
		draftDocument.setDraftDocumentMemberName(loginMember.getMemberName());
		draftDocument.setDraftDocumentMemberEmployeeCode(loginMember.getMemberEmployeeCode());
		draftDocument.setDraftDocumentMemberDepartmentName(loginMember.getDepartmentName());
		draftDocument.setDraftDocumentMemberPositionName(loginMember.getMemberPositionName());
		System.out.println("[DraftDocumentRestController] addDraftDocument() draftDocument:"+draftDocument);
		
		// 기안 문서 insert
		draftDocumentService.addDraftDocument(draftDocument);
	}
	
	// 문서양식 첨부파일목록
	@GetMapping("/member/approvalFileList")
	public List<ApprovalFile> getApprovalFileList() {
		System.out.println("[DraftDocumentRestController] getApprovalFileList() 실행");
		
		List<ApprovalFile> list = draftDocumentService.getApprovalFile();
		System.out.println("[DraftDocumentRestController] getApprovalFileList() list:"+list);
		
		return list;
	}
	
	// 문서양식 의견 등록
	@PostMapping("/member/addApprovalOpinion")
	public void addApprovalOpinion(ApprovalOpinion approvalOpinion) {
		System.out.println("[DraftDocumentRestController] addApprovalOpinion() 실행");
		System.out.println("[DraftDocumentRestController] addApprovalOpinion() approvalOpinion:"+approvalOpinion);
		
		//draftDocumentService.addApprovalOpinion(approvalOpinion);
	}
	
	// 문서양식 의견목록
	@GetMapping("/member/approvalOpinionList")
	public List<ApprovalOpinion> getApprovalOpinionList() {
		System.out.println("[DraftDocumentRestController] getApprovalOpinionList() 실행");
		
		List<ApprovalOpinion> list = draftDocumentService.getApprovalOpinion();
		System.out.println("[DraftDocumentRestController] getApprovalOpinionList() list:"+list);
		
		return list;
	}
}
