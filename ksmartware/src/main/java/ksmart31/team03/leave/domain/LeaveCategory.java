package ksmart31.team03.leave.domain;

public class LeaveCategory {
	private String leaveCategoryCode;
	private String leaveCategorySort;
	private String leaveCategoryUseOrNot;
	private String memberId;
	private String leaveCategoryCodeDate;
	public String getLeaveCategoryCode() {
		return leaveCategoryCode;
	}
	public void setLeaveCategoryCode(String leaveCategoryCode) {
		this.leaveCategoryCode = leaveCategoryCode;
	}
	public String getLeaveCategorySort() {
		return leaveCategorySort;
	}
	public void setLeaveCategorySort(String leaveCategorySort) {
		this.leaveCategorySort = leaveCategorySort;
	}
	public String getLeaveCategoryUseOrNot() {
		return leaveCategoryUseOrNot;
	}
	public void setLeaveCategoryUseOrNot(String leaveCategoryUseOrNot) {
		this.leaveCategoryUseOrNot = leaveCategoryUseOrNot;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getLeaveCategoryCodeDate() {
		return leaveCategoryCodeDate;
	}
	public void setLeaveCategoryCodeDate(String leaveCategoryCodeDate) {
		this.leaveCategoryCodeDate = leaveCategoryCodeDate;
	}
	@Override
	public String toString() {
		return "leaveCategory [leaveCategoryCode=" + leaveCategoryCode + ", leaveCategorySort=" + leaveCategorySort
				+ ", leaveCategoryUseOrNot=" + leaveCategoryUseOrNot + ", memberId=" + memberId
				+ ", leaveCategoryCodeDate=" + leaveCategoryCodeDate + "]";
	}
	
}
