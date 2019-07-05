package ksmart31.team02lsj.document.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import ksmart31.team02lsj.document.domain.ApprovalMember;
import ksmart31.team02lsj.document.domain.DisbursementDocument;
import ksmart31.team02lsj.document.domain.DocumentAttachedFile;
import ksmart31.team02lsj.document.domain.DocumentOpinion;
import ksmart31.team02lsj.document.domain.DraftDocument;
import ksmart31.team02lsj.document.domain.LeaveApplication;
import ksmart31.team02lsj.document.domain.ProjectDisbursement;
import ksmart31.team02lsj.document.domain.ProjectReport;
import ksmart31.team02lsj.document.domain.PurchaseRequisition;
import ksmart31.team02lsj.document.mapper.DocumentManagementMapper;

@Service
@Transactional
public class DocumentManagementService {
	@Autowired
	DocumentManagementMapper documentManagementMapper;
	// 관리자 문서통합 관리(리스트)
	public List<DraftDocument> draftDocumentList() {
		List<DraftDocument> documentApprovalList = documentManagementMapper.selectDraftDocumentList();
		return documentApprovalList; 
	
	}
	// 관리자 문서삭제
	public void removeDocument(String[] ckdocument) {
		System.out.println("(S) removeDocument");
		for(String id : ckdocument) {
			DraftDocument draftDocumentCode = new DraftDocument();
			draftDocumentCode.setDraftDocumentCode(id);
			documentManagementMapper.deleteDraftDocumentByDraftDocumentCode(draftDocumentCode);
		}
	}
	// 문서통합  관리 -> 문서별 상세 데이터 확인(모든양식)
		public Map<String, Object> documentManagementDetail(String approvalDocumentCode) {			
			//문서입력 데이터
			Map<String, Object> approvalDocumentDetailMap = new HashMap<String, Object>();
			
			String documentForm = documentManagementMapper.selectDocumentFormTitleByApprovalDocumentCode(approvalDocumentCode);
			if(documentForm.contains("구매요청서")) {
				List<PurchaseRequisition> purchaseRequisitionList = documentManagementMapper.selectPurchaseRequisitionDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("purchaseRequisitionList", purchaseRequisitionList);
			}else if(documentForm.contains("지출결의서")) {
				List<DisbursementDocument> disbursementDocumentList = documentManagementMapper.selectDisbursementDocumentDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("disbursementDocumentList", disbursementDocumentList);
			}else if(documentForm.contains("휴가신청서")) {
				List<LeaveApplication> leaveApplicationList= documentManagementMapper.selectLeaveApplicationDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("leaveApplicationList", leaveApplicationList);
			}else if(documentForm.contains("프로젝트 업무보고")) {	
				List<ProjectReport> projectReportList = documentManagementMapper.selectProjectReportDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("projectReportList", projectReportList);
			}else if(documentForm.contains("프로젝트 지출결의서")) {
				List<ProjectDisbursement> projectDisbursementList = documentManagementMapper.selectProjectDisbursementDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("projectDisbursementList", projectDisbursementList);
			}
			//문서별 프로세스 정보	
			List<ApprovalMember> approvalMemberList = documentManagementMapper.selectApprovalDocumentApprovalProcess(approvalDocumentCode);
			
			//문서별 첨부파일 정보
			List<DocumentAttachedFile> documentAttachedFile = documentManagementMapper.selectApprovalDocumentAttachedFile(approvalDocumentCode);
						
			//문서별 의견 정보
			List<DocumentOpinion> documentOpinion = documentManagementMapper.selectApprovalDocumentOpinion(approvalDocumentCode);
			
			approvalDocumentDetailMap.put("approvalMemberList", approvalMemberList); //문서상세  결재 프로세스
			approvalDocumentDetailMap.put("documentAttachedFile", documentAttachedFile); //문서상세 첨부파일
			approvalDocumentDetailMap.put("documentOpinion", documentOpinion); // 문서상세 의견
			approvalDocumentDetailMap.put("documentFormTitle", documentForm); //문서양식
			
			return approvalDocumentDetailMap;
		}
}


		