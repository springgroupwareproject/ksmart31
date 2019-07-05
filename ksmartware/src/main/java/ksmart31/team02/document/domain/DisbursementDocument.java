package ksmart31.team02.document.domain;

/*지출결의서 VO*/
public class DisbursementDocument {
	private String draftDocumentCode;
	private String disbursementDocumentName;			//문서제목
	private String memberName; 						//기안자
	private String memberEmployeeCode; 				//사번
	private String memberPositionName; 				//직책 
	private String departmentName;					//부서
	private String disbursementDocumentTermsOfPayment;
	private String disbursementDocumentDate;
	private String disbursementDocumentRequestDate;
	private String disbursementDocumentAccount;
	private String disbursementDocumentExpenseDate;
	private String disbursement_document_subject;
	private String disbursementDocumentContents;
	private String disbursementDocumentCustomer;
	private int disbursementDocumentPrice;
	private String disbursementDocumentMethodsOfPayment;
	private String disbursementDocumentEtc;
	private String disbursementDocumentEvidence;
	
	
	public String getDraftDocumentCode() {
		return draftDocumentCode;
	}
	public void setDraftDocumentCode(String draftDocumentCode) {
		this.draftDocumentCode = draftDocumentCode;
	}
	public String getDisbursementDocumentName() {
		return disbursementDocumentName;
	}
	public String getMemberEmployeeCode() {
		return memberEmployeeCode;
	}
	public void setMemberEmployeeCode(String memberEmployeeCode) {
		this.memberEmployeeCode = memberEmployeeCode;
	}
	public String getMemberPositionName() {
		return memberPositionName;
	}
	public void setMemberPositionName(String memberPositionName) {
		this.memberPositionName = memberPositionName;
	}
	public String getDisbursement_document_subject() {
		return disbursement_document_subject;
	}
	public void setDisbursement_document_subject(String disbursement_document_subject) {
		this.disbursement_document_subject = disbursement_document_subject;
	}
	public void setDisbursementDocumentName(String disbursementDocumentName) {
		this.disbursementDocumentName = disbursementDocumentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getDisbursementDocumentTermsOfPayment() {
		return disbursementDocumentTermsOfPayment;
	}
	public void setDisbursementDocumentTermsOfPayment(String disbursementDocumentTermsOfPayment) {
		this.disbursementDocumentTermsOfPayment = disbursementDocumentTermsOfPayment;
	}
	public String getDisbursementDocumentDate() {
		return disbursementDocumentDate;
	}
	public void setDisbursementDocumentDate(String disbursementDocumentDate) {
		this.disbursementDocumentDate = disbursementDocumentDate;
	}
	public String getDisbursementDocumentRequestDate() {
		return disbursementDocumentRequestDate;
	}
	public void setDisbursementDocumentRequestDate(String disbursementDocumentRequestDate) {
		this.disbursementDocumentRequestDate = disbursementDocumentRequestDate;
	}
	public String getDisbursementDocumentAccount() {
		return disbursementDocumentAccount;
	}
	public void setDisbursementDocumentAccount(String disbursementDocumentAccount) {
		this.disbursementDocumentAccount = disbursementDocumentAccount;
	}
	public String getDisbursementDocumentExpenseDate() {
		return disbursementDocumentExpenseDate;
	}
	public void setDisbursementDocumentExpenseDate(String disbursementDocumentExpenseDate) {
		this.disbursementDocumentExpenseDate = disbursementDocumentExpenseDate;
	}
	public String getDisbursementDocumentContents() {
		return disbursementDocumentContents;
	}
	public void setDisbursementDocumentContents(String disbursementDocumentContents) {
		this.disbursementDocumentContents = disbursementDocumentContents;
	}
	public String getDisbursementDocumentCustomer() {
		return disbursementDocumentCustomer;
	}
	public void setDisbursementDocumentCustomer(String disbursementDocumentCustomer) {
		this.disbursementDocumentCustomer = disbursementDocumentCustomer;
	}
	public int getDisbursementDocumentPrice() {
		return disbursementDocumentPrice;
	}
	public void setDisbursementDocumentPrice(int disbursementDocumentPrice) {
		this.disbursementDocumentPrice = disbursementDocumentPrice;
	}
	public String getDisbursementDocumentMethodsOfPayment() {
		return disbursementDocumentMethodsOfPayment;
	}
	public void setDisbursementDocumentMethodsOfPayment(String disbursementDocumentMethodsOfPayment) {
		this.disbursementDocumentMethodsOfPayment = disbursementDocumentMethodsOfPayment;
	}
	public String getDisbursementDocumentEtc() {
		return disbursementDocumentEtc;
	}
	public void setDisbursementDocumentEtc(String disbursementDocumentEtc) {
		this.disbursementDocumentEtc = disbursementDocumentEtc;
	}
	public String getDisbursementDocumentEvidence() {
		return disbursementDocumentEvidence;
	}
	public void setDisbursementDocumentEvidence(String disbursementDocumentEvidence) {
		this.disbursementDocumentEvidence = disbursementDocumentEvidence;
	}
	@Override
	public String toString() {
		return "DisbursementDocument [draftDocumentCode=" + draftDocumentCode + ", disbursementDocumentName="
				+ disbursementDocumentName + ", memberName=" + memberName + ", memberEmployeeCode=" + memberEmployeeCode
				+ ", memberPositionName=" + memberPositionName + ", departmentName=" + departmentName
				+ ", disbursementDocumentTermsOfPayment=" + disbursementDocumentTermsOfPayment
				+ ", disbursementDocumentDate=" + disbursementDocumentDate + ", disbursementDocumentRequestDate="
				+ disbursementDocumentRequestDate + ", disbursementDocumentAccount=" + disbursementDocumentAccount
				+ ", disbursementDocumentExpenseDate=" + disbursementDocumentExpenseDate
				+ ", disbursement_document_subject=" + disbursement_document_subject + ", disbursementDocumentContents="
				+ disbursementDocumentContents + ", disbursementDocumentCustomer=" + disbursementDocumentCustomer
				+ ", disbursementDocumentPrice=" + disbursementDocumentPrice + ", disbursementDocumentMethodsOfPayment="
				+ disbursementDocumentMethodsOfPayment + ", disbursementDocumentEtc=" + disbursementDocumentEtc
				+ ", disbursementDocumentEvidence=" + disbursementDocumentEvidence + "]";
	}

	
	
	
	

}
