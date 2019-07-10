package ksmart31.team01.common.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.admin.mapper.AdminSecurityMapper;
import ksmart31.team01.common.mapper.MemberLoginMapper;
import ksmart31.team01.member.domain.AdminLevel;
import ksmart31.team01.member.domain.Member;

@Service
@Transactional
public class MemberLoginService {
	
	@Autowired private MemberLoginMapper memberLoginMapper;
	@Autowired private AdminSecurityMapper adminSecurityMapper;
	
	// 로그인 처리를 위한 회원 정보 조회
	public Map<String, Object> getMemberForLogin(Member member){
		 System.out.println("MemberLoginService 로그인서비스");
		 
		 Map<String, Object> map = new HashMap<String, Object>();
		 
		 Member resultmember = memberLoginMapper.selectMemberForLogin(member);
		 
		 String memberId = resultmember.getMemberId();
		 AdminLevel adminLevel = adminSecurityMapper.loginSecurity(memberId);
		 
		 map.put("resultmember", resultmember);
		 map.put("adminLevel", adminLevel);
		 
		 return map;
	}
	
}