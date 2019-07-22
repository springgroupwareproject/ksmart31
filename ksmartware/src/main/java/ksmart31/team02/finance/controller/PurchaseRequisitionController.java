package ksmart31.team02.finance.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02.finance.domain.PurchaseRequisition;
import ksmart31.team02.finance.service.PurchaseRequisitionService;

/*재무 관리 > 2.구매내역관리*/

@Controller
public class PurchaseRequisitionController {
	@Autowired PurchaseRequisitionService purchaseRequisitionService;
	
	// 구매내역관리
	@GetMapping("/finance/purchaseRequisition")
	public String purchaseRequisition(HttpSession session, Model model, String departmentName){
		Member loginMember = (Member) session.getAttribute("loginMember");
		System.out.println("PurchaseRequisitionController.purchaseRequisition [GET] departmentName : "+departmentName);
		if(loginMember == null) {
			return "redirect:"+"/login";
		}else {
			
			// 구매요청서 리스트
			List<PurchaseRequisition> purchaseRequisitionList = purchaseRequisitionService.getPurchaseRequisitionList();
			model.addAttribute("purchaseRequisitionList", purchaseRequisitionList);
			
			// 지출 금액  > 계정과목별 합산금액 & 총 금액 합계 
			Map<String, Object> resultMap = purchaseRequisitionService.getPurchaseRequisitionPriceSort();
			model.addAttribute("sumPriceList", resultMap.get("sumPriceList"));
			model.addAttribute("totalPrice", resultMap.get("totalPrice"));
		}
		
		return "finance/purchaseRequisition";
		
	}
}
