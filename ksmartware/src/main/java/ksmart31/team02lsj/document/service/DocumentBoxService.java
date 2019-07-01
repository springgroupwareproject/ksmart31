package ksmart31.team02lsj.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02lsj.document.domain.DocumentAttachedFile;
import ksmart31.team02lsj.document.domain.DraftDocument;
import ksmart31.team02lsj.document.mapper.DocumentBoxMapper;
@Transactional
@Service
public class DocumentBoxService {
	@Autowired
	DocumentBoxMapper documentBoxMapper;
	//기안문서
	public List<DraftDocument> draftDocumentListByMemberInfo(String memberId){
		System.out.println("(S)DocumentBox draft");
		List<DraftDocument> draftDocumentList = documentBoxMapper.selectDraftDocumentListByMember(memberId); 
		return draftDocumentList;
	}
	//결재완료 문서
	public List<DraftDocument> approvedDocumentListByMemberInfo(String memberId){
		System.out.println("(S)DocumentBox draft");
		List<DraftDocument> approvedDocumentList = documentBoxMapper.selectApprovedDocumentListByMember(memberId); 
		
		return approvedDocumentList;
	}
	//수신문서
	public List<DraftDocument> recievedDocumentListByMemberInfo(String memberId){
		System.out.println("(S)DocumentBox draft");
		List<DraftDocument> recievedDocumentList = documentBoxMapper.selectRecievedDocumentListByMember(memberId); 
		return recievedDocumentList;
	}
	//회람문서
	public List<DraftDocument> circulationDocumentListByMemberInfo(String memberId){
		System.out.println("(S)DocumentBox draft");
		List<DraftDocument> circulationDocumentList = documentBoxMapper.selectCirculationDocumentListByMember(memberId); 
		return circulationDocumentList;
	}
	//전결문서
	public List<DraftDocument> finalApprovalDocumentListByMemberInfo(String memberId){
		System.out.println("(S)DocumentBox draft");
		List<DraftDocument> finalApprovalDocumentList = documentBoxMapper.selectfinalApprovalDocumentListByMember(memberId); 
		return finalApprovalDocumentList;
	}
	//첨부파일
	public List<DocumentAttachedFile> attachedFileListByMemberInfo(String memberId){
		System.out.println("(S)DocumentBox draft");
		List<DocumentAttachedFile> attachedFileList = documentBoxMapper.selectAttachedFileListByMember(memberId); 
		return attachedFileList;
	}
}
