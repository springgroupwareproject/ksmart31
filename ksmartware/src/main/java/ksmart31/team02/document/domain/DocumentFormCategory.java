package ksmart31.team02.document.domain;

public class DocumentFormCategory {
	private String documentFormCategoryCode;
	private String documentFormCategoryName;
	private String documentFormCategoryDate;
	private String documentFormCategoryRegistrantId;
	private String documentFormCategoryRegistrantName;
	public String getDocumentFormCategoryCode() {
		return documentFormCategoryCode;
	}
	public void setDocumentFormCategoryCode(String documentFormCategoryCode) {
		this.documentFormCategoryCode = documentFormCategoryCode;
	}
	public String getDocumentFormCategoryName() {
		return documentFormCategoryName;
	}
	public void setDocumentFormCategoryName(String documentFormCategoryName) {
		this.documentFormCategoryName = documentFormCategoryName;
	}
	public String getDocumentFormCategoryDate() {
		return documentFormCategoryDate;
	}
	public void setDocumentFormCategoryDate(String documentFormCategoryDate) {
		this.documentFormCategoryDate = documentFormCategoryDate;
	}
	public String getDocumentFormCategoryRegistrantId() {
		return documentFormCategoryRegistrantId;
	}
	public void setDocumentFormCategoryRegistrantId(String documentFormCategoryRegistrantId) {
		this.documentFormCategoryRegistrantId = documentFormCategoryRegistrantId;
	}
	public String getDocumentFormCategoryRegistrantName() {
		return documentFormCategoryRegistrantName;
	}
	public void setDocumentFormCategoryRegistrantName(String documentFormCategoryRegistrantName) {
		this.documentFormCategoryRegistrantName = documentFormCategoryRegistrantName;
	}
	@Override
	public String toString() {
		return "DocumentFormCategory [documentFormCategoryCode=" + documentFormCategoryCode
				+ ", documentFormCategoryName=" + documentFormCategoryName + ", documentFormCategoryDate="
				+ documentFormCategoryDate + ", documentFormCategoryRegistrantId=" + documentFormCategoryRegistrantId
				+ ", documentFormCategoryRegistrantName=" + documentFormCategoryRegistrantName + "]";
	}
}
