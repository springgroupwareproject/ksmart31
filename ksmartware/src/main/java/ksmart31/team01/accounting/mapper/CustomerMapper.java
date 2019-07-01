package ksmart31.team01.accounting.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.accounting.domain.Customer;
import ksmart31.team01.member.domain.Member;




@Mapper
public interface CustomerMapper {
	//customer 리스트
	public List<Customer> selectCustomerList();
	//customer insert
	public int insertCustomer(Customer customer);
	//memberId 리스트
	public List<Member> selectMemberIdList();
}
