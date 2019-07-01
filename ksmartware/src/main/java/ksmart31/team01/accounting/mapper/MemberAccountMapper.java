package ksmart31.team01.accounting.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ksmart31.team01.accounting.domain.MemberAccount;
import ksmart31.team01.member.domain.Member;

@Mapper
public interface MemberAccountMapper {
	//MemberAccount 리스트
	public List<MemberAccount> selectMemberAccountList();
	//memberAccount insert
	public int insertMemberAccount(MemberAccount memberAccount);
	//memberId 리스트
	public List<Member> selectMemberIdList();
}
