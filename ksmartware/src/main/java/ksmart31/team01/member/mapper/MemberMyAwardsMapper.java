package ksmart31.team01.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberAwards;

@Mapper
public interface MemberMyAwardsMapper {

	public String memberFilesCode(String memberId);
	
	public List<MemberAwards> myAwards(Map<Object, String> map);
	
}
