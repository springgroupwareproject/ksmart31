package ksmart31.team03.leave.domain;

public class LeaveHistory {
	private String LeaveHistoryCode;
	private String memberId;
	private String leaveCategorySort;
	private String leaveCategoryCode;
	private String leaveHistoryGrantHour;
	private String leaveHistoryGrantDay;
	private String leaveHistoryUsedHour;
	private String leaveHistoryUsedDay;
	private String leaveHistoryRemainingHour;
	private String leaveHistoryRemainingDay;
	private String leaveHistoryDate;
	private String memberEmployeeCode;
	private String memberName;
	private String departmentName;
	private String memberPositionName;
	private String memberJoinDay;
	private int leaveCategoryNumber;
	public String getLeaveHistoryCode() {
		return LeaveHistoryCode;
	}
	public void setLeaveHistoryCode(String leaveHistoryCode) {
		LeaveHistoryCode = leaveHistoryCode;
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
	public String getLeaveCategoryCode() {
		return leaveCategoryCode;
	}
	public void setLeaveCategoryCode(String leaveCategoryCode) {
		this.leaveCategoryCode = leaveCategoryCode;
	}
	public String getLeaveHistoryGrantHour() {
		return leaveHistoryGrantHour;
	}
	public void setLeaveHistoryGrantHour(String leaveHistoryGrantHour) {
		this.leaveHistoryGrantHour = leaveHistoryGrantHour;
	}
	public String getLeaveHistoryGrantDay() {
		return leaveHistoryGrantDay;
	}
	public void setLeaveHistoryGrantDay(String leaveHistoryGrantDay) {
		this.leaveHistoryGrantDay = leaveHistoryGrantDay;
	}
	public String getLeaveHistoryUsedHour() {
		return leaveHistoryUsedHour;
	}
	public void setLeaveHistoryUsedHour(String leaveHistoryUsedHour) {
		this.leaveHistoryUsedHour = leaveHistoryUsedHour;
	}
	public String getLeaveHistoryUsedDay() {
		return leaveHistoryUsedDay;
	}
	public void setLeaveHistoryUsedDay(String leaveHistoryUsedDay) {
		this.leaveHistoryUsedDay = leaveHistoryUsedDay;
	}
	public String getLeaveHistoryRemainingHour() {
		return leaveHistoryRemainingHour;
	}
	public void setLeaveHistoryRemainingHour(String leaveHistoryRemainingHour) {
		this.leaveHistoryRemainingHour = leaveHistoryRemainingHour;
	}
	public String getLeaveHistoryRemainingDay() {
		return leaveHistoryRemainingDay;
	}
	public void setLeaveHistoryRemainingDay(String leaveHistoryRemainingDay) {
		this.leaveHistoryRemainingDay = leaveHistoryRemainingDay;
	}
	public String getLeaveHistoryDate() {
		return leaveHistoryDate;
	}
	public void setLeaveHistoryDate(String leaveHistoryDate) {
		this.leaveHistoryDate = leaveHistoryDate;
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
	public String getMemberJoinDay() {
		return memberJoinDay;
	}
	public void setMemberJoinDay(String memberJoinDay) {
		this.memberJoinDay = memberJoinDay;
	}
	public int getLeaveCategoryNumber() {
		return leaveCategoryNumber;
	}
	public void setLeaveCategoryNumber(int leaveCategoryNumber) {
		this.leaveCategoryNumber = leaveCategoryNumber;
	}
	@Override
	public String toString() {
		return "LeaveHistory [LeaveHistoryCode=" + LeaveHistoryCode + ", memberId=" + memberId + ", leaveCategorySort="
				+ leaveCategorySort + ", leaveCategoryCode=" + leaveCategoryCode + ", leaveHistoryGrantHour="
				+ leaveHistoryGrantHour + ", leaveHistoryGrantDay=" + leaveHistoryGrantDay + ", leaveHistoryUsedHour="
				+ leaveHistoryUsedHour + ", leaveHistoryUsedDay=" + leaveHistoryUsedDay + ", leaveHistoryRemainingHour="
				+ leaveHistoryRemainingHour + ", leaveHistoryRemainingDay=" + leaveHistoryRemainingDay
				+ ", leaveHistoryDate=" + leaveHistoryDate + ", memberEmployeeCode=" + memberEmployeeCode
				+ ", memberName=" + memberName + ", departmentName=" + departmentName + ", memberPositionName="
				+ memberPositionName + ", memberJoinDay=" + memberJoinDay + ", leaveCategoryNumber="
				+ leaveCategoryNumber + "]";
	}
	
}	