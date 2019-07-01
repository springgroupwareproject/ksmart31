package ksmart31.team01.accounting.domain;

public class MemberAccount {

	public String memberAccountCode;
	public String memberName;
	public String memberId;
	public String memberAccountBank;
	public String memberAccountNumber;
	public String memberAccountDate;
	public String registrationMemberId;
	public String memberEmployeeCode;
	public String departmentName;
	public String memberPositionName;
	public String getMemberAccountCode() {
		return memberAccountCode;
	}
	public void setMemberAccountCode(String memberAccountCode) {
		this.memberAccountCode = memberAccountCode;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberAccountBank() {
		return memberAccountBank;
	}
	public void setMemberAccountBank(String memberAccountBank) {
		this.memberAccountBank = memberAccountBank;
	}
	public String getMemberAccountNumber() {
		return memberAccountNumber;
	}
	public void setMemberAccountNumber(String memberAccountNumber) {
		this.memberAccountNumber = memberAccountNumber;
	}
	public String getMemberAccountDate() {
		return memberAccountDate;
	}
	public void setMemberAccountDate(String memberAccountDate) {
		this.memberAccountDate = memberAccountDate;
	}
	public String getRegistrationMemberId() {
		return registrationMemberId;
	}
	public void setRegistrationMemberId(String registrationMemberId) {
		this.registrationMemberId = registrationMemberId;
	}
	public String getMemberEmployeeCode() {
		return memberEmployeeCode;
	}
	public void setMemberEmployeeCode(String memberEmployeeCode) {
		this.memberEmployeeCode = memberEmployeeCode;
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
		return "MemberAccount [memberAccountCode=" + memberAccountCode + ", memberName=" + memberName + ", memberId="
				+ memberId + ", memberAccountBank=" + memberAccountBank + ", memberAccountNumber=" + memberAccountNumber
				+ ", memberAccountDate=" + memberAccountDate + ", registrationMemberId=" + registrationMemberId
				+ ", memberEmployeeCode=" + memberEmployeeCode + ", departmentName=" + departmentName
				+ ", memberPositionName=" + memberPositionName + "]";
	}
	
	
}
