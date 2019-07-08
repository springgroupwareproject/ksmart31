package ksmart31.team02.document.domain;

public class ApprovalOpinion {
	private String approvalOpinionCode;
	private String documentCode;
	private String approvalOpinionDesc;
	private String memberId;
	private String memberName;
	private String approvalOpinionDate;
	private String memberEmployeeCode;
	private String departmentName;
	private String memberPositionName;
	public String getApprovalOpinionCode() {
		return approvalOpinionCode;
	}
	public void setApprovalOpinionCode(String approvalOpinionCode) {
		this.approvalOpinionCode = approvalOpinionCode;
	}
	public String getDocumentCode() {
		return documentCode;
	}
	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}
	public String getApprovalOpinionDesc() {
		return approvalOpinionDesc;
	}
	public void setApprovalOpinionDesc(String approvalOpinionDesc) {
		this.approvalOpinionDesc = approvalOpinionDesc;
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
	public String getApprovalOpinionDate() {
		return approvalOpinionDate;
	}
	public void setApprovalOpinionDate(String approvalOpinionDate) {
		this.approvalOpinionDate = approvalOpinionDate;
	}
	public String getMemberEmployeeCode() {
		return memberEmployeeCode;
	}
	public void setMemberEmployeeCode(String memberEmployeeCode) {
		this.memberEmployeeCode = memberEmployeeCode;
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
	@Override
	public String toString() {
		return "ApprovalOpinion [approvalOpinionCode=" + approvalOpinionCode + ", documentCode=" + documentCode
				+ ", approvalOpinionDesc=" + approvalOpinionDesc + ", memberId=" + memberId + ", memberName="
				+ memberName + ", approvalOpinionDate=" + approvalOpinionDate + ", memberEmployeeCode="
				+ memberEmployeeCode + ", departmentName=" + departmentName + ", memberPositionName="
				+ memberPositionName + "]";
	}
	
}
