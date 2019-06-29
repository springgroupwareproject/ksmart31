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
		
		String memberFileCode = memberMyAwardsMapper.memberFilesCode(memberId);
		
		Map<Object, String> map = new HashMap<Object, String>();
		map.put("memberId", memberId);
		map.put("memberFileCode", memberFileCode);
		
		System.out.println("MemberMyAwardsService - map : " + map);
		List<MemberAwards> myAwards = memberMyAwardsMapper.myAwards(map);
		System.out.println("MemberMyAwardsService - myEducation : " + myAwards);
		
		return myAwards;	
	}
	
}
