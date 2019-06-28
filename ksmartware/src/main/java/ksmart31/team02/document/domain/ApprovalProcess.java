package ksmart31.team02.document.domain;

public class ApprovalProcess {
	private String approvalProcessCode;
	private String approvalProcessMemberId;
	private String approvalProcessMemberName;
	private String approvalProcessName;
	private String approvalProcessDate;
	public String getApprovalProcessCode() {
		return approvalProcessCode;
	}
	public void setApprovalProcessCode(String approvalProcessCode) {
		this.approvalProcessCode = approvalProcessCode;
	}
	public String getApprovalProcessMemberId() {
		return approvalProcessMemberId;
	}
	public void setApprovalProcessMemberId(String approvalProcessMemberId) {
		this.approvalProcessMemberId = approvalProcessMemberId;
	}
	public String getApprovalProcessMemberName() {
		return approvalProcessMemberName;
	}
	public void setApprovalProcessMemberName(String approvalProcessMemberName) {
		this.approvalProcessMemberName = approvalProcessMemberName;
	}
	public String getApprovalProcessName() {
		return approvalProcessName;
	}
	public void setApprovalProcessName(String approvalProcessName) {
		this.approvalProcessName = approvalProcessName;
	}
	public String getApprovalProcessDate() {
		return approvalProcessDate;
	}
	public void setApprovalProcessDate(String approvalProcessDate) {
		this.approvalProcessDate = approvalProcessDate;
	}
	@Override
	public String toString() {
		return "ApprovalProcess [approvalProcessCode=" + approvalProcessCode + ", approvalProcessMemberId="
				+ approvalProcessMemberId + ", approvalProcessMemberName=" + approvalProcessMemberName
				+ ", approvalProcessName=" + approvalProcessName + ", approvalProcessDate=" + approvalProcessDate + "]";
	}
	
}
