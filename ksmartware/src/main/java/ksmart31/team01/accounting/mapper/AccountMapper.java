package ksmart31.team01.accounting.mapper;

import java.util.*;
import org.apache.ibatis.annotations.Mapper;
import ksmart31.team01.accounting.domain.Account;
import ksmart31.team01.member.domain.Member;


@Mapper
public interface AccountMapper {
	//account 리스트
	public List<Account> selectAccountList(Map<String,Integer> map);
	//member_id 리스트
	public List<Member> selectMemberIdList();
	//account 카운트
	public int selectAccountCount();
	//account insert
	public int insertAccount(Account account);
	
}
