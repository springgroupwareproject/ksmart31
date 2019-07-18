package ksmart31.team02lsj.document.domain;

public class ApprovalMember {
	private String approvalMemberCode;
	private String approvalMemberName;
	private String approvalTurnNumber;
	private String approvalDate;
	private String approvalMemberStatus;
	private String approvalFinalApproverCase;
	private String approvalModifyRight;
	private String approvalFinalApprovalRight;
	public String getApprovalMemberCode() {
		return approvalMemberCode;
	}
	public void setApprovalMemberCode(String approvalMemberCode) {
		this.approvalMemberCode = approvalMemberCode;
	}
	public String getApprovalMemberName() {
		return approvalMemberName;
	}
	public void setApprovalMemberName(String approvalMemberName) {
		this.approvalMemberName = approvalMemberName;
	}
	public String getApprovalTurnNumber() {
		return approvalTurnNumber;
	}
	public void setApprovalTurnNumber(String approvalTurnNumber) {
		this.approvalTurnNumber = approvalTurnNumber;
	}
	public String getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}
	public String getApprovalMemberStatus() {
		return approvalMemberStatus;
	}
	public void setApprovalMemberStatus(String approvalMemberStatus) {
		this.approvalMemberStatus = approvalMemberStatus;
	}
	public String getApprovalFinalApproverCase() {
		return approvalFinalApproverCase;
	}
	public void setApprovalFinalApproverCase(String approvalFinalApproverCase) {
		this.approvalFinalApproverCase = approvalFinalApproverCase;
	}
	public String getApprovalModifyRight() {
		return approvalModifyRight;
	}
	public void setApprovalModifyRight(String approvalModifyRight) {
		this.approvalModifyRight = approvalModifyRight;
	}
	public String getApprovalFinalApprovalRight() {
		return approvalFinalApprovalRight;
	}
	public void setApprovalFinalApprovalRight(String approvalFinalApprovalRight) {
		this.approvalFinalApprovalRight = approvalFinalApprovalRight;
	}
	@Override
	public String toString() {
		return "ApprovalMember [approvalMemberCode=" + approvalMemberCode + ", approvalMemberName=" + approvalMemberName
				+ ", approvalTurnNumber=" + approvalTurnNumber + ", approvalDate=" + approvalDate
				+ ", approvalMemberStatus=" + approvalMemberStatus + ", approvalFinalApproverCase="
				+ approvalFinalApproverCase + ", approvalModifyRight=" + approvalModifyRight
				+ ", approvalFinalApprovalRight=" + approvalFinalApprovalRight + "]";
	}
	
}