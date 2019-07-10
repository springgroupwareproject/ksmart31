package ksmart31.team01.member.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberEducation;
import ksmart31.team01.member.service.MemberMyEducationService;

@RestController
public class MemberMyEducationRestController {

	@Autowired private MemberMyEducationService MemberMyEducationService;
	
	@PostMapping("Upload/file")
	public void UploadFile(MultipartFile file) {
		System.out.println("파일");
		
		//String path = "D:\\jjdev\\sts_workspace\\mall5.7\\src\\main\\resources\\static\\upload";
		/*String path = PathStr.UPLOAD_PATH;*/
		//String path = ServletUriComponentsBuilder.fromCurrentContextPath().path("upload").toUriString();
		// ServletComponentsBuilder.fromCurrentContextPath	() == request.getContextPath()
		/*MemberMyEducationService.addBoard(boardRequest, path); 
		File file = new File("");
		file.delete();*/
	}
	
	@GetMapping("/member/memberMyProfile/removeMyEducation")  // 삭제 매서드
	public void removeMyEducation(String codeNo) {
		System.out.println("학력 정보 삭제 매서드 실행 : " + codeNo);
		MemberMyEducationService.removeMyEducation(codeNo);
	
	}
	
	@GetMapping("/member/memberMyProfile/addmyEducation") // 입력매서드
	public void addmyEducation(HttpSession session, MemberEducation memberEducation) {
		System.out.println("모달창 학력정보 입력 매서드 실행 : memberEducation" + memberEducation);
		if(!memberEducation.getMemberEducationNow().equals("재학")){
			System.out.println("종료날짜"+memberEducation.getMemberEducationEndDay());
			memberEducation.setMemberEducationEndDay(null);
			System.out.println("바뀐 종료날짜"+memberEducation.getMemberEducationEndDay());
		}
		
		
		
		Member member = (Member) session.getAttribute("loginMember");
	
		MemberMyEducationService.addmyEducation(memberEducation, member);	
	}

}
