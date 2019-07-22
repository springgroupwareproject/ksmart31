package ksmart31.team02.certification.domain;

public class CertificationCommon {
	
	private String certificateApplicationCode;
	private String memberId;
	private String memberName;
	private String departmentName;
	private String memberPositionName;
	private String memberAddress;
	private String memberJoinDay;
	private String memberPhone;
	private String memberEmployeeCode;
	private String documentFormCode;
	private String documentFormName;
	private String documentFormCategoryCode;
	private String documentFormCategoryName;
	private String certificateApplicationDay;
	private String certificationApplicationState;
	private String certificateApplicationUsage;
	private String certificateApplicationTitle;
	private String certificateApplicationFileName;
	private String certificateApplicationFileUrl;
	private String certificateApplicationApprover;
	public String getCertificateApplicationCode() {
		return certificateApplicationCode;
	}
	public void setCertificateApplicationCode(String certificateApplicationCode) {
		this.certificateApplicationCode = certificateApplicationCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMemberPositionName() {
		return memberPositionName;
	}
	public void setMemberPositionName(String memberPositionName) {
		this.memberPositionName = memberPositionName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberJoinDay() {
		return memberJoinDay;
	}
	public void setMemberJoinDay(String memberJoinDay) {
		this.memberJoinDay = memberJoinDay;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberEmployeeCode() {
		return memberEmployeeCode;
	}
	public void setMemberEmployeeCode(String memberEmployeeCode) {
		this.memberEmployeeCode = memberEmployeeCode;
	}
	public String getDocumentFormCode() {
		return documentFormCode;
	}
	public void setDocumentFormCode(String documentFormCode) {
		this.documentFormCode = documentFormCode;
	}
	public String getDocumentFormName() {
		return documentFormName;
	}
	public void setDocumentFormName(String documentFormName) {
		this.documentFormName = documentFormName;
	}
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
	public String getCertificateApplicationDay() {
		return certificateApplicationDay;
	}
	public void setCertificateApplicationDay(String certificateApplicationDay) {
		this.certificateApplicationDay = certificateApplicationDay;
	}
	public String getCertificationApplicationState() {
		return certificationApplicationState;
	}
	public void setCertificationApplicationState(String certificationApplicationState) {
		this.certificationApplicationState = certificationApplicationState;
	}
	public String getCertificateApplicationUsage() {
		return certificateApplicationUsage;
	}
	public void setCertificateApplicationUsage(String certificateApplicationUsage) {
		this.certificateApplicationUsage = certificateApplicationUsage;
	}
	public String getCertificateApplicationTitle() {
		return certificateApplicationTitle;
	}
	public void setCertificateApplicationTitle(String certificateApplicationTitle) {
		this.certificateApplicationTitle = certificateApplicationTitle;
	}
	public String getCertificateApplicationFileName() {
		return certificateApplicationFileName;
	}
	public void setCertificateApplicationFileName(String certificateApplicationFileName) {
		this.certificateApplicationFileName = certificateApplicationFileName;
	}
	public String getCertificateApplicationFileUrl() {
		return certificateApplicationFileUrl;
	}
	public void setCertificateApplicationFileUrl(String certificateApplicationFileUrl) {
		this.certificateApplicationFileUrl = certificateApplicationFileUrl;
	}
	public String getCertificateApplicationApprover() {
		return certificateApplicationApprover;
	}
	public void setCertificateApplicationApprover(String certificateApplicationApprover) {
		this.certificateApplicationApprover = certificateApplicationApprover;
	}
	@Override
	public String toString() {
		return "CertificationCommon [certificateApplicationCode=" + certificateApplicationCode + ", memberId="
				+ memberId + ", memberName=" + memberName + ", departmentName=" + departmentName
				+ ", memberPositionName=" + memberPositionName + ", memberAddress=" + memberAddress + ", memberJoinDay="
				+ memberJoinDay + ", memberPhone=" + memberPhone + ", memberEmployeeCode=" + memberEmployeeCode
				+ ", documentFormCode=" + documentFormCode + ", documentFormName=" + documentFormName
				+ ", documentFormCategoryCode=" + documentFormCategoryCode + ", documentFormCategoryName="
				+ documentFormCategoryName + ", certificateApplicationDay=" + certificateApplicationDay
				+ ", certificationApplicationState=" + certificationApplicationState + ", certificateApplicationUsage="
				+ certificateApplicationUsage + ", certificateApplicationTitle=" + certificateApplicationTitle
				+ ", certificateApplicationFileName=" + certificateApplicationFileName
				+ ", certificateApplicationFileUrl=" + certificateApplicationFileUrl
				+ ", certificateApplicationApprover=" + certificateApplicationApprover + "]";
	}
	
	
	
			
	
}


/*

테이블명 : certificate_application

"증명서 신청코드(PK) : 접수번호
(certificate_application_code)"	

-신청자에 대한 정보-
"신청자 ID (FK)
(member_id)"	
"신청자 이름
(member_name)"	
"부서명
(department_name)"	
"직위/직책
(member_position_name)"	
"주소
(member_address)"	
"입사일
(member_join_day)"	
"전화번호
(member_phone)"	
"사번 (FK)
(member_employee_code)"	
-문서양식에 대한 정보-
"문서양식 코드(FK)
(document_form_code)"
"문서양식 이름(FK)
(document_form_name)"	
"문서 양식 카테고리 코드(FK)
(document_form_category_code)"	
"문서 양식 카테고리 이름(FK)
(document_form_category_name)"
-증명서에 대한 정보-
"신청일자(등록일)
(certificate_application_day)"
"처리현황" : 승인 or 대기중
(certification_application_state)
"제목
(certificate_application_title)"	
"파일저장이름
(certificate_application_file_name)"	
"파일URL
(certificate_application_file_url)"
*/
