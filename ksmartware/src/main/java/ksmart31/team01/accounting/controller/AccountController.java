package ksmart31.team01.accounting.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ksmart31.team01.accounting.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	//account 리스트
	@GetMapping(value="/accounting/accountListView")
	public String getAccountList(Model model,@RequestParam(value="currentPage", required = false, defaultValue = "1")int currentPage){
		Map<String,Object> map = accountService.getAccountList(currentPage);
				
		model.addAttribute("accountList", map.get("accountList"));
		//최신다시올림
		
		return "accounting/accountListView";
	}
	
	
	//리베이스 테스트
	
}
