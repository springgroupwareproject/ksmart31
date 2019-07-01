package ksmart31.team01.department.domain;

public class Department {

	private String departmentCode;
	private String departmentName;
	private int idx;
	private int parentIdx;
	private String departmentCateogoryCode;
	private String departmentCategoryName;
	private String departmentDivisionCode;
	private String departmentDivisionName;
	private String departmentSectionCode;
	private String departmentSectionName;
	private int departmentLevel;
	private String memberDepartmentFinalModifierId;
	private String memberDepartmentFinalModifierName;
	private String memberDepartmentFinalModifyDate;
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getParentIdx() {
		return parentIdx;
	}
	public void setParentIdx(int parentIdx) {
		this.parentIdx = parentIdx;
	}
	public String getDepartmentCateogoryCode() {
		return departmentCateogoryCode;
	}
	public void setDepartmentCateogoryCode(String departmentCateogoryCode) {
		this.departmentCateogoryCode = departmentCateogoryCode;
	}
	public String getDepartmentCategoryName() {
		return departmentCategoryName;
	}
	public void setDepartmentCategoryName(String departmentCategoryName) {
		this.departmentCategoryName = departmentCategoryName;
	}
	public String getDepartmentDivisionCode() {
		return departmentDivisionCode;
	}
	public void setDepartmentDivisionCode(String departmentDivisionCode) {
		this.departmentDivisionCode = departmentDivisionCode;
	}
	public String getDepartmentDivisionName() {
		return departmentDivisionName;
	}
	public void setDepartmentDivisionName(String departmentDivisionName) {
		this.departmentDivisionName = departmentDivisionName;
	}
	public String getDepartmentSectionCode() {
		return departmentSectionCode;
	}
	public void setDepartmentSectionCode(String departmentSectionCode) {
		this.departmentSectionCode = departmentSectionCode;
	}
	public String getDepartmentSectionName() {
		return departmentSectionName;
	}
	public void setDepartmentSectionName(String departmentSectionName) {
		this.departmentSectionName = departmentSectionName;
	}
	public int getDepartmentLevel() {
		return departmentLevel;
	}
	public void setDepartmentLevel(int departmentLevel) {
		this.departmentLevel = departmentLevel;
	}
	public String getMemberDepartmentFinalModifierId() {
		return memberDepartmentFinalModifierId;
	}
	public void setMemberDepartmentFinalModifierId(String memberDepartmentFinalModifierId) {
		this.memberDepartmentFinalModifierId = memberDepartmentFinalModifierId;
	}
	public String getMemberDepartmentFinalModifierName() {
		return memberDepartmentFinalModifierName;
	}
	public void setMemberDepartmentFinalModifierName(String memberDepartmentFinalModifierName) {
		this.memberDepartmentFinalModifierName = memberDepartmentFinalModifierName;
	}
	public String getMemberDepartmentFinalModifyDate() {
		return memberDepartmentFinalModifyDate;
	}
	public void setMemberDepartmentFinalModifyDate(String memberDepartmentFinalModifyDate) {
		this.memberDepartmentFinalModifyDate = memberDepartmentFinalModifyDate;
	}
	@Override
	public String toString() {
		return "Department [departmentCode=" + departmentCode + ", departmentName=" + departmentName + ", idx=" + idx
				+ ", parentIdx=" + parentIdx + ", departmentCateogoryCode=" + departmentCateogoryCode
				+ ", departmentCategoryName=" + departmentCategoryName + ", departmentDivisionCode="
				+ departmentDivisionCode + ", departmentDivisionName=" + departmentDivisionName
				+ ", departmentSectionCode=" + departmentSectionCode + ", departmentSectionName="
				+ departmentSectionName + ", departmentLevel=" + departmentLevel + ", memberDepartmentFinalModifierId="
				+ memberDepartmentFinalModifierId + ", memberDepartmentFinalModifierName="
				+ memberDepartmentFinalModifierName + ", memberDepartmentFinalModifyDate="
				+ memberDepartmentFinalModifyDate + "]";
	}
	
	
	
	
	
	
}
