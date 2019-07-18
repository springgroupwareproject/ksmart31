package ksmart31.team01.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberEducation;
import ksmart31.team01.member.mapper.MemberMyEducationMapper;


@Service
@Transactional
public class MemberMyEducationService {

	@Autowired private MemberMyEducationMapper memberMyEducationMapper;
	
	public void removeMyEducation(String codeNo) { //학력 삭제
		System.out.println("MemberMyEducationService codeNo : " + codeNo);
		memberMyEducationMapper.deleteMyEducation(codeNo);
	}
	
	public void addmyEducation(MemberEducation memberEducation, Member member) { // 학력 입력
		System.out.println("MemberMyEducationService.memberEducation : " + memberEducation);
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberEducation", memberEducation);
		map.put("member", member);
		System.out.println("입력되는값 map : " + map);
		int result = memberMyEducationMapper.addmyEducation(map);
		if(result == 0) {
			System.out.println("입력 실패 : " + result);
		} else {
			System.out.println("입력 성공 : " + result);
		}
	}
	
	public List<MemberEducation> myEducation(String memberId) { // 학력 출력
	
		List<MemberEducation> myEducation = memberMyEducationMapper.myEducation(memberId);
		System.out.println("MemberMyEducationService - myEducation : " + myEducation);
		
		return myEducation;
	}

}