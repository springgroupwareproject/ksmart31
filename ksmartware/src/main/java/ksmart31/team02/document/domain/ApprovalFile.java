package ksmart31.team02.document.domain;

public class ApprovalFile {
	private String approvalFileCode;
	private String documentCode;
	private String approvalFileOriginName;
	private String approvalFileSaveName;
	private String approvalFileExt;
	private String approvalFileType;
	private int approvalFileSize;
	private String approvalFileDate;
	private String memberId;
	private String memberEmployeeCode;
	private String memberName;
	private String departmentName;
	private String memberPositionName;
	public String getApprovalFileCode() {
		return approvalFileCode;
	}
	public void setApprovalFileCode(String approvalFileCode) {
		this.approvalFileCode = approvalFileCode;
	}
	public String getDocumentCode() {
		return documentCode;
	}
	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}
	public String getApprovalFileOriginName() {
		return approvalFileOriginName;
	}
	public void setApprovalFileOriginName(String approvalFileOriginName) {
		this.approvalFileOriginName = approvalFileOriginName;
	}
	public String getApprovalFileSaveName() {
		return approvalFileSaveName;
	}
	public void setApprovalFileSaveName(String approvalFileSaveName) {
		this.approvalFileSaveName = approvalFileSaveName;
	}
	public String getApprovalFileExt() {
		return approvalFileExt;
	}
	public void setApprovalFileExt(String approvalFileExt) {
		this.approvalFileExt = approvalFileExt;
	}
	public String getApprovalFileType() {
		return approvalFileType;
	}
	public void setApprovalFileType(String approvalFileType) {
		this.approvalFileType = approvalFileType;
	}
	public int getApprovalFileSize() {
		return approvalFileSize;
	}
	public void setApprovalFileSize(int approvalFileSize) {
		this.approvalFileSize = approvalFileSize;
	}
	public String getApprovalFileDate() {
		return approvalFileDate;
	}
	public void setApprovalFileDate(String approvalFileDate) {
		this.approvalFileDate = approvalFileDate;
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
	@Override
	public String toString() {
		return "ApprovalFile [approvalFileCode=" + approvalFileCode + ", documentCode=" + documentCode
				+ ", approvalFileOriginName=" + approvalFileOriginName + ", approvalFileSaveName="
				+ approvalFileSaveName + ", approvalFileExt=" + approvalFileExt + ", approvalFileType="
				+ approvalFileType + ", approvalFileSize=" + approvalFileSize + ", approvalFileDate=" + approvalFileDate
				+ ", memberId=" + memberId + ", memberEmployeeCode=" + memberEmployeeCode + ", memberName=" + memberName
				+ ", departmentName=" + departmentName + ", memberPositionName=" + memberPositionName + "]";
	}
	
	
}
