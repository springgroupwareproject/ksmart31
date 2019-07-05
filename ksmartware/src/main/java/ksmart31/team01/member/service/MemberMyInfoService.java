package ksmart31.team01.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.mapper.MemberMyInfoMapper;

@Service
@Transactional
public class MemberMyInfoService {

	@Autowired private MemberMyInfoMapper memberMyInfoMapper;
		
		public Member memberMyInfo(String memberId) {
			return memberMyInfoMapper.memberMyInfo(memberId);
		}
	
}
