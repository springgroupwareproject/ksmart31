package ksmart31.team01.member.service;

import java.util.List;

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
		System.out.println("MemberMyAcademyService memberId : " + memberId);
		
		List<MemberAcademy> myAcatemy = memberMyAcademyMapper.myAcademy(memberId);
		System.out.println("MemberMyEducationService - myEducation : " + myAcatemy);
		
		return myAcatemy;
	}
	
	
	
}
