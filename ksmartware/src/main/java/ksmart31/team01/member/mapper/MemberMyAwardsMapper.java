package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberAwards;

@Mapper
public interface MemberMyAwardsMapper {

	public List<MemberAwards> myAwards(String memberId);
	
	public int insertMyAwards(MemberAwards memberAwards);
}
