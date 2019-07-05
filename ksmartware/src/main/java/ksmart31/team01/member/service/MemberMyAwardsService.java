package ksmart31.team01.member.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberAwards;
import ksmart31.team01.member.mapper.MemberMyAwardsMapper;

@Service
@Transactional
public class MemberMyAwardsService {

	@Autowired private  MemberMyAwardsMapper memberMyAwardsMapper;
	
	public void insertMyAwards(HttpSession session,  MemberAwards memberAwards) {
		System.out.println("나의 수상 이력 입력 실행");


		Member member = (Member) session.getAttribute("loginMember");  // member = 아이디,사번,조직원이름,부서명,직위직책,
		memberAwards.setMemberId(member.getMemberId());
		memberAwards.setMemberEmployeeCode(member.getMemberEmployeeCode());
		memberAwards.setMemberName(member.getMemberName());
		memberAwards.setDepartmentName(member.getDepartmentName());
		memberAwards.setMemberPositionName(member.getMemberPositionName());
	
		System.out.println("MemberMyAwardsService.insertMyAwards() 입력되는 나의 수상 이력 값 : " + memberAwards);
	
		int result = memberMyAwardsMapper.insertMyAwards(memberAwards);
		
		if(result != 0) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
	}
	
	
	public List<MemberAwards> myAwards(String memberId) {
		System.out.println("MemberMyAwardsService memberId : " + memberId);
		
		List<MemberAwards> myAwards = memberMyAwardsMapper.myAwards(memberId);
		System.out.println("MemberMyAwardsService - myEducation : " + myAwards);
		
		return myAwards;	
	}
	
}
