package ksmart31.team01.department.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.department.domain.Department;
import ksmart31.team01.department.domain.DepartmentJoinMember;
import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberAcademy;
import ksmart31.team01.member.domain.MemberAwards;
import ksmart31.team01.member.domain.MemberCareer;
import ksmart31.team01.member.domain.MemberEducation;
import ksmart31.team01.member.domain.MemberLicense;
import ksmart31.team01.member.domain.MemberPosition;
import ksmart31.team01.member.domain.MemberProject;
import ksmart31.team01.member.domain.MemberProjectMemberFiles;

@Mapper
public interface DepartmentMapper {
	//조직도 리스트
	public List<Department> selectDepartmentList();
	//department부서명과 member조직원 기본정보를 조인
	public List<DepartmentJoinMember> selectDepartmentJoinMemberList(Map<String, Object> map);
	// memberId 로 조인 조회
	public List<DepartmentJoinMember> selectDepartmentJoinMemberListByMemberId(String memberId);	
	// member insert
	public int insertMember(Member member);
	//departmentName select
	public List<Department> selectDepartmentName();
	//department_category_name selectList
	public List<Department> selectDepartmentCategoryName();
	//department_division_name selectList
	public List<Department> selectDepartmentDivisionName();
	//department_section_name selectList
	public List<Department> selectDepartmentSectionName();
	//memberPosition select
	public List<MemberPosition> selectMemberPositon();
	//memberProfile select
	public Member selectMemberMyProfile(String memberId);
	//memberInfo select
	public Member selectMemberMyInfo(String memberId);
	//memberEducation select
	public List<MemberEducation> selectMemberMyEducation(String memberId);
	//memberProject select
	public List<MemberProject> selectMemberMyProject(String memberId);
	//memberLicense select
	public List<MemberLicense> selectMemberMyLicense(String memberId);
	//memberAcademy select
	public List<MemberAcademy> selectMemberMyAcademy(String memberId);
	//memberCareer select
	public List<MemberCareer> selectMemberMyCareer(String memberId);
	//memberAwards select
	public List<MemberAwards> selectMemberMyAwards(String memberId);
}	
