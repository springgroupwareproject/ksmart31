package ksmart31.team01.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.MemberAwards;
import ksmart31.team01.member.mapper.MemberMyAwardsMapper;

@Service
@Transactional
public class MemberMyAwardsService {

	@Autowired private MemberMyAwardsMapper memberMyAwardsMapper;
	
	public List<MemberAwards> myAwards(String memberId) {
		System.out.println("MemberMyAwardsService memberId : " + memberId);
		
		List<MemberAwards> myAwards = memberMyAwardsMapper.myAwards(memberId);
		System.out.println("MemberMyAwardsService - myEducation : " + myAwards);
		
		return myAwards;	
	}
	
}
