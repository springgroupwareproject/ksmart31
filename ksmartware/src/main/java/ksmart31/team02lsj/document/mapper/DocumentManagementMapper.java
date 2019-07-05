package ksmart31.team02lsj.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02lsj.document.domain.ApprovalMember;
import ksmart31.team02lsj.document.domain.DisbursementDocument;
import ksmart31.team02lsj.document.domain.DocumentAttachedFile;
import ksmart31.team02lsj.document.domain.DocumentOpinion;
import ksmart31.team02lsj.document.domain.DraftDocument;
import ksmart31.team02lsj.document.domain.LeaveApplication;
import ksmart31.team02lsj.document.domain.ProjectDisbursement;
import ksmart31.team02lsj.document.domain.ProjectReport;
import ksmart31.team02lsj.document.domain.PurchaseRequisition;

@Mapper
public interface DocumentManagementMapper {
	//관리자 문서관리 리스트 
	public List<DraftDocument> selectDraftDocumentList();
	//관리자 문서 삭제 
	public int deleteDraftDocumentByDraftDocumentCode(DraftDocument draftDocumentCode);
	//문서코드입력 -> 문서양식
	public String selectDocumentFormTitleByApprovalDocumentCode(String approvalDocumentCode);
	//구매요청서 입력데이터
	public List<PurchaseRequisition> selectPurchaseRequisitionDetail(String approvalDocumentCode);
	//지출결의서 입력데이터
	public List<DisbursementDocument> selectDisbursementDocumentDetail(String approvalDocumentCode);
	//휴가신청서 입력데이터
	public List<LeaveApplication> selectLeaveApplicationDetail(String approvalDocumentCode);
	//프로젝트 업무보고 입력데이터
	public List<ProjectReport> selectProjectReportDetail(String approvalDocumentCode);
	//프로젝트 지출결의서 입력데이터 
	public List<ProjectDisbursement> selectProjectDisbursementDetail(String approvalDocumentCode);
	//문서상세 결재자정보(프로세스) 데이터
	public List<ApprovalMember> selectApprovalDocumentApprovalProcess(String approvalDocumentCode);
	//문서상세 의견 데이터
	public List<DocumentOpinion> selectApprovalDocumentOpinion(String approvalDocumentCode);
	//문서상세 첨부파일 데이터
	public List<DocumentAttachedFile> selectApprovalDocumentAttachedFile(String approvalDocumentCode);
}
