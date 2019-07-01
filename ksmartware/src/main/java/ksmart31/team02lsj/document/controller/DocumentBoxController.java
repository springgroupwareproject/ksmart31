package ksmart31.team02lsj.document.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02lsj.document.domain.DocumentAttachedFile;
import ksmart31.team02lsj.document.domain.DraftDocument;
import ksmart31.team02lsj.document.service.DocumentBoxService;

@Controller
public class DocumentBoxController {
	@Autowired
	DocumentBoxService documentBoxService;

	/* 기안문서함 */
	@GetMapping("/documentBox/draftDocument")
	public String draftDocumentBox(Model model, HttpSession session) {
		System.out.println("(C) draftDocumentBox");
		List<DraftDocument> draftDocumentList = null;
		Member member = (Member) session.getAttribute("loginMember");
		System.out.println("member : " + member);
		String memberId = member.getMemberId();
		String documentBoxName = "기안문서";
		draftDocumentList = documentBoxService.draftDocumentListByMemberInfo(memberId);
		System.out.println("draftDocumentList : " + draftDocumentList);
		model.addAttribute("draftDocumentList", draftDocumentList);
		model.addAttribute("documentBoxName", documentBoxName);
		return "/member/documentBox/documentHistoryForm";
	}

	// 결재완료문서함
	@GetMapping("/documentBox/approvedDocument")
	public String approvedDocumentBox(Model model, HttpSession session) {
		System.out.println("(C) approvedDocumentBox"); List<DraftDocument>
		draftDocumentList = null;
		Member member = (Member) session.getAttribute("loginMember");
		System.out.println("member : " + member);
		String memberId = member.getMemberId();
		String documentBoxName = "결재완료문서";
		draftDocumentList = documentBoxService.approvedDocumentListByMemberInfo(memberId);
		model.addAttribute("draftDocumentList", draftDocumentList);
		model.addAttribute("documentBoxName", documentBoxName); 
		return "/member/documentBox/documentHistoryForm"; 
	}

	// 수신문서함
	@GetMapping("/documentBox/recievedDocument")
	public String recievedDocumentBox(Model model, HttpSession session) {
		System.out.println("(C) recievedDocumentBox");
		List<DraftDocument> draftDocumentList = null;
		Member member = (Member) session.getAttribute("loginMember");
		System.out.println("member : " + member);
		String memberId = member.getMemberId();
		String documentBoxName = "수신문서";
		draftDocumentList = documentBoxService.recievedDocumentListByMemberInfo(memberId);
		model.addAttribute("draftDocumentList", draftDocumentList);
		model.addAttribute("documentBoxName", documentBoxName);
		return "/member/documentBox/documentHistoryForm"; }

	// 회람문서함
	@GetMapping("/documentBox/circulationDocument")
	public String
	    circulationDocumentBox(Model model, HttpSession session) {
	    System.out.println("(C) draftDocumentBox");
	    List<DraftDocument> draftDocumentList = null;
	    Member member = (Member) session.getAttribute("loginMember");
		System.out.println("member : " + member);
		String memberId = member.getMemberId();
	    String documentBoxName = "회람문서";
	    draftDocumentList = documentBoxService.circulationDocumentListByMemberInfo(memberId);
	    model.addAttribute("draftDocumentList", draftDocumentList);
	    model.addAttribute("documentBoxName", documentBoxName);
	    return "/member/documentBox/documentHistoryForm"; }

	// 전결문서함
	@GetMapping("/documentBox/finalApprovalDocument")
	public String finalApprovalDocumentBox(Model model, HttpSession session) {
	    System.out.println("(C) finalApprovalDocumentBox");
	    List<DraftDocument> draftDocumentList = null;
	    Member member = (Member) session.getAttribute("loginMember");
		System.out.println("member : " + member);
		String memberId = member.getMemberId();
	    String documentBoxName = "전결문서";
	    draftDocumentList = documentBoxService.finalApprovalDocumentListByMemberInfo(memberId);
	    model.addAttribute("draftDocumentList", draftDocumentList);
	    model.addAttribute("documentBoxName", documentBoxName);
        return "/member/documentBox/documentHistoryForm"; }
  
	// 첨부파일함
	@GetMapping("/documentBox/attachedFile")
	public String attachedFileBox(Model	  model, HttpSession session) {
		System.out.println("(C) attachedFileBox");
		List<DocumentAttachedFile> documentAttachFileList = null;
		Member member = (Member) session.getAttribute("loginMember");
		System.out.println("member : " + member);
		String memberId = member.getMemberId();
		String documentBoxName = "첨부파일";
		documentAttachFileList = documentBoxService.attachedFileListByMemberInfo(memberId);
		model.addAttribute("documentAttachFileList", documentAttachFileList);
		model.addAttribute("documentBoxName", documentBoxName);
	    return "/member/documentBox/attachedFile.html"; }

}
