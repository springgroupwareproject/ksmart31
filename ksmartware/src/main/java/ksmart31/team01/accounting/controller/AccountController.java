package ksmart31.team01.accounting.controller;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ksmart31.team01.accounting.service.AccountService;
import ksmart31.team01.member.domain.Member;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	//account 리스트
	@GetMapping(value="/accounting/accountListView")
	public String getAccountList(Model model,HttpSession session,@RequestParam(value="currentPage", required = false, defaultValue = "1")int currentPage){
		Map<String,Object> map = accountService.getAccountList(currentPage);
		Member loginMember = (Member) session.getAttribute("loginMember");		
		model.addAttribute("accountList", map.get("accountList"));		
		model.addAttribute("memberId", loginMember.getMemberId());		
		return "accounting/accountListView";
//수정

	}	
}
