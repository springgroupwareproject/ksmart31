package ksmart31.team02.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.ApprovalProcess;
import ksmart31.team02.document.mapper.DocumentProcessMapper;

@Service
public class DocumentProcessService {
	@Autowired private DocumentProcessMapper documentProcessMapper;

	// 관리자 결재선 관리, 사용자 결재선 목록 불러오기
	public List<ApprovalProcess> getApprovalProcess() {
		System.out.println("[DocumentProcessService] getApprovalProcess() 실행");
		List<ApprovalProcess> list = documentProcessMapper.selectApprovalProcess();
		System.out.println("[DocumentProcessService] getApprovalProcess() list : " + list);
		return list;
	}
}
