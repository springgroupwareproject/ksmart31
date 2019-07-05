package ksmart31.team01.accounting.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.accounting.service.MemberAccountService;
import ksmart31.team01.member.domain.Member;
import ksmart31.team01.accounting.domain.MemberAccount;

@Controller
public class MemberAccountController {
	@Autowired
	private MemberAccountService memberAccountService;
	//memberAccount 리스트
	@GetMapping(value="/accounting/memberAccountListView")
	public String getMemberAccountList(HttpSession session,Model model){
		List<MemberAccount> list = memberAccountService.getMemberAccountList();
		System.out.println(list + "MemberAccountController getMemberAccountList [get] list");
		Member loginMember = (Member) session.getAttribute("loginMember");
		model.addAttribute("memberId", loginMember.getMemberId());
		model.addAttribute("memberEmployeeCode", loginMember.getMemberEmployeeCode());
		model.addAttribute("departmentName", loginMember.getDepartmentName());
		model.addAttribute("memberPositionName", loginMember.getMemberPositionName());
		model.addAttribute("memberAccountList", list);
		return "/accounting/memberAccountListView";
	}	
}
