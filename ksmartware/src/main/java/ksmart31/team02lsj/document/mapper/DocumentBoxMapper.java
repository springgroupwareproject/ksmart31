package ksmart31.team02lsj.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02lsj.document.domain.DocumentAttachedFile;
import ksmart31.team02lsj.document.domain.DraftDocument;

@Mapper
public interface DocumentBoxMapper {
	//기안문서
	public List<DraftDocument> selectDraftDocumentListByMember(String memberId);
	//결재완료문서
	public List<DraftDocument> selectApprovedDocumentListByMember(String memberId);
	//수신문서
	public List<DraftDocument> selectRecievedDocumentListByMember(String memberId);
	//회람문서
	public List<DraftDocument> selectCirculationDocumentListByMember(String memberId);
	//전결문서
	public List<DraftDocument> selectfinalApprovalDocumentListByMember(String memberId);
	//첨부파일
	public List<DocumentAttachedFile> selectAttachedFileListByMember(String memberId);
}
