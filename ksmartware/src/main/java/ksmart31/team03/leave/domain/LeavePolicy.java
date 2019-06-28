package ksmart31.team03.leave.domain;

public class LeavePolicy {
	private String leavePolicyCode;
	private String leaveCategoryCode;
	private String leavePolicyTitle;
	private String leavePolicyStandard;
	private int leavePolicyStartPoint;
	private String leavePolicyStartUnit;
	private int leavePolicyDays;
	private String leaveCategoryDate;
	private String memberId;
	public String getLeavePolicyCode() {
		return leavePolicyCode;
	}
	public void setLeavePolicyCode(String leavePolicyCode) {
		this.leavePolicyCode = leavePolicyCode;
	}
	public String getLeaveCategoryCode() {
		return leaveCategoryCode;
	}
	public void setLeaveCategoryCode(String leaveCategoryCode) {
		this.leaveCategoryCode = leaveCategoryCode;
	}
	public String getLeavePolicyTitle() {
		return leavePolicyTitle;
	}
	public void setLeavePolicyTitle(String leavePolicyTitle) {
		this.leavePolicyTitle = leavePolicyTitle;
	}
	public String getLeavePolicyStandard() {
		return leavePolicyStandard;
	}
	public void setLeavePolicyStandard(String leavePolicyStandard) {
		this.leavePolicyStandard = leavePolicyStandard;
	}
	public int getLeavePolicyStartPoint() {
		return leavePolicyStartPoint;
	}
	public void setLeavePolicyStartPoint(int leavePolicyStartPoint) {
		this.leavePolicyStartPoint = leavePolicyStartPoint;
	}
	public String getLeavePolicyStartUnit() {
		return leavePolicyStartUnit;
	}
	public void setLeavePolicyStartUnit(String leavePolicyStartUnit) {
		this.leavePolicyStartUnit = leavePolicyStartUnit;
	}
	public int getLeavePolicyDays() {
		return leavePolicyDays;
	}
	public void setLeavePolicyDays(int leavePolicyDays) {
		this.leavePolicyDays = leavePolicyDays;
	}
	public String getLeaveCategoryDate() {
		return leaveCategoryDate;
	}
	public void setLeaveCategoryDate(String leaveCategoryDate) {
		this.leaveCategoryDate = leaveCategoryDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "leavePolicy [leavePolicyCode=" + leavePolicyCode + ", leaveCategoryCode=" + leaveCategoryCode
				+ ", leavePolicyTitle=" + leavePolicyTitle + ", leavePolicyStandard=" + leavePolicyStandard
				+ ", leavePolicyStartPoint=" + leavePolicyStartPoint + ", leavePolicyStartUnit=" + leavePolicyStartUnit
				+ ", leavePolicyDays=" + leavePolicyDays + ", leaveCategoryDate=" + leaveCategoryDate + ", memberId="
				+ memberId + "]";
	}
	
}
