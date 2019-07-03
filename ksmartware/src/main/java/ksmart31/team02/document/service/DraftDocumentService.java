package ksmart31.team02.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.ApprovalDocument;
import ksmart31.team02.document.domain.ApprovalOpinion;
import ksmart31.team02.document.domain.DraftDocument;
import ksmart31.team02.document.mapper.DraftDocumentMapper;

@Service
public class DraftDocumentService {
	@Autowired private DraftDocumentMapper draftDocumentMapper;
	
	// 기안시 의견목록
	public List<ApprovalOpinion> getApprovalOpinion() {
		System.out.println("[DraftDocumentService] getApprovalOpinion() 실행");
		return draftDocumentMapper.selectApprovalOpinion();
	}
	
	// 최근 승인 문서 목록
	public List<ApprovalDocument> getLastestApprovalDocument() {
		System.out.println("[DraftDocumentService] getLastestApprovalDocument() 실행");
		return draftDocumentMapper.selectLastestApprovalDocumentList();
	}
	
	// 임시저장문서 목록
	public List<DraftDocument> getTemporaryDocumentList() {
		System.out.println("[DraftDocumentService] getTemporaryDocumentList() 실행");
		return draftDocumentMapper.selectTemporaryDocumentList();
	}
}
