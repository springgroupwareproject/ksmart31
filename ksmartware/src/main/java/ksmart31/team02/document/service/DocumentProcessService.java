package ksmart31.team02.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.ApprovalProcess;
import ksmart31.team02.document.mapper.DocumentProcessMapper;

@Service
public class DocumentProcessService {
	@Autowired private DocumentProcessMapper documentProcessMapper;

	// 관리자 결재선 관리(공통프로세스 목록)
	public List<ApprovalProcess> getApprovalProcess() {
		System.out.println("(S) getApprovalProcess() 실행");
		List<ApprovalProcess> list = documentProcessMapper.selectApprovalProcess();
		System.out.println("(S) getApprovalProcess() list : " + list);
		return list;
	}
}
