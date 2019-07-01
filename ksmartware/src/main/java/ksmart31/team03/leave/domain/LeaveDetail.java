package ksmart31.team03.leave.domain;

public class LeaveDetail {
	private String leaveDetailCode;
	private String leaveCategoryCode;
	private String leaveDetailSort;
	private int leaveDetailHour;
	private int leaveDetailDay;
	private String leaveDetailUseOrNot;
	private int leaveDetailMinimumHour;
	private int leaveDetailMinimumDay;
	private int leaveDetailMaximumHour;
	private int leaveDetailMaximumDay;
	private String memberId;
	private String leaveCategoryDate;
	public String getLeaveDetailCode() {
		return leaveDetailCode;
	}
	public void setLeaveDetailCode(String leaveDetailCode) {
		this.leaveDetailCode = leaveDetailCode;
	}
	public String getLeaveCategoryCode() {
		return leaveCategoryCode;
	}
	public void setLeaveCategoryCode(String leaveCategoryCode) {
		this.leaveCategoryCode = leaveCategoryCode;
	}
	public String getLeaveDetailSort() {
		return leaveDetailSort;
	}
	public void setLeaveDetailSort(String leaveDetailSort) {
		this.leaveDetailSort = leaveDetailSort;
	}
	public int getLeaveDetailHour() {
		return leaveDetailHour;
	}
	public void setLeaveDetailHour(int leaveDetailHour) {
		this.leaveDetailHour = leaveDetailHour;
	}
	public int getLeaveDetailDay() {
		return leaveDetailDay;
	}
	public void setLeaveDetailDay(int leaveDetailDay) {
		this.leaveDetailDay = leaveDetailDay;
	}
	public String getLeaveDetailUseOrNot() {
		return leaveDetailUseOrNot;
	}
	public void setLeaveDetailUseOrNot(String leaveDetailUseOrNot) {
		this.leaveDetailUseOrNot = leaveDetailUseOrNot;
	}
	public int getLeaveDetailMinimumHour() {
		return leaveDetailMinimumHour;
	}
	public void setLeaveDetailMinimumHour(int leaveDetailMinimumHour) {
		this.leaveDetailMinimumHour = leaveDetailMinimumHour;
	}
	public int getLeaveDetailMinimumDay() {
		return leaveDetailMinimumDay;
	}
	public void setLeaveDetailMinimumDay(int leaveDetailMinimumDay) {
		this.leaveDetailMinimumDay = leaveDetailMinimumDay;
	}
	public int getLeaveDetailMaximumHour() {
		return leaveDetailMaximumHour;
	}
	public void setLeaveDetailMaximumHour(int leaveDetailMaximumHour) {
		this.leaveDetailMaximumHour = leaveDetailMaximumHour;
	}
	public int getLeaveDetailMaximumDay() {
		return leaveDetailMaximumDay;
	}
	public void setLeaveDetailMaximumDay(int leaveDetailMaximumDay) {
		this.leaveDetailMaximumDay = leaveDetailMaximumDay;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getLeaveCategoryDate() {
		return leaveCategoryDate;
	}
	public void setLeaveCategoryDate(String leaveCategoryDate) {
		this.leaveCategoryDate = leaveCategoryDate;
	}
	@Override
	public String toString() {
		return "LeaveDetail [leaveDetailCode=" + leaveDetailCode + ", leaveCategoryCode=" + leaveCategoryCode
				+ ", leaveDetailSort=" + leaveDetailSort + ", leaveDetailHour=" + leaveDetailHour + ", leaveDetailDay="
				+ leaveDetailDay + ", leaveDetailUseOrNot=" + leaveDetailUseOrNot + ", leaveDetailMinimumHour="
				+ leaveDetailMinimumHour + ", leaveDetailMinimumDay=" + leaveDetailMinimumDay
				+ ", leaveDetailMaximumHour=" + leaveDetailMaximumHour + ", leaveDetailMaximumDay="
				+ leaveDetailMaximumDay + ", memberId=" + memberId + ", leaveCategoryDate=" + leaveCategoryDate + "]";
	}
	
	
}
