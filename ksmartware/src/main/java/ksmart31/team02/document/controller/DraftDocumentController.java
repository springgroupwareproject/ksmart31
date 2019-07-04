package ksmart31.team02.document.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02.document.domain.ApprovalDocument;
import ksmart31.team02.document.domain.DraftDocument;
import ksmart31.team02.document.mapper.DraftDocumentMapper;
import ksmart31.team03.leave.domain.LeaveCategory;

@Controller
public class DraftDocumentController {
	@Autowired private DraftDocumentMapper draftDocumentMapper;
	
	// 최근 승인 문서 목록
	@GetMapping("/member/draftDocument/lastestApprovalDocumentList")
	public String getLastestApprovalDocumentList(Model model) {
		System.out.println("(C) getLastestApprovalDocumentList() 실행");
		
		// 쿼리실행결과 콘솔창에 확인
		List<ApprovalDocument> list = draftDocumentMapper.selectLastestApprovalDocumentList();
		System.out.println("(C) getTemporaryDocumentList() list:"+list);
		
		// 쿼리실행결과를 model에 할당
		model.addAttribute("list",list);
		return "/member/draftDocument/lastestApprovalDocumentList";
	}
	
	// 임시저장문서목록
	@GetMapping("/member/draftDocument/temporaryDocumentList")
	public String getTemporaryDocumentList(Model model) {
		System.out.println("(C) getTemporaryDocumentList() 실행");
		
		// 쿼리실행결과 콘솔창에 확인
		List<DraftDocument> list = draftDocumentMapper.selectTemporaryDocumentList();
		System.out.println("(C) getTemporaryDocumentList() list:"+list);
		
		// 쿼리실행결과를 model에 할당
		model.addAttribute("list",list);
		
		return "/member/draftDocument/temporaryDocumentList";
	}
}
