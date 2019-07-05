package ksmart31.team01.member.domain;

public class MemberLicense {

	private String memberLicenseCode;	// 자격증 코드
	private String memberId;	// 조직원 아이디
	private String memberLicenseName;	// 자격증 명
	private String memberLicenseAuthentication;	// 인증기관
	private String memberLicenseNumber;	// 자격증 번호
	private String memberLicenseStartDay;	// 유효기간 시작일
	private String memberLicenseEndDay;	// 유효기간 종료일
	private String memberLicenseExpiration;	// 만료일 여부
	private String memberLicenseUrl;	// 자격증 URL
	private String memberLicenseDate;	// 자격증 글작성 등록일
	private String memberEmployeeCode;	// 사번
	private String memberName;	// 조직원 이름
	private String departmentName;	// 부서명
	private String memberPositionName;	// 직위 직책
	private String memberFileCode;	// 첨부파일 코드
	private String memberFilesOriginName;	// 첨부파일 오리진이름
	private String memberFilesSaveName;	// 첨부파일 저장이름
	
	public String getMemberLicenseCode() {
		return memberLicenseCode;
	}
	public void setMemberLicenseCode(String memberLicenseCode) {
		this.memberLicenseCode = memberLicenseCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberLicenseName() {
		return memberLicenseName;
	}
	public void setMemberLicenseName(String memberLicenseName) {
		this.memberLicenseName = memberLicenseName;
	}
	public String getMemberLicenseAuthentication() {
		return memberLicenseAuthentication;
	}
	public void setMemberLicenseAuthentication(String memberLicenseAuthentication) {
		this.memberLicenseAuthentication = memberLicenseAuthentication;
	}
	public String getMemberLicenseNumber() {
		return memberLicenseNumber;
	}
	public void setMemberLicenseNumber(String memberLicenseNumber) {
		this.memberLicenseNumber = memberLicenseNumber;
	}
	public String getMemberLicenseStartDay() {
		return memberLicenseStartDay;
	}
	public void setMemberLicenseStartDay(String memberLicenseStartDay) {
		this.memberLicenseStartDay = memberLicenseStartDay;
	}
	public String getMemberLicenseEndDay() {
		return memberLicenseEndDay;
	}
	public void setMemberLicenseEndDay(String memberLicenseEndDay) {
		this.memberLicenseEndDay = memberLicenseEndDay;
	}
	public String getMemberLicenseExpiration() {
		return memberLicenseExpiration;
	}
	public void setMemberLicenseExpiration(String memberLicenseExpiration) {
		this.memberLicenseExpiration = memberLicenseExpiration;
	}
	public String getMemberLicenseUrl() {
		return memberLicenseUrl;
	}
	public void setMemberLicenseUrl(String memberLicenseUrl) {
		this.memberLicenseUrl = memberLicenseUrl;
	}
	public String getMemberLicenseDate() {
		return memberLicenseDate;
	}
	public void setMemberLicenseDate(String memberLicenseDate) {
		this.memberLicenseDate = memberLicenseDate;
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
		return "MemberLicense [memberLicenseCode=" + memberLicenseCode + ", memberId=" + memberId
				+ ", memberLicenseName=" + memberLicenseName + ", memberLicenseAuthentication="
				+ memberLicenseAuthentication + ", memberLicenseNumber=" + memberLicenseNumber
				+ ", memberLicenseStartDay=" + memberLicenseStartDay + ", memberLicenseEndDay=" + memberLicenseEndDay
				+ ", memberLicenseExpiration=" + memberLicenseExpiration + ", memberLicenseUrl=" + memberLicenseUrl
				+ ", memberLicenseDate=" + memberLicenseDate + ", memberEmployeeCode=" + memberEmployeeCode
				+ ", memberName=" + memberName + ", departmentName=" + departmentName + ", memberPositionName="
				+ memberPositionName + ", memberFileCode=" + memberFileCode + ", memberFilesOriginName="
				+ memberFilesOriginName + ", memberFilesSaveName=" + memberFilesSaveName + "]";
	}
	
	
	
	
	
	
}
