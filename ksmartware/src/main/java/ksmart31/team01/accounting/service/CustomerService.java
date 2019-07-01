package ksmart31.team01.accounting.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.accounting.domain.Customer;

import ksmart31.team01.accounting.mapper.CustomerMapper;
import ksmart31.team01.member.domain.Member;


@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerMapper customerMapper;
	//customer 리스트
	public List<Customer> getCustomerList(){		
		List<Customer> list = customerMapper.selectCustomerList();
		System.out.println(list + "CustomerService getCustomerList list");
		return list;
	}
	//customer insert
	public int addCustomer(Customer customer){
		return customerMapper.insertCustomer(customer);
	}
	//memberId list
	public List<Member> getMemberIdList(){
		List<Member> list = customerMapper.selectMemberIdList();
		System.out.println(list + "CustomerService getMemberIdList list");
		return list;
	}	
}
