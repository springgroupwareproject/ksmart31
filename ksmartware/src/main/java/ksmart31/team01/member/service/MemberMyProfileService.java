package ksmart31.team01.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.mapper.MemberMyProfileMapper;

@Service
@Transactional
public class MemberMyProfileService {

	@Autowired private MemberMyProfileMapper memberMyProfileMapper;
	
	public Member myProfile(String memberId) {
		return memberMyProfileMapper.myProfile(memberId);
	}
	
	
}
