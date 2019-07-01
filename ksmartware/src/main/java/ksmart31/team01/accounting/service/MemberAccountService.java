package ksmart31.team01.accounting.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ksmart31.team01.accounting.mapper.MemberAccountMapper;
import ksmart31.team01.member.domain.Member;
import ksmart31.team01.accounting.domain.MemberAccount;

@Service
@Transactional
public class MemberAccountService {
	@Autowired
	private MemberAccountMapper memberAccountMapper;
	//MemberAccount 리스트
	public List<MemberAccount> getMemberAccountList(){
		List<MemberAccount> list = memberAccountMapper.selectMemberAccountList();
		System.out.println(list + "MemberAccountService getMemberAccountList list");
		return list;
	}
	//memberAccount insert
	public int addMemberAccount(MemberAccount memberAccount) {
		return memberAccountMapper.insertMemberAccount(memberAccount);
	}
	//memberId list
	public List<Member> getMemberIdList(){
		List<Member> list = memberAccountMapper.selectMemberIdList();
		System.out.println(list + "MemberAccountService getMemberIdList list");
		return list;
	}
	
}
