package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberAcademy;

@Mapper
public interface MemberMyAcademyMapper {

	public List<MemberAcademy> myAcademy(String memberId);
	
}
