package ksmart31.team01.common.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.Member;

@Mapper
public interface MemberLoginMapper {
	public Member selectMemberForLogin(Member member); //로그인 처리를 위한 회원 정보 조회




}