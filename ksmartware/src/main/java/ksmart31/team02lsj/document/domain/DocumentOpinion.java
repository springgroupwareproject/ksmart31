package ksmart31.team02lsj.document.domain;

public class DocumentOpinion {
	private String approvalOpinionCode;
	private String approvalOpinionDesc;
	private String approvalRegistrantName;
	private String documentOpinionDate;
	public String getApprovalOpinionCode() {
		return approvalOpinionCode;
	}
	public void setApprovalOpinionCode(String approvalOpinionCode) {
		this.approvalOpinionCode = approvalOpinionCode;
	}
	public String getApprovalOpinionDesc() {
		return approvalOpinionDesc;
	}
	public void setApprovalOpinionDesc(String approvalOpinionDesc) {
		this.approvalOpinionDesc = approvalOpinionDesc;
	}
	public String getApprovalRegistrantName() {
		return approvalRegistrantName;
	}
	public void setApprovalRegistrantName(String approvalRegistrantName) {
		this.approvalRegistrantName = approvalRegistrantName;
	}
	public String getDocumentOpinionDate() {
		return documentOpinionDate;
	}
	public void setDocumentOpinionDate(String documentOpinionDate) {
		this.documentOpinionDate = documentOpinionDate;
	}
	@Override
	public String toString() {
		return "DocumentOpinion [approvalOpinionCode=" + approvalOpinionCode + ", approvalOpinionDesc="
				+ approvalOpinionDesc + ", approvalRegistrantName=" + approvalRegistrantName + ", documentOpinionDate="
				+ documentOpinionDate + "]";
	}
	
	
	
}
