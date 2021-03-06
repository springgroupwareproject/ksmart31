package ksmart31.team02lsj.document.domain;

public class DraftDocument {
	private String draftDocumentCode;
	private String draftDocumentStatus;
	private String draftDocumentMemberName;
	private String draftDocumentFileSaveName;
	private String draftDocumentFinalApprovalMemberName;
	private String draftDocumentFinalApprovalDate;
	private int documentOpinionCount;
	private int documentAttatchFileCount;
	private String draftDocumentDate;
	public String getDraftDocumentCode() {
		return draftDocumentCode;
	}
	public void setDraftDocumentCode(String draftDocumentCode) {
		this.draftDocumentCode = draftDocumentCode;
	}
	public String getDraftDocumentStatus() {
		return draftDocumentStatus;
	}
	public void setDraftDocumentStatus(String draftDocumentStatus) {
		this.draftDocumentStatus = draftDocumentStatus;
	}
	public String getDraftDocumentMemberName() {
		return draftDocumentMemberName;
	}
	public void setDraftDocumentMemberName(String draftDocumentMemberName) {
		this.draftDocumentMemberName = draftDocumentMemberName;
	}
	public String getDraftDocumentFileSaveName() {
		return draftDocumentFileSaveName;
	}
	public void setDraftDocumentFileSaveName(String draftDocumentFileSaveName) {
		this.draftDocumentFileSaveName = draftDocumentFileSaveName;
	}
	public String getDraftDocumentFinalApprovalMemberName() {
		return draftDocumentFinalApprovalMemberName;
	}
	public void setDraftDocumentFinalApprovalMemberName(String draftDocumentFinalApprovalMemberName) {
		this.draftDocumentFinalApprovalMemberName = draftDocumentFinalApprovalMemberName;
	}
	public String getDraftDocumentFinalApprovalDate() {
		return draftDocumentFinalApprovalDate;
	}
	public void setDraftDocumentFinalApprovalDate(String draftDocumentFinalApprovalDate) {
		this.draftDocumentFinalApprovalDate = draftDocumentFinalApprovalDate;
	}
	public int getDocumentOpinionCount() {
		return documentOpinionCount;
	}
	public void setDocumentOpinionCount(int documentOpinionCount) {
		this.documentOpinionCount = documentOpinionCount;
	}
	public int getDocumentAttatchFileCount() {
		return documentAttatchFileCount;
	}
	public void setDocumentAttatchFileCount(int documentAttatchFileCount) {
		this.documentAttatchFileCount = documentAttatchFileCount;
	}
	public String getDraftDocumentDate() {
		return draftDocumentDate;
	}
	public void setDraftDocumentDate(String draftDocumentDate) {
		this.draftDocumentDate = draftDocumentDate;
	}
	@Override
	public String toString() {
		return "DraftDocument [draftDocumentCode=" + draftDocumentCode + ", draftDocumentStatus=" + draftDocumentStatus
				+ ", draftDocumentMemberName=" + draftDocumentMemberName + ", draftDocumentFileSaveName="
				+ draftDocumentFileSaveName + ", draftDocumentFinalApprovalMemberName="
				+ draftDocumentFinalApprovalMemberName + ", draftDocumentFinalApprovalDate="
				+ draftDocumentFinalApprovalDate + ", documentOpinionCount=" + documentOpinionCount
				+ ", documentAttatchFileCount=" + documentAttatchFileCount + ", draftDocumentDate=" + draftDocumentDate
				+ "]";
	}
	
	
	
}
