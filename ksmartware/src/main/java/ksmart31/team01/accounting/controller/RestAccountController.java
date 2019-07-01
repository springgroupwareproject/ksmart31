package ksmart31.team01.accounting.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ksmart31.team01.accounting.service.AccountService;
import ksmart31.team01.member.domain.Member;
import ksmart31.team01.accounting.domain.Account;


@RestController
public class RestAccountController {
	@Autowired
	private AccountService accountService;
	//account 리스트
	@GetMapping(value="/getAccount")
	public Map<String,Object> getAccount(@RequestParam(value="currentPage", required = false, defaultValue = "1")int currentPage){
		Map<String,Object> map = accountService.getAccountList(currentPage);
		System.out.println(currentPage + "RestAccountController getAccount currentPage");
		return map;
	}
	//account insert
	@PostMapping(value="/addAccount")
	public void addAccount(Account account){
		System.out.println("/addAccount 요청");
		System.out.println(account + "RestAccountController addAccount account");
		accountService.addAccount(account);
	}		
}
