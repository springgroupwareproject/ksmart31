package ksmart31.team02.document.domain;

public class DocumentOpinion {

	private String documentOpinion;
	private String approvalOpinionDesc;
	private String approvalRegistrantName;
	private String documentOpinionDate;
	public String getDocumentOpinion() {
		return documentOpinion;
	}
	public void setDocumentOpinion(String documentOpinion) {
		this.documentOpinion = documentOpinion;
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
		return "DocumentOpinion [documentOpinion=" + documentOpinion + ", approvalOpinionDesc=" + approvalOpinionDesc
				+ ", approvalRegistrantName=" + approvalRegistrantName + ", documentOpinionDate=" + documentOpinionDate
				+ "]";
	}
	
	
	
}
