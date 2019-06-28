package ksmart31.team03.leave.domain;

public class LeaveUsed {
	private String LeaveUsedCode;
	private String memberId;
	private String leaveCategorySort;
	private String leaveDetailSort;
	private int leaveUsedHour;
	private int leaveUsedDay;
	private String leaveUsedReason;
	private String leaveUsedStartDay;
	private String leaveUsedEndDay;
	private String memberEmployeeCode;
	private String memberName;
	private String departmentName;
	private String memberPositionName;
	public String getLeaveUsedCode() {
		return LeaveUsedCode;
	}
	public void setLeaveUsedCode(String leaveUsedCode) {
		LeaveUsedCode = leaveUsedCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getLeaveCategorySort() {
		return leaveCategorySort;
	}
	public void setLeaveCategorySort(String leaveCategorySort) {
		this.leaveCategorySort = leaveCategorySort;
	}
	public String getLeaveDetailSort() {
		return leaveDetailSort;
	}
	public void setLeaveDetailSort(String leaveDetailSort) {
		this.leaveDetailSort = leaveDetailSort;
	}
	public int getLeaveUsedHour() {
		return leaveUsedHour;
	}
	public void setLeaveUsedHour(int leaveUsedHour) {
		this.leaveUsedHour = leaveUsedHour;
	}
	public int getLeaveUsedDay() {
		return leaveUsedDay;
	}
	public void setLeaveUsedDay(int leaveUsedDay) {
		this.leaveUsedDay = leaveUsedDay;
	}
	public String getLeaveUsedReason() {
		return leaveUsedReason;
	}
	public void setLeaveUsedReason(String leaveUsedReason) {
		this.leaveUsedReason = leaveUsedReason;
	}
	public String getLeaveUsedStartDay() {
		return leaveUsedStartDay;
	}
	public void setLeaveUsedStartDay(String leaveUsedStartDay) {
		this.leaveUsedStartDay = leaveUsedStartDay;
	}
	public String getLeaveUsedEndDay() {
		return leaveUsedEndDay;
	}
	public void setLeaveUsedEndDay(String leaveUsedEndDay) {
		this.leaveUsedEndDay = leaveUsedEndDay;
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
		return "LeaveUsed [LeaveUsedCode=" + LeaveUsedCode + ", memberId=" + memberId + ", leaveCategorySort="
				+ leaveCategorySort + ", leaveDetailSort=" + leaveDetailSort + ", leaveUsedHour=" + leaveUsedHour
				+ ", leaveUsedDay=" + leaveUsedDay + ", leaveUsedReason=" + leaveUsedReason + ", leaveUsedStartDay="
				+ leaveUsedStartDay + ", leaveUsedEndDay=" + leaveUsedEndDay + ", memberEmployeeCode="
				+ memberEmployeeCode + ", memberName=" + memberName + ", departmentName=" + departmentName
				+ ", memberPositionName=" + memberPositionName + "]";
	}
	
}
