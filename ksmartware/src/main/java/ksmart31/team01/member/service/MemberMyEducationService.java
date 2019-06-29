package ksmart31.team01.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.MemberEducation;
import ksmart31.team01.member.mapper.MemberMyEducationMapper;


@Service
@Transactional
public class MemberMyEducationService {

	@Autowired private MemberMyEducationMapper memberMyEducationMapper;
	
	public List<MemberEducation> myEducation(String memberId) {
	
		String memberFileCode = memberMyEducationMapper.memberFilesCode(memberId);
		
		Map<Object, String> map = new HashMap<Object, String>();
		map.put("memberId", memberId);
		map.put("memberFileCode", memberFileCode);
		
		System.out.println("MemberMyEducationService - map : " + map);
		List<MemberEducation> myEducation = memberMyEducationMapper.myEducation(map);
		System.out.println("MemberMyEducationService - myEducation : " + myEducation);
		
		
		return myEducation;
	}
}