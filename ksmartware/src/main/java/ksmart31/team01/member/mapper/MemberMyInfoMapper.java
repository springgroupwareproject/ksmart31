package ksmart31.team01.member.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.Member;

@Mapper
public interface MemberMyInfoMapper {

	public Member memberMyInfo(String memberId);


}
