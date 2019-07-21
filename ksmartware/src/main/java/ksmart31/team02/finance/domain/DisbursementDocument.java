package ksmart31.team02.finance.domain;

/*재무관리 > 지출결의서*/

public class DisbursementDocument {
	private String disbursementDocumentCode;
	private String draftDocumentCode;
	private String disbursementDocumentName;
	private String departmentName;
	private String memberName;
	private String memberId;
	private String memberEmployeeCode;
	private String memberPositionName;
	private String accountNumber;
	private String accountHolder;
	private String disbursementDocumentTermsOfPayment;
	private String disbursementDocumentDate;
	private String disbursementDocumentRequestDate;
	private String accountName;
	private String disbursementDocumentExpenseDate;
	private String disbursementDocumentContents;
	private String disbursementDocumentCustomer;
	private int disbursementDocumentPrice;
	private String disbursementDocumentMethodsOfPayment;
	private String disbursementDocumentEtc;
	private String disbursementDocumentEvidence;
	
	private String draftDocumentFinalApprovalDate; //최종승인일자
	private int sumDisbursementDocumentPrice; // 계정과목별 합산금액
	private int totalPrice; //총 금액 합계
	
	
	public String getDisbursementDocumentCode() {
		return disbursementDocumentCode;
	}
	public void setDisbursementDocumentCode(String disbursementDocumentCode) {
		this.disbursementDocumentCode = disbursementDocumentCode;
	}
	public String getDraftDocumentCode() {
		return draftDocumentCode;
	}
	public void setDraftDocumentCode(String draftDocumentCode) {
		this.draftDocumentCode = draftDocumentCode;
	}
	public String getDisbursementDocumentName() {
		return disbursementDocumentName;
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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
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
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
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
	public String getDraftDocumentFinalApprovalDate() {
		return draftDocumentFinalApprovalDate;
	}
	public void setDraftDocumentFinalApprovalDate(String draftDocumentFinalApprovalDate) {
		this.draftDocumentFinalApprovalDate = draftDocumentFinalApprovalDate;
	}
	public int getSumDisbursementDocumentPrice() {
		return sumDisbursementDocumentPrice;
	}
	public void setSumDisbursementDocumentPrice(int sumDisbursementDocumentPrice) {
		this.sumDisbursementDocumentPrice = sumDisbursementDocumentPrice;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "DisbursementDocument [disbursementDocumentCode=" + disbursementDocumentCode + ", draftDocumentCode="
				+ draftDocumentCode + ", disbursementDocumentName=" + disbursementDocumentName + ", departmentName="
				+ departmentName + ", memberName=" + memberName + ", memberId=" + memberId + ", memberEmployeeCode="
				+ memberEmployeeCode + ", memberPositionName=" + memberPositionName + ", accountNumber=" + accountNumber
				+ ", accountHolder=" + accountHolder + ", disbursementDocumentTermsOfPayment="
				+ disbursementDocumentTermsOfPayment + ", disbursementDocumentDate=" + disbursementDocumentDate
				+ ", disbursementDocumentRequestDate=" + disbursementDocumentRequestDate + ", accountName="
				+ accountName + ", disbursementDocumentExpenseDate=" + disbursementDocumentExpenseDate
				+ ", disbursementDocumentContents=" + disbursementDocumentContents + ", disbursementDocumentCustomer="
				+ disbursementDocumentCustomer + ", disbursementDocumentPrice=" + disbursementDocumentPrice
				+ ", disbursementDocumentMethodsOfPayment=" + disbursementDocumentMethodsOfPayment
				+ ", disbursementDocumentEtc=" + disbursementDocumentEtc + ", disbursementDocumentEvidence="
				+ disbursementDocumentEvidence + ", draftDocumentFinalApprovalDate=" + draftDocumentFinalApprovalDate
				+ ", sumDisbursementDocumentPrice=" + sumDisbursementDocumentPrice + ", totalPrice=" + totalPrice + "]";
	}
	
	
	
	
	
}


/*



[지출 결의서]

지출결의서 코드(PK) (disbursement_document_code)
기안 문서코드(FK) (draft_document_code)

- 1 -
제목 (disbursement_document_name)
^부서 (department_name) //세션에서 가져온다
^담당자 (member_name) //세션에서 가져온다
 담당자ID (member_id) //세션에서 가져온다
 담당자 사번 (member_employee_code) //세션에서 가져온다
 담당자 직위/직책 (member_position_name) //세션에서 가져온다
^계좌번호(은행) (account_number) //조회후 따로 가져와야함
^예금주 (account_holder) //조회후 따로 가져와야함
^합계금액 
^지급조건 (disbursement_document_terms_of_payment)
^기안일 (disbursement_document_date)
^지급요청일 (disbursement_document_request_date)

- N -
^* 계정과목명 (account_name) (FK) //조회후 따로 가져와야함
    계정과목 코드 (FK) (account_code) //조회후 따로 가져와야함
^* 지출일 (disbursement_document_expense_date)
^* 지출내용 (disbursement_document_contents)
^* 거래처 (disbursement_document_customer)
^* 금액 (disbursement_document_price)
^* 결재수단 (disbursement_document_methods_of_payment)
^비고(disbursement_document_etc)	
^증빙(disbursement_document_evidence)

*/