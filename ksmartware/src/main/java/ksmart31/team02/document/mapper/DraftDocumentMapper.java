package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.domain.ApprovalDocument;
import ksmart31.team02.document.domain.DraftDocument;

@Mapper
public interface DraftDocumentMapper {
	// 최근 승인 문서 목록
	public List<ApprovalDocument> selectLastestApprovalDocumentList();
	
	// 임시저장문서 목록
	public List<DraftDocument> selectTemporaryDocumentList();
}
