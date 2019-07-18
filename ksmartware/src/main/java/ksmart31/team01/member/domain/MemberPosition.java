package ksmart31.team01.member.domain;

public class MemberPosition {

	private String memberPositionCode;
	private String memberPositionName;
	private int memberPositionRank;
	private String personnelStandardFinalModifierId;
	private String personnelStandardFinalModifierName;
	private String personnelStandardFinalModifyDate;
	
	public String getMemberPositionCode() {
		return memberPositionCode;
	}
	public void setMemberPositionCode(String memberPositionCode) {
		this.memberPositionCode = memberPositionCode;
	}
	public String getMemberPositionName() {
		return memberPositionName;
	}
	public void setMemberPositionName(String memberPositionName) {
		this.memberPositionName = memberPositionName;
	}
	public int getMemberPositionRank() {
		return memberPositionRank;
	}
	public void setMemberPositionRank(int memberPositionRank) {
		this.memberPositionRank = memberPositionRank;
	}
	public String getPersonnelStandardFinalModifierId() {
		return personnelStandardFinalModifierId;
	}
	public void setPersonnelStandardFinalModifierId(String personnelStandardFinalModifierId) {
		this.personnelStandardFinalModifierId = personnelStandardFinalModifierId;
	}
	public String getPersonnelStandardFinalModifierName() {
		return personnelStandardFinalModifierName;
	}
	public void setPersonnelStandardFinalModifierName(String personnelStandardFinalModifierName) {
		this.personnelStandardFinalModifierName = personnelStandardFinalModifierName;
	}
	public String getPersonnelStandardFinalModifyDate() {
		return personnelStandardFinalModifyDate;
	}
	public void setPersonnelStandardFinalModifyDate(String personnelStandardFinalModifyDate) {
		this.personnelStandardFinalModifyDate = personnelStandardFinalModifyDate;
	}
	
	
	@Override
	public String toString() {
		return "MemberPosition [memberPositionCode=" + memberPositionCode + ", memberPositionName=" + memberPositionName
				+ ", memberPositionRank=" + memberPositionRank + ", personnelStandardFinalModifierId="
				+ personnelStandardFinalModifierId + ", personnelStandardFinalModifierName="
				+ personnelStandardFinalModifierName + ", personnelStandardFinalModifyDate="
				+ personnelStandardFinalModifyDate + "]";
	}
	

	
	
	
}
