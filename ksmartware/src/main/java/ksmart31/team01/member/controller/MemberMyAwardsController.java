package ksmart31.team01.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberAwards;
import ksmart31.team01.member.service.MemberMyAwardsService;


@Controller
public class MemberMyAwardsController {
	
	@Autowired private MemberMyAwardsService memberMyAwardsService;
	
	@GetMapping("/member/memberMyProfile/myAwards")
	public String myAwards(HttpSession session, Model model) {
		System.out.println("MemberMyAwardsController 수상 이력 정보 실행");
		
		Member member = (Member) session.getAttribute("loginMember"); 
		if(member.getMemberId() == null) { // 미로그인시 세션없으므로  로그인페이지 이동
			System.out.println("아이디 확인불가");
		  	return "redirect:"+"/login"; 
		}
		System.out.println(member.getMemberName()+"님 확인");
		String memberId = member.getMemberId();
		
		List<MemberAwards> myAwards = memberMyAwardsService.myAwards(memberId);
		
		System.out.println("MemberMyAwardsController myAwards : " + myAwards);
		model.addAttribute("myAwards", myAwards);
		
		return "member/memberMyProfile/myAwards";
	}
	
	
}
