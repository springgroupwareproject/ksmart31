package ksmart31.team02.certification.domain;

public class Certification {
	private String documentFormCategoryCode;
	private String documentFormCategoryName;
	private String documentFormName;
	private String documentFormCode;
	private String documentFormDate;
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
	public String getDocumentFormName() {
		return documentFormName;
	}
	public void setDocumentFormName(String documentFormTitle) {
		this.documentFormName = documentFormTitle;
	}
	public String getDocumentFormCode() {
		return documentFormCode;
	}
	public void setDocumentFormCode(String documentFormCode) {
		this.documentFormCode = documentFormCode;
	}
	public String getDocumentFormDate() {
		return documentFormDate;
	}
	public void setDocumentFormDate(String documentFormDate) {
		this.documentFormDate = documentFormDate;
	}
	@Override
	public String toString() {
		return "Certification [documentFormCategoryCode=" + documentFormCategoryCode + ", documentFormCategoryName="
				+ documentFormCategoryName + ", documentFormName=" + documentFormName + ", documentFormCode="
				+ documentFormCode + ", documentFormDate=" + documentFormDate + "]";
	}
	
	
	
	
	
}
