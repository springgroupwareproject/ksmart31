package ksmart31.team01.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.MemberAcademy;
import ksmart31.team01.member.mapper.MemberMyAcademyMapper;

@Service
@Transactional
public class MemberMyAcademyService {

	@Autowired private MemberMyAcademyMapper memberMyAcademyMapper;
	
	
	public List<MemberAcademy> myAcatemy(String memberId) {
		
		String memberFileCode = memberMyAcademyMapper.memberFilesCode(memberId);
		
		Map<Object, String> map = new HashMap<Object, String>();
		map.put("memberId", memberId);
		map.put("memberFileCode", memberFileCode);
		
		System.out.println("MemberMyEducationService - map : " + map);
		List<MemberAcademy> myAcatemy = memberMyAcademyMapper.myAcademy(map);
		System.out.println("MemberMyEducationService - myEducation : " + myAcatemy);
		
		return myAcatemy;
	}
	
	
	
}
