package ksmart31.team01.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team01.member.domain.MemberCareer;
import ksmart31.team01.member.mapper.MemberMyCareerMapper;

@Service
public class MemberMyCareerService {


	@Autowired private MemberMyCareerMapper memberMyCareerMapper;
	
	public List<MemberCareer> myCareer(String memberId) {
		List<MemberCareer> myCareer = memberMyCareerMapper.myCareer(memberId);
		return myCareer;
	}
	
	
}
