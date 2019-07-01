package ksmart31.team02.document.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ksmart31.team02.document.domain.DisbursementDocument;
import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.domain.LeaveApplication;
import ksmart31.team02.document.domain.ProjectDisbursement;
import ksmart31.team02.document.domain.ProjectReport;
import ksmart31.team02.document.domain.PurchaseRequisition;
import ksmart31.team02.document.mapper.DocumentFormManagementMapper;

@Service
public class DocumentFormManagementService {
	
	@Autowired
	DocumentFormManagementMapper documentFormMapper;
	
	//문서양식 전체출력
	public List<DocumentForm> documentFormList() {
	List<DocumentForm> documentFormList = documentFormMapper.selectdocumentFormList();
		return documentFormList;
	}
	
	//문서양식 카테고리별 문서양식출력
	public List<DocumentForm> documentFormListByCategory(String documentFormCategory){
		
		List<DocumentForm> documentFormList = documentFormMapper.selectdocumentFormListByCategory(documentFormCategory);
		return documentFormList;
	
	}
	
	//문서양식별 결재문서 리스트 출력
	public Map<String, Object> approvalDocumentListBydocumentForm(String documentForm){
	Map<String, Object> approvalDocumentListMap = new HashMap<String, Object>();
			if(documentForm.contains("구매요청서")) {
				List<PurchaseRequisition> purchaseRequisitionList = documentFormMapper.selectPurchaseRequisitionByDocumentForm();
				approvalDocumentListMap.put("purchaseRequisitionList", purchaseRequisitionList);
			}else if(documentForm.contains("지출결의서")) {
				List<DisbursementDocument> disbursementDocumentList = documentFormMapper.selectDisbursementDocumentByDocumentForm();
				approvalDocumentListMap.put("disbursementDocumentList", disbursementDocumentList);
			}else if(documentForm.contains("휴가신청서")) {
				List<LeaveApplication> leaveApplicationList= documentFormMapper.selectLeaveApplicationByDocumentForm();
				approvalDocumentListMap.put("leaveApplicationList", leaveApplicationList);
			}else if(documentForm.contains("프로젝트 업무보고")) {	
				List<ProjectReport> projectReportList = documentFormMapper.selectProjectReportByDocumentForm();
				approvalDocumentListMap.put("projectReportList", projectReportList);
			}else if(documentForm.contains("프로젝트 지출결의서")) {
				List<ProjectDisbursement> projectDisbursementList = documentFormMapper.selectProjectDisbursementByDocumentForm();
				approvalDocumentListMap.put("projectDisbursementList", projectDisbursementList);
			}
	return approvalDocumentListMap;
	
	}
	

}
