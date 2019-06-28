package ksmart31.team03.leave.domain;

public class LeaveGrant {
	private String leaveGrantCode;
	private String memberId;
	private String leaveCategorySort;
	private int leaveGrantHour;
	private int leaveGrantDay;
	private String leaveGrantReason;
	private String leaveGrantDate;
	private String memberEmployeeCode;
	private String memberName;
	private String departmentName;
	private String memberPositionName;
	public String getLeaveGrantCode() {
		return leaveGrantCode;
	}
	public void setLeaveGrantCode(String leaveGrantCode) {
		this.leaveGrantCode = leaveGrantCode;
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
	public int getLeaveGrantHour() {
		return leaveGrantHour;
	}
	public void setLeaveGrantHour(int leaveGrantHour) {
		this.leaveGrantHour = leaveGrantHour;
	}
	public int getLeaveGrantDay() {
		return leaveGrantDay;
	}
	public void setLeaveGrantDay(int leaveGrantDay) {
		this.leaveGrantDay = leaveGrantDay;
	}
	public String getLeaveGrantReason() {
		return leaveGrantReason;
	}
	public void setLeaveGrantReason(String leaveGrantReason) {
		this.leaveGrantReason = leaveGrantReason;
	}
	public String getLeaveGrantDate() {
		return leaveGrantDate;
	}
	public void setLeaveGrantDate(String leaveGrantDate) {
		this.leaveGrantDate = leaveGrantDate;
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
		return "LeaveGrant [leaveGrantCode=" + leaveGrantCode + ", memberId=" + memberId + ", leaveCategorySort="
				+ leaveCategorySort + ", leaveGrantHour=" + leaveGrantHour + ", leaveGrantDay=" + leaveGrantDay
				+ ", leaveGrantReason=" + leaveGrantReason + ", leaveGrantDate=" + leaveGrantDate
				+ ", memberEmployeeCode=" + memberEmployeeCode + ", memberName=" + memberName + ", departmentName="
				+ departmentName + ", memberPositionName=" + memberPositionName + "]";
	}
}
