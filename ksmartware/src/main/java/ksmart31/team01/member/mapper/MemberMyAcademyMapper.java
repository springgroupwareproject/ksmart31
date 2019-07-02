package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberAcademy;

@Mapper
public interface MemberMyAcademyMapper {

	public List<MemberAcademy> myAcademy(String memberId); // 교육 이력 정보 출력
	
	
	public void insertMyacademy(MemberAcademy memberAcademy);  // 교육 이력 정보 추가
	
	
	
	
}
