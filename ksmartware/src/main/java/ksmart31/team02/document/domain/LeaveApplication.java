package ksmart31.team02.document.domain;

public class LeaveApplication {
	private String draftDocumentCode;
	private String departmentName;
	private String memberPositionName;
	private String memberName;
	private String memberEmployeeCode;
	private String leaveApplicationDate;
	private String leaveCategorySort;
	private String leaveApplicationStartDay;
	private String leaveApplicationEndDay;
	private int leaveApplicationDay;
	private int leaveApplicationHour;
	private String leaveApplicationReason;
	private String leaveDetailSort;

	public String getMemberEmployeeCode() {
		return memberEmployeeCode;
	}

	public void setMemberEmployeeCode(String memberEmployeeCode) {
		this.memberEmployeeCode = memberEmployeeCode;
	}

	public String getDraftDocumentCode() {
		return draftDocumentCode;
	}

	public void setDraftDocumentCode(String draftDocumentCode) {
		this.draftDocumentCode = draftDocumentCode;
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

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getLeaveApplicationDate() {
		return leaveApplicationDate;
	}

	public void setLeaveApplicationDate(String leaveApplicationDate) {
		this.leaveApplicationDate = leaveApplicationDate;
	}

	public String getLeaveCategorySort() {
		return leaveCategorySort;
	}

	public void setLeaveCategorySort(String leaveCategorySort) {
		this.leaveCategorySort = leaveCategorySort;
	}

	public String getLeaveApplicationStartDay() {
		return leaveApplicationStartDay;
	}

	public void setLeaveApplicationStartDay(String leaveApplicationStartDay) {
		this.leaveApplicationStartDay = leaveApplicationStartDay;
	}

	public String getLeaveApplicationEndDay() {
		return leaveApplicationEndDay;
	}

	public void setLeaveApplicationEndDay(String leaveApplicationEndDay) {
		this.leaveApplicationEndDay = leaveApplicationEndDay;
	}

	public int getLeaveApplicationDay() {
		return leaveApplicationDay;
	}

	public void setLeaveApplicationDay(int leaveApplicationDay) {
		this.leaveApplicationDay = leaveApplicationDay;
	}

	public int getLeaveApplicationHour() {
		return leaveApplicationHour;
	}

	public void setLeaveApplicationHour(int leaveApplicationHour) {
		this.leaveApplicationHour = leaveApplicationHour;
	}

	public String getLeaveApplicationReason() {
		return leaveApplicationReason;
	}

	public void setLeaveApplicationReason(String leaveApplicationReason) {
		this.leaveApplicationReason = leaveApplicationReason;
	}

	public String getLeaveDetailSort() {
		return leaveDetailSort;
	}

	public void setLeaveDetailSort(String leaveDetailSort) {
		this.leaveDetailSort = leaveDetailSort;
	}

	@Override
	public String toString() {
		return "LeaveApplication [draftDocumentCode=" + draftDocumentCode + ", departmentName=" + departmentName
				+ ", memberPositionName=" + memberPositionName + ", memberName=" + memberName + ", memberEmployeeCode="
				+ memberEmployeeCode + ", leaveApplicationDate=" + leaveApplicationDate + ", leaveCategorySort="
				+ leaveCategorySort + ", leaveApplicationStartDay=" + leaveApplicationStartDay
				+ ", leaveApplicationEndDay=" + leaveApplicationEndDay + ", leaveApplicationDay=" + leaveApplicationDay
				+ ", leaveApplicationHour=" + leaveApplicationHour + ", leaveApplicationReason="
				+ leaveApplicationReason + ", leaveDetailSort=" + leaveDetailSort + "]";
	}

}
