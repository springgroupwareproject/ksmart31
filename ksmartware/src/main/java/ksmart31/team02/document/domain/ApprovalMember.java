package ksmart31.team02.document.domain;

public class ApprovalMember {
	private String approvalMemberName;
	private String approvalDate;
	private String approvalMemberStatus;
	private int approvalTurnNumber;
	public String getApprovalMemberName() {
		return approvalMemberName;
	}
	public void setApprovalMemberName(String approvalMemberName) {
		this.approvalMemberName = approvalMemberName;
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
	public int getApprovalTurnNumber() {
		return approvalTurnNumber;
	}
	public void setApprovalTurnNumber(int approvalTurnNumber) {
		this.approvalTurnNumber = approvalTurnNumber;
	}
	@Override
	public String toString() {
		return "ApprovalMember [approvalMemberName=" + approvalMemberName + ", approvalDate=" + approvalDate
				+ ", approvalMemberStatus=" + approvalMemberStatus + ", approvalTurnNumber=" + approvalTurnNumber + "]";
	}	
	
	
}
