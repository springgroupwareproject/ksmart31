package ksmart31.team01.member.domain;

public class MemberProject {

	private String memberProjectCode;	// 조직원 프로젝트 정보 코드
	private String memberId;	//	조직원 아이디
	private String memberProjectName;	//	프로젝트 명
	private String memberProjectPlace;	//	수행처
	private String memberProjectStartDay;	//	시작일
	private String memberProjectEndDay;	//	종료일
	private String memberProjectResult;	//	진행중 / 완료 여부
	private String memberProjectDesc;	//	프로젝트 설명
	private String memberProjectUrl;	//	프로젝트 정보의 위치
	private String memberProjectDate;	//	글작성 등록일 쿼리문now()
	private String memberEmployeeCode;	//	사원번호 session
	private String memberName;	//	조직원 이름 session
	private String departmentName;	//	부서명 session
	private String memberPositionName;	//	직위 직책 session
	private String memberFileCode;	//	첨부 파일 코드 join
	
	public String getMemberProjectCode() {
		return memberProjectCode;
	}
	public void setMemberProjectCode(String memberProjectCode) {
		this.memberProjectCode = memberProjectCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberProjectName() {
		return memberProjectName;
	}
	public void setMemberProjectName(String memberProjectName) {
		this.memberProjectName = memberProjectName;
	}
	public String getMemberProjectPlace() {
		return memberProjectPlace;
	}
	public void setMemberProjectPlace(String memberProjectPlace) {
		this.memberProjectPlace = memberProjectPlace;
	}
	public String getMemberProjectStartDay() {
		return memberProjectStartDay;
	}
	public void setMemberProjectStartDay(String memberProjectStartDay) {
		this.memberProjectStartDay = memberProjectStartDay;
	}
	public String getMemberProjectEndDay() {
		return memberProjectEndDay;
	}
	public void setMemberProjectEndDay(String memberProjectEndDay) {
		this.memberProjectEndDay = memberProjectEndDay;
	}
	public String getMemberProjectResult() {
		return memberProjectResult;
	}
	public void setMemberProjectResult(String memberProjectResult) {
		this.memberProjectResult = memberProjectResult;
	}
	public String getMemberProjectDesc() {
		return memberProjectDesc;
	}
	public void setMemberProjectDesc(String memberProjectDesc) {
		this.memberProjectDesc = memberProjectDesc;
	}
	public String getMemberProjectUrl() {
		return memberProjectUrl;
	}
	public void setMemberProjectUrl(String memberProjectUrl) {
		this.memberProjectUrl = memberProjectUrl;
	}
	public String getMemberProjectDate() {
		return memberProjectDate;
	}
	public void setMemberProjectDate(String memberProjectDate) {
		this.memberProjectDate = memberProjectDate;
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
	@Override
	public String toString() {
		return "MemberProject [memberProjectCode=" + memberProjectCode + ", memberId=" + memberId
				+ ", memberProjectName=" + memberProjectName + ", memberProjectPlace=" + memberProjectPlace
				+ ", memberProjectStartDay=" + memberProjectStartDay + ", memberProjectEndDay=" + memberProjectEndDay
				+ ", memberProjectResult=" + memberProjectResult + ", memberProjectDesc=" + memberProjectDesc
				+ ", memberProjectUrl=" + memberProjectUrl + ", memberProjectDate=" + memberProjectDate
				+ ", memberEmployeeCode=" + memberEmployeeCode + ", memberName=" + memberName + ", departmentName="
				+ departmentName + ", memberPositionName=" + memberPositionName + ", memberFileCode=" + memberFileCode
				+ "]";
	}
	
	
	
	
}
