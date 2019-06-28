package ksmart31.team01.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberProjectMemberFiles;
import ksmart31.team01.member.service.MemberMyProjectService;

@Controller
public class MemberMyProjectController {

	@Autowired private MemberMyProjectService memberMyProjectService;
	
	@GetMapping("/member/memberMyProfile/myProject")
	public String myProject(HttpSession session, Model model) {
		System.out.println("MemberMyProjectController.myProject 실행");
		
		Member member = (Member) session.getAttribute("loginMember");
		System.out.println("로그인 기록 확인중..");
		if(member.getMemberId() == null) {
			System.out.println("아이디 확인불가");
		  	return "redirect:"+"/login"; 
		}
		  
		System.out.println(member.getMemberName()+"님 확인");
		String memberId = member.getMemberId();
		
		List<MemberProjectMemberFiles> myProject = memberMyProjectService.myProject(memberId);
		
		System.out.println("MemberProjectController.myProject myProject : " + myProject);
		model.addAttribute("myProject", myProject);
		
		
		return "member/memberMyProfile/myProject";
	}
}
