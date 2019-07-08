package ksmart31.team02.document.domain;

public class ApprovalDocument {
	private String approvalDocumentCode;
	private String draftDocumentCode;
	private String documentFormTitle;
	private String documentFormCategoryTitle;
	private String draftDocumentStatus;
	private String finalApprovalMemberId;
	private String finalApprovalMemberName;
	private String finalApprovalDate;
	private String memberId;
	private String memberName;
	private String documentDate;
	private String memberEmployeeCode;
	private String departmentName;
	private String memberPositionName;
	private String approvalMemberDegree;
	private String approvalDocumentFileSaveName;
	private String approvalDocumentFileSize;
	private String approvalDocumentFileType;
	private String approvalDocumentFileUrl;
	private int documentOpinionCount;
	private int documentAttatchFileCount;
	public String getApprovalDocumentCode() {
		return approvalDocumentCode;
	}
	public void setApprovalDocumentCode(String approvalDocumentCode) {
		this.approvalDocumentCode = approvalDocumentCode;
	}
	public String getDraftDocumentCode() {
		return draftDocumentCode;
	}
	public void setDraftDocumentCode(String draftDocumentCode) {
		this.draftDocumentCode = draftDocumentCode;
	}
	public String getDocumentFormTitle() {
		return documentFormTitle;
	}
	public void setDocumentFormTitle(String documentFormTitle) {
		this.documentFormTitle = documentFormTitle;
	}
	public String getDocumentFormCategoryTitle() {
		return documentFormCategoryTitle;
	}
	public void setDocumentFormCategoryTitle(String documentFormCategoryTitle) {
		this.documentFormCategoryTitle = documentFormCategoryTitle;
	}
	public String getDraftDocumentStatus() {
		return draftDocumentStatus;
	}
	public void setDraftDocumentStatus(String draftDocumentStatus) {
		this.draftDocumentStatus = draftDocumentStatus;
	}
	public String getFinalApprovalMemberId() {
		return finalApprovalMemberId;
	}
	public void setFinalApprovalMemberId(String finalApprovalMemberId) {
		this.finalApprovalMemberId = finalApprovalMemberId;
	}
	public String getFinalApprovalMemberName() {
		return finalApprovalMemberName;
	}
	public void setFinalApprovalMemberName(String finalApprovalMemberName) {
		this.finalApprovalMemberName = finalApprovalMemberName;
	}
	public String getFinalApprovalDate() {
		return finalApprovalDate;
	}
	public void setFinalApprovalDate(String finalApprovalDate) {
		this.finalApprovalDate = finalApprovalDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getDocumentDate() {
		return documentDate;
	}
	public void setDocumentDate(String documentDate) {
		this.documentDate = documentDate;
	}
	public String getMemberEmployeeCode() {
		return memberEmployeeCode;
	}
	public void setMemberEmployeeCode(String memberEmployeeCode) {
		this.memberEmployeeCode = memberEmployeeCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMemberPositionName() {
		return memberPositionName;
	}
	public void setMemberPositionName(String memberPositionName) {
		this.memberPositionName = memberPositionName;
	}
	public String getApprovalMemberDegree() {
		return approvalMemberDegree;
	}
	public void setApprovalMemberDegree(String approvalMemberDegree) {
		this.approvalMemberDegree = approvalMemberDegree;
	}
	public String getApprovalDocumentFileSaveName() {
		return approvalDocumentFileSaveName;
	}
	public void setApprovalDocumentFileSaveName(String approvalDocumentFileSaveName) {
		this.approvalDocumentFileSaveName = approvalDocumentFileSaveName;
	}
	public String getApprovalDocumentFileSize() {
		return approvalDocumentFileSize;
	}
	public void setApprovalDocumentFileSize(String approvalDocumentFileSize) {
		this.approvalDocumentFileSize = approvalDocumentFileSize;
	}
	public String getApprovalDocumentFileType() {
		return approvalDocumentFileType;
	}
	public void setApprovalDocumentFileType(String approvalDocumentFileType) {
		this.approvalDocumentFileType = approvalDocumentFileType;
	}
	public String getApprovalDocumentFileUrl() {
		return approvalDocumentFileUrl;
	}
	public void setApprovalDocumentFileUrl(String approvalDocumentFileUrl) {
		this.approvalDocumentFileUrl = approvalDocumentFileUrl;
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
	@Override
	public String toString() {
		return "ApprovalDocument [approvalDocumentCode=" + approvalDocumentCode + ", draftDocumentCode="
				+ draftDocumentCode + ", documentFormTitle=" + documentFormTitle + ", documentFormCategoryTitle="
				+ documentFormCategoryTitle + ", draftDocumentStatus=" + draftDocumentStatus
				+ ", finalApprovalMemberId=" + finalApprovalMemberId + ", finalApprovalMemberName="
				+ finalApprovalMemberName + ", finalApprovalDate=" + finalApprovalDate + ", memberId=" + memberId
				+ ", memberName=" + memberName + ", documentDate=" + documentDate + ", memberEmployeeCode="
				+ memberEmployeeCode + ", departmentName=" + departmentName + ", memberPositionName="
				+ memberPositionName + ", approvalMemberDegree=" + approvalMemberDegree
				+ ", approvalDocumentFileSaveName=" + approvalDocumentFileSaveName + ", approvalDocumentFileSize="
				+ approvalDocumentFileSize + ", approvalDocumentFileType=" + approvalDocumentFileType
				+ ", approvalDocumentFileUrl=" + approvalDocumentFileUrl + ", documentOpinionCount="
				+ documentOpinionCount + ", documentAttatchFileCount=" + documentAttatchFileCount + "]";
	}
	
}
