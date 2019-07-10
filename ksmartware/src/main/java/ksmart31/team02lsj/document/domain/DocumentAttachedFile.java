package ksmart31.team02lsj.document.domain;

public class DocumentAttachedFile {

	private String documentAttachedFileCode;
	private String documentAttachedFileOriginName;
	private String documentAttachedFileMemberId;
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
	public String getDocumentAttachedFileMemberId() {
		return documentAttachedFileMemberId;
	}
	public void setDocumentAttachedFileMemberId(String documentAttachedFileMemberId) {
		this.documentAttachedFileMemberId = documentAttachedFileMemberId;
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
				+ ", documentAttachedFileOriginName=" + documentAttachedFileOriginName
				+ ", documentAttachedFileMemberId=" + documentAttachedFileMemberId + ", approvalFileDate="
				+ approvalFileDate + "]";
	}
	
	
}
