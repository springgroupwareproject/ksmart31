package ksmart31.team01.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.MemberLicense;
import ksmart31.team01.member.mapper.MemberMyLicenseMapper;

@Service
@Transactional
public class MemberMyLicenseService {

	@Autowired private MemberMyLicenseMapper memberMyLicenseMapper;
	
	public List<MemberLicense> myLicense(String memberId) {
		System.out.println("MemberMyLicenseService memberId : " + memberId);
			
		List<MemberLicense> myLicense = memberMyLicenseMapper.myLicense(memberId);
		System.out.println("MemberMyEducationService - myEducation : " + myLicense);
		
		return myLicense;	
		
		
	}
		
}
