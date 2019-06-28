package ksmart31.team03.leave.domain;

public class LeaveHistory {
	private String LeaveHistoryCode;
	private String memberId;
	private String leaveCategorySort;
	private String leaveCategoryCode;
	private int leaveHistoryGrantHour;
	private int leaveHistoryGrantDay;
	private int leaveHistoryUsedHour;
	private int leaveHistoryUsedDay;
	private int leaveHistoryRemainingHour;
	private int leaveHistoryRemainingDay;
	private String leaveHistoryDate;
	private String memberEmployeeCode;
	private String memberName;
	private String departmentName;
	private String memberPositionName;
	private String memberJoinDay;
	
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
	public int getLeaveHistoryGrantHour() {
		return leaveHistoryGrantHour;
	}
	public void setLeaveHistoryGrantHour(int leaveHistoryGrantHour) {
		this.leaveHistoryGrantHour = leaveHistoryGrantHour;
	}
	public int getLeaveHistoryGrantDay() {
		return leaveHistoryGrantDay;
	}
	public void setLeaveHistoryGrantDay(int leaveHistoryGrantDay) {
		this.leaveHistoryGrantDay = leaveHistoryGrantDay;
	}
	public int getLeaveHistoryUsedHour() {
		return leaveHistoryUsedHour;
	}
	public void setLeaveHistoryUsedHour(int leaveHistoryUsedHour) {
		this.leaveHistoryUsedHour = leaveHistoryUsedHour;
	}
	public int getLeaveHistoryUsedDay() {
		return leaveHistoryUsedDay;
	}
	public void setLeaveHistoryUsedDay(int leaveHistoryUsedDay) {
		this.leaveHistoryUsedDay = leaveHistoryUsedDay;
	}
	public int getLeaveHistoryRemainingHour() {
		return leaveHistoryRemainingHour;
	}
	public void setLeaveHistoryRemainingHour(int leaveHistoryRemainingHour) {
		this.leaveHistoryRemainingHour = leaveHistoryRemainingHour;
	}
	public int getLeaveHistoryRemainingDay() {
		return leaveHistoryRemainingDay;
	}
	public void setLeaveHistoryRemainingDay(int leaveHistoryRemainingDay) {
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
	@Override
	public String toString() {
		return "LeaveHistory [LeaveHistoryCode=" + LeaveHistoryCode + ", memberId=" + memberId + ", leaveCategorySort="
				+ leaveCategorySort + ", leaveCategoryCode=" + leaveCategoryCode + ", leaveHistoryGrantHour="
				+ leaveHistoryGrantHour + ", leaveHistoryGrantDay=" + leaveHistoryGrantDay + ", leaveHistoryUsedHour="
				+ leaveHistoryUsedHour + ", leaveHistoryUsedDay=" + leaveHistoryUsedDay + ", leaveHistoryRemainingHour="
				+ leaveHistoryRemainingHour + ", leaveHistoryRemainingDay=" + leaveHistoryRemainingDay
				+ ", leaveHistoryDate=" + leaveHistoryDate + ", memberEmployeeCode=" + memberEmployeeCode
				+ ", memberName=" + memberName + ", departmentName=" + departmentName + ", memberPositionName="
				+ memberPositionName + ", memberJoinDay=" + memberJoinDay + "]";
	}
}	