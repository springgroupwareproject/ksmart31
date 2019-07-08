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
	
	public void modifyMyProfile(Member member)  {
		System.out.println("MemberMyProfileService member : " + member);
		
		int result = memberMyProfileMapper.updateMyProfile(member);
		
		if(result != 0){
			System.out.println("입력 실패");
		}else {
			System.out.println("입력 성공");
		}
	}
	
}
