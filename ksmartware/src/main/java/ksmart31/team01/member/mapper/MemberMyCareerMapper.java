package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberCareer;

@Mapper
public interface MemberMyCareerMapper {

	public List<MemberCareer> myCareer(String memberId);
	
	
}
