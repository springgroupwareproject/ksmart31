package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team02.document.domain.ApprovalProcess;
import ksmart31.team02.document.service.DocumentProcessService;

@RestController
public class DocumentProcessRestContorller {
	@Autowired private DocumentProcessService documentProcessService;
	
	// 사용자 기안시 결재선 목록 불러오기
	@PostMapping("/member/getApprovalProcess")
	public List<ApprovalProcess> getApprovalProcess() {
		System.out.println("[DocumentProcessRestContorller] getApprovalProcess() 실행");
		
		List<ApprovalProcess> list = documentProcessService.getApprovalProcess();
		System.out.println("[DocumentProcessRestContorller] getApprovalProcess() list : "+list);
		
		return list;
	}
}
