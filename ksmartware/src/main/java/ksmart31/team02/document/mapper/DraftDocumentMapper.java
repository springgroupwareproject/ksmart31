package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.domain.ApprovalDocument;
import ksmart31.team02.document.domain.ApprovalFile;
import ksmart31.team02.document.domain.ApprovalOpinion;
import ksmart31.team02.document.domain.DraftDocument;

@Mapper
public interface DraftDocumentMapper {
	// 문서 기안
	public void insertDraftDocument(DraftDocument draftDocument);
	
	// 문서양식 첨부파일목록
	public List<ApprovalFile> selectApprovalFile();
	
	// 문서양식 의견 등록
	public int insertApprovalOpinion(ApprovalOpinion approvalOpinion);
	
	// 문서양식 의견목록
	public List<ApprovalOpinion> selectApprovalOpinion();
	
	// 문서양식폼에 보여줄 정보
	//public List<DraftDocument> selectDraftDocument();
	
	// 최근 승인 문서 목록
	public List<ApprovalDocument> selectLastestApprovalDocumentList();
	
	// 임시저장문서 목록
	public List<DraftDocument> selectTemporaryDocumentList();
}
