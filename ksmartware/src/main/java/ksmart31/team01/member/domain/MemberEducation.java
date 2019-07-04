package ksmart31.team01.member.domain;

public class MemberEducation {

	private String memberEducationCode;
	private String memberId;
	private String memberEducationInstitutionStandard; // 교육기관 구분
	private String memberEducationInstitution; // 학교명
	private String memberEducationStartDay; // 재학기간 시작일
	private String memberEducationEndDay;	// 재학기간 종료일
	private String memberEducationNow;	// 재학여부
	private String memberEducationDegree;	// 학위
	private String memberEducationMajor;	// 전공
	private int memberEducationGrade;	// 학점
	private int memberEducationTotalScore;	// 총점
	private String memberEducationDesc;	// 설명
	private String memberEducationDate; // 등록일
	private String memberEmployeeCode;
	private String memberName;
	private String departmentName;
	private String memberPositionName;
	private String memberFileCode;
	private String memberFilesOriginName;
	private String memberFilesSaveName;
	
	
	public String getMemberEducationCode() {
		return memberEducationCode;
	}



	public void setMemberEducationCode(String memberEducationCode) {
		this.memberEducationCode = memberEducationCode;
	}



	public String getMemberId() {
		return memberId;
	}



	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}



	public String getMemberEducationInstitutionStandard() {
		return memberEducationInstitutionStandard;
	}



	public void setMemberEducationInstitutionStandard(String memberEducationInstitutionStandard) {
		this.memberEducationInstitutionStandard = memberEducationInstitutionStandard;
	}



	public String getMemberEducationInstitution() {
		return memberEducationInstitution;
	}



	public void setMemberEducationInstitution(String memberEducationInstitution) {
		this.memberEducationInstitution = memberEducationInstitution;
	}



	public String getMemberEducationStartDay() {
		return memberEducationStartDay;
	}



	public void setMemberEducationStartDay(String memberEducationStartDay) {
		this.memberEducationStartDay = memberEducationStartDay;
	}



	public String getMemberEducationEndDay() {
		return memberEducationEndDay;
	}



	public void setMemberEducationEndDay(String memberEducationEndDay) {
		this.memberEducationEndDay = memberEducationEndDay;
	}



	public String getMemberEducationNow() {
		return memberEducationNow;
	}



	public void setMemberEducationNow(String memberEducationNow) {
		this.memberEducationNow = memberEducationNow;
	}



	public String getMemberEducationDegree() {
		return memberEducationDegree;
	}



	public void setMemberEducationDegree(String memberEducationDegree) {
		this.memberEducationDegree = memberEducationDegree;
	}



	public String getMemberEducationMajor() {
		return memberEducationMajor;
	}



	public void setMemberEducationMajor(String memberEducationMajor) {
		this.memberEducationMajor = memberEducationMajor;
	}



	public int getMemberEducationGrade() {
		return memberEducationGrade;
	}



	public void setMemberEducationGrade(int memberEducationGrade) {
		this.memberEducationGrade = memberEducationGrade;
	}



	public int getMemberEducationTotalScore() {
		return memberEducationTotalScore;
	}



	public void setMemberEducationTotalScore(int memberEducationTotalScore) {
		this.memberEducationTotalScore = memberEducationTotalScore;
	}



	public String getMemberEducationDesc() {
		return memberEducationDesc;
	}



	public void setMemberEducationDesc(String memberEducationDesc) {
		this.memberEducationDesc = memberEducationDesc;
	}



	public String getMemberEducationDate() {
		return memberEducationDate;
	}



	public void setMemberEducationDate(String memberEducationDate) {
		this.memberEducationDate = memberEducationDate;
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



	public String getMemberFileCode() {
		return memberFileCode;
	}



	public void setMemberFileCode(String memberFileCode) {
		this.memberFileCode = memberFileCode;
	}



	public String getMemberFilesOriginName() {
		return memberFilesOriginName;
	}



	public void setMemberFilesOriginName(String memberFilesOriginName) {
		this.memberFilesOriginName = memberFilesOriginName;
	}



	public String getMemberFilesSaveName() {
		return memberFilesSaveName;
	}



	public void setMemberFilesSaveName(String memberFilesSaveName) {
		this.memberFilesSaveName = memberFilesSaveName;
	}



	@Override
	public String toString() {
		return "MemberEducation [memberEducationCode=" + memberEducationCode + ", memberId=" + memberId
				+ ", memberEducationInstitutionStandard=" + memberEducationInstitutionStandard
				+ ", memberEducationInstitution=" + memberEducationInstitution + ", memberEducationStartDay="
				+ memberEducationStartDay + ", memberEducationEndDay=" + memberEducationEndDay + ", memberEducationNow="
				+ memberEducationNow + ", memberEducationDegree=" + memberEducationDegree + ", memberEducationMajor="
				+ memberEducationMajor + ", memberEducationGrade=" + memberEducationGrade
				+ ", memberEducationTotalScore=" + memberEducationTotalScore + ", memberEducationDesc="
				+ memberEducationDesc + ", memberEducationDate=" + memberEducationDate + ", memberEmployeeCode="
				+ memberEmployeeCode + ", memberName=" + memberName + ", departmentName=" + departmentName
				+ ", memberPositionName=" + memberPositionName + ", memberFileCode=" + memberFileCode
				+ ", memberFilesOriginName=" + memberFilesOriginName + ", memberFilesSaveName=" + memberFilesSaveName
				+ "]";
	}
	
	
	
	
	
}
