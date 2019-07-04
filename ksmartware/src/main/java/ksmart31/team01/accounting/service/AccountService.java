package ksmart31.team01.accounting.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ksmart31.team01.accounting.mapper.AccountMapper;
import ksmart31.team01.accounting.domain.Account;

@Service
@Transactional
public class AccountService {
	@Autowired
	private AccountMapper accountMapper;
	//account리스트
	public Map<String,Object> getAccountList(int currentPage){
		//account 페이징
		final int ROW_PER_PAGE = 10;
		int startRow = (currentPage-1)*ROW_PER_PAGE;
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("startRow", startRow);
		map.put("rowPerPage", ROW_PER_PAGE);
		
		//account 리스트
		List<Account> accountList = accountMapper.selectAccountList(map);
		System.out.println(accountList + "AccountService getAccountList accountList");			
		//account count
		int selectCount = accountMapper.selectAccountCount();
		int lastPage = selectCount/ROW_PER_PAGE;
		if(selectCount%ROW_PER_PAGE != 0){
			lastPage++;
		}	
		Map<String,Object> returnMap = new HashMap<String,Object>();
		returnMap.put("accountList", accountList);
		returnMap.put("selectCount", selectCount);
		returnMap.put("lastPage", lastPage);
		returnMap.put("currentPage", currentPage);
		return returnMap;		
	}
	//account 입력
	public int addAccount(Account account){
		return accountMapper.insertAccount(account);
	}	
}
