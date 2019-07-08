package ksmart31.team02.document.domain;

public class DocumentAttachedFile {

	private String documentAttachedFileCode;
	private String documentAttachedFileOriginName;
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
	@Override
	public String toString() {
		return "DocumentAttachedFile [documentAttachedFileCode=" + documentAttachedFileCode
				+ ", documentAttachedFileOriginName=" + documentAttachedFileOriginName + "]";
	}
	
	
}
