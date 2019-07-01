package ksmart31.team01.accounting.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ksmart31.team01.accounting.domain.MemberAccount;
import ksmart31.team01.accounting.service.MemberAccountService;
import ksmart31.team01.member.domain.Member;

@RestController
public class RestMemberAccountController {
	@Autowired
	private	
	MemberAccountService memberAccountService;
	//memberAccount list
	@GetMapping(value="/getMemberAccount")
	public List<MemberAccount> getMemberAccount(){
		List<MemberAccount> memberAccountList = memberAccountService.getMemberAccountList();
		System.out.println(memberAccountList + "RestMemberAccountController getMemberAccount memberAccountList");
		return memberAccountList;
	}
	//memberAccount insert
	@PostMapping(value="/addMemberAccount")
	public void addMemberAccount(MemberAccount memberAccount) {
		memberAccountService.addMemberAccount(memberAccount);
	}
	//memberId 리스트
	@GetMapping(value="getMemberId")
	public List<Member> getMemberIdList(){
		List<Member> memberIdList = memberAccountService.getMemberIdList();
		System.out.println(memberIdList + "RestMemberAccountController getMemberIdList memberIdList");
		return memberIdList;
	}
}
