package ksmart31.team01.department.domain;

public class DepartmentJoinMember {

	private String memberName;
	private String memberLevelTitle;
	private String departmentCategoryName;
	private String departmentDivisionName;
	private String departmentSectionName;
	private String memberPositionName;
	private String memberId;
	private String memberPhone;
	private String memberMobile;
	private String memberJoinDay;
	private String memberAddress;
	private int departmentNumber;
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberLevelTitle() {
		return memberLevelTitle;
	}
	public void setMemberLevelTitle(String memberLevelTitle) {
		this.memberLevelTitle = memberLevelTitle;
	}
	public String getDepartmentCategoryName() {
		return departmentCategoryName;
	}
	public void setDepartmentCategoryName(String departmentCategoryName) {
		this.departmentCategoryName = departmentCategoryName;
	}
	public String getDepartmentDivisionName() {
		return departmentDivisionName;
	}
	public void setDepartmentDivisionName(String departmentDivisionName) {
		this.departmentDivisionName = departmentDivisionName;
	}
	public String getDepartmentSectionName() {
		return departmentSectionName;
	}
	public void setDepartmentSectionName(String departmentSectionName) {
		this.departmentSectionName = departmentSectionName;
	}
	public String getMemberPositionName() {
		return memberPositionName;
	}
	public void setMemberPositionName(String memberPositionName) {
		this.memberPositionName = memberPositionName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberMobile() {
		return memberMobile;
	}
	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}
	public String getMemberJoinDay() {
		return memberJoinDay;
	}
	public void setMemberJoinDay(String memberJoinDay) {
		this.memberJoinDay = memberJoinDay;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	@Override
	public String toString() {
		return "DepartmentJoinMember [memberName=" + memberName + ", memberLevelTitle=" + memberLevelTitle
				+ ", departmentCategoryName=" + departmentCategoryName + ", departmentDivisionName="
				+ departmentDivisionName + ", departmentSectionName=" + departmentSectionName + ", memberPositionName="
				+ memberPositionName + ", memberId=" + memberId + ", memberPhone=" + memberPhone + ", memberMobile="
				+ memberMobile + ", memberJoinDay=" + memberJoinDay + ", memberAddress=" + memberAddress
				+ ", departmentNumber=" + departmentNumber + "]";
	}
	
	
	
}
