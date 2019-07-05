package ksmart31.team01.member.domain;

import org.springframework.web.multipart.MultipartFile;


public class MemberFiles {

	public String memberFilesCode;
	public String memberId;
	public String memberFilesInfo;
	public String memberFilesOriginName;
	public String memberFilesSaveName;
	public String memberFilesExt;
	public String memberFilesType;
	public int memberFilesSize;
	public String memberFilesDate;
	public String memberEmployeeCode;
	public String memberName;
	public String departmentName;
	public String memberPositionName;
	public MultipartFile selectFile;
	
	
	public String getMemberFilesCode() {
		return memberFilesCode;
	}
	public void setMemberFilesCode(String memberFilesCode) {
		this.memberFilesCode = memberFilesCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberFilesInfo() {
		return memberFilesInfo;
	}
	public void setMemberFilesInfo(String memberFilesInfo) {
		this.memberFilesInfo = memberFilesInfo;
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
	public String getMemberFilesExt() {
		return memberFilesExt;
	}
	public void setMemberFilesExt(String memberFilesExt) {
		this.memberFilesExt = memberFilesExt;
	}
	public String getMemberFilesType() {
		return memberFilesType;
	}
	public void setMemberFilesType(String memberFilesType) {
		this.memberFilesType = memberFilesType;
	}
	public int getMemberFilesSize() {
		return memberFilesSize;
	}
	public void setMemberFilesSize(int memberFilesSize) {
		this.memberFilesSize = memberFilesSize;
	}
	public String getMemberFilesDate() {
		return memberFilesDate;
	}
	public void setMemberFilesDate(String memberFilesDate) {
		this.memberFilesDate = memberFilesDate;
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
	public MultipartFile getSelectFile() {
		return selectFile;
	}
	public void setSelectFile(MultipartFile selectFile) {
		this.selectFile = selectFile;
	}
	
	
	@Override
	public String toString() {
		return "MemberFiles [memberFilesCode=" + memberFilesCode + ", memberId=" + memberId + ", memberFilesInfo="
				+ memberFilesInfo + ", memberFilesOriginName=" + memberFilesOriginName + ", memberFilesSaveName="
				+ memberFilesSaveName + ", memberFilesExt=" + memberFilesExt + ", memberFilesType=" + memberFilesType
				+ ", memberFilesSize=" + memberFilesSize + ", memberFilesDate=" + memberFilesDate
				+ ", memberEmployeeCode=" + memberEmployeeCode + ", memberName=" + memberName + ", departmentName="
				+ departmentName + ", memberPositionName=" + memberPositionName + ", selectFile=" + selectFile + "]";
	}
	


	
	
}
