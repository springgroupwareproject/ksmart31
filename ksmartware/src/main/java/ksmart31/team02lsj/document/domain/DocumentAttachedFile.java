package ksmart31.team02lsj.document.domain;

public class DocumentAttachedFile {

	private String documentAttachedFileCode;
	private String documentAttachedFileOriginName;
	private String documentAttachedFileMemberId;
	private String approvalFileSaveName;
	private String approvalFileDate;
	@Override
	public String toString() {
		return "DocumentAttachedFile [documentAttachedFileCode=" + documentAttachedFileCode
				+ ", documentAttachedFileOriginName=" + documentAttachedFileOriginName
				+ ", documentAttachedFileMemberId=" + documentAttachedFileMemberId + ", approvalFileSaveName="
				+ approvalFileSaveName + ", approvalFileDate=" + approvalFileDate + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
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
	public String getDocumentAttachedFileMemberId() {
		return documentAttachedFileMemberId;
	}
	public void setDocumentAttachedFileMemberId(String documentAttachedFileMemberId) {
		this.documentAttachedFileMemberId = documentAttachedFileMemberId;
	}
	public String getApprovalFileSaveName() {
		return approvalFileSaveName;
	}
	public void setApprovalFileSaveName(String approvalFileSaveName) {
		this.approvalFileSaveName = approvalFileSaveName;
	}
	public String getApprovalFileDate() {
		return approvalFileDate;
	}
	public void setApprovalFileDate(String approvalFileDate) {
		this.approvalFileDate = approvalFileDate;
	}
	
	
}
