package ksmart31.team01.accounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ksmart31.team01.accounting.domain.MemberAccount;
import ksmart31.team01.accounting.service.MemberAccountService;

@RestController
public class RestMemberAccountController {
	@Autowired
	private MemberAccountService memberAccountService;
	//memberAccount 리스트
	@GetMapping(value="/getMemberAccount")
	public List<MemberAccount> getMemberAccount(){
		List<MemberAccount> memberAccountList = memberAccountService.getMemberAccountList();
		System.out.println(memberAccountList +"RestCustomerController getMemberAccount memberAccountList");
		return memberAccountList;
	}
}
