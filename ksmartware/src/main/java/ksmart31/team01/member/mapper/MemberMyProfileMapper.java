package ksmart31.team01.member.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.Member;

@Mapper
public interface MemberMyProfileMapper {
	
	public Member myProfile(String memberId);
	
	
	
	
	
	
	
}
