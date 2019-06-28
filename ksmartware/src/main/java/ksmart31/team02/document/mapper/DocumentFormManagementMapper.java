package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ksmart31.team02.document.domain.DisbursementDocument;
import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.domain.LeaveApplication;
import ksmart31.team02.document.domain.ProjectDisbursement;
import ksmart31.team02.document.domain.ProjectReport;
import ksmart31.team02.document.domain.PurchaseRequisition;

@Mapper
public interface DocumentFormManagementMapper {	
	public List<DocumentForm> selectdocumentFormList();
	public List<DocumentForm> selectdocumentFormListByCategory(String documentFormCategory);
	public List<PurchaseRequisition> selectPurchaseRequisitionByDocumentForm();
	public List<DisbursementDocument> selectDisbursementDocumentByDocumentForm();
	public List<LeaveApplication> selectLeaveApplicationByDocumentForm();
	public List<ProjectReport> selectProjectReportByDocumentForm();
	public List<ProjectDisbursement> selectProjectDisbursementByDocumentForm();
	
   
}
