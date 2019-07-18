package ksmart31.team02.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.ApprovalDocument;
import ksmart31.team02.document.domain.ApprovalFile;
import ksmart31.team02.document.domain.ApprovalOpinion;
import ksmart31.team02.document.domain.DraftDocument;
import ksmart31.team02.document.mapper.DraftDocumentMapper;

@Service
public class DraftDocumentService {
	@Autowired private DraftDocumentMapper draftDocumentMapper;
	
	// 문서 기안
	public void addDraftDocument(DraftDocument draftDocument) {
		System.out.println("[DraftDocumentService] addDraftDocument() 실행");
		draftDocumentMapper.insertDraftDocument(draftDocument);
	}
	 
	// 문서양식 첨부파일 목록
	public List<ApprovalFile> getApprovalFile() {
		System.out.println("[DraftDocumentService] getApprovalFile() 실행");
		List<ApprovalFile> list = draftDocumentMapper.selectApprovalFile();
		return list;
	}
	
	// 문서양식 의견 등록
	public int addApprovalOpinion(ApprovalOpinion approvalOpinion) {
		System.out.println("[DraftDocumentService] addApprovalOpinion() 실행");
		return draftDocumentMapper.insertApprovalOpinion(approvalOpinion);
	}
	
	// 문서양식 의견목록
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
