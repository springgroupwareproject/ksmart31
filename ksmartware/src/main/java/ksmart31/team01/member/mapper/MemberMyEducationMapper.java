package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberEducation;

@Mapper
public interface MemberMyEducationMapper {
	
	public List<MemberEducation> myEducation(String memberId);
	
	
}
