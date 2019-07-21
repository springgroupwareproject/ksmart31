package ksmart31.team02.finance.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02.finance.domain.DisbursementDocument;
import ksmart31.team02.finance.service.DisbursementDocumentService;

/*재무 관리 > 1.지출내역관리*/

@Controller
public class DisbursementDocumentController {
	@Autowired private DisbursementDocumentService disbursementDocumentService;
	
	// 지출내역관리
	@GetMapping("/finance/disbursementDocument")
	public String disbursementDocument(HttpSession session, Model model, String departmentName){
		Member loginMember = (Member) session.getAttribute("loginMember");
		System.out.println("DisbursementDocumentController.disbursementDocument [GET] departmentName : "+departmentName);
		if(loginMember == null) {
			return "redirect:"+"/login";
		}else {
			
			// 지출결의서 리스트
			List<DisbursementDocument> disbursementDocumentList = disbursementDocumentService.getDisbursementDocumentList();
			System.out.println("disbursementDocumentList : " + disbursementDocumentList);
			model.addAttribute("disbursementDocumentList", disbursementDocumentList);
			
			// 지출 금액  > 계정과목별 합산금액 & 총 금액 합계 
			Map<String, Object> resultMap = disbursementDocumentService.getDisbursementDocumentPriceSort();
			model.addAttribute("sumPriceList", resultMap.get("sumPriceList"));
			model.addAttribute("totalPrice", resultMap.get("totalPrice"));
		}
		
		return "finance/disbursementDocument";
		
	}
	
}
