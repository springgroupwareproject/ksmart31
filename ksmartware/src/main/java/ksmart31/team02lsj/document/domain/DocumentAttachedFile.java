package ksmart31.team02lsj.document.domain;

public class DocumentAttachedFile {

	private String documentAttachedFileCode;
	private String documentAttachedFileOriginName;
	private String approvalFileSaveName;
	private String memberId;
	private String approvalFileDate;
	public String getDocumentAttachedFileCode() {
		return documentAttachedFileCode;
	}
	public void setDocumentAttachedFileCode(String documentAttachedFileCode) {
		this.documentAttachedFileCode = documentAttachedFileCode;
	}
	public String getDocumentAttachedFileOriginName() {
		return documentAttachedFileOriginName;
	}
	public void setDocumentAttachedFileOriginName(String documentAttachedFileOriginName) {
		this.documentAttachedFileOriginName = documentAttachedFileOriginName;
	}
	public String getApprovalFileSaveName() {
		return approvalFileSaveName;
	}
	public void setApprovalFileSaveName(String approvalFileSaveName) {
		this.approvalFileSaveName = approvalFileSaveName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getApprovalFileDate() {
		return approvalFileDate;
	}
	public void setApprovalFileDate(String approvalFileDate) {
		this.approvalFileDate = approvalFileDate;
	}
	@Override
	public String toString() {
		return "DocumentAttachedFile [documentAttachedFileCode=" + documentAttachedFileCode
				+ ", documentAttachedFileOriginName=" + documentAttachedFileOriginName + ", approvalFileSaveName="
				+ approvalFileSaveName + ", memberId=" + memberId + ", approvalFileDate=" + approvalFileDate + "]";
	}
	
	
	
	
	
}
