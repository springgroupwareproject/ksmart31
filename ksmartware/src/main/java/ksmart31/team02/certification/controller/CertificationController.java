package ksmart31.team02.certification.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02.certification.domain.Certification;
import ksmart31.team02.certification.domain.CertificationCommon;
import ksmart31.team02.certification.mapper.CertificationMapper;
import ksmart31.team02.certification.service.CertificationService;

@Controller
public class CertificationController {
	@Autowired private CertificationService certificationService;
	@Autowired private CertificationMapper certificationMapper;
	
	
	// 증명서 발급 > 1. 증명서 신청 > 증명서 목록과 회원 정보
	@GetMapping("/apply/getApplyCertification")
	public String getApplyCertification(Model model, HttpSession httpSession, @RequestParam(value="documentFormCategoryName", required=false, defaultValue="증명") String documentFormCategoryName) {
		
		Member loginMember = (Member) httpSession.getAttribute("loginMember");
		System.out.println("CertificationController.getApplyCertification [GET] 로그인한 ID : " + loginMember.getMemberId());
		
		Map<String, Object> returnMap = certificationService.applyCertification(loginMember.getMemberId(), documentFormCategoryName);
		returnMap.get("certificationList");
		model.addAttribute("memberInfo", (Member) returnMap.get("memberInfo"));
		model.addAttribute("certificationList", (Object) returnMap.get("certificationList"));
		
		return "certification/applyCertification";
	}
	
	
	// 증명서 발급 > 1. 증명서 신청 > 증명서 신청
	@PostMapping("/apply/addApplyCertification")
	public String addApplyCertification(CertificationCommon certificationCommon) {
		System.out.println("CertificationController.addApplyCertification 메서드 호출");
		System.out.println("CertificationService.insertCertification 증명서 신청정보 :" + certificationCommon);
		certificationService.insertCertification(certificationCommon);
		
		return "redirect:/apply/getCertificationHistoryList";
	}
	
	// 증명서 발급 > 4. 신청내역 조회
	@GetMapping("/apply/getCertificationHistoryList")
	public String getCertificationHistoryList(HttpSession httpSession, Model model){
		
		Member loginMember = (Member) httpSession.getAttribute("loginMember");
		System.out.println("CertificationController.getApplyCertification [GET] 로그인한 ID : " + loginMember.getMemberId());
		
		System.out.println("CertificationController.getCertificationHistoryList 메서드 호출");
		System.out.println("CertificationController.getCertificationHistoryList.memberId : " + loginMember.getMemberId());
		List<CertificationCommon> certificationHistoryList = certificationMapper.selectCertificationHistoryList(loginMember.getMemberId());
		System.out.println("CertificationController.getCertificationHistoryList.certificationHistoryList : " + certificationHistoryList);
		model.addAttribute("certificationHistoryList", certificationHistoryList);
		
		return "certification/certificationHistory";
	}
	
}
