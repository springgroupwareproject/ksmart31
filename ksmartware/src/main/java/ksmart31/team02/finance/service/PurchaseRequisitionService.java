package ksmart31.team02.finance.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team02.finance.domain.PurchaseRequisition;
import ksmart31.team02.finance.mapper.PurchaseRequisitionMapper;

@Service
@Transactional
public class PurchaseRequisitionService {
	@Autowired private PurchaseRequisitionMapper purchaseRequisitionMapper;
	
	// 구매요청서 리스트
	public List<PurchaseRequisition> getPurchaseRequisitionList(){
		Map<String, Object> map = new HashMap<String, Object>();
		return purchaseRequisitionMapper.selectPurchaseRequisitionList(map);
	}
		
	// 구매 요청 금액
	public Map<String, Object> getPurchaseRequisitionPriceSort(){
		Map<String, Object> map = new HashMap<String, Object>();
		// 구매 요청 금액  > 품목별 합산금액
		List<PurchaseRequisition> sumPriceList = purchaseRequisitionMapper.selectPurchaseRequisitionPrice(map);
		System.out.println("sumPriceList : "+ sumPriceList);
		// 구매 요청 금액  > 총 금액 합계
		int totalPrice = purchaseRequisitionMapper.selectPurchaseRequisitionTotalPrice();
		System.out.println("totalPrice : "+ totalPrice);
		// map에 셋팅
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("sumPriceList", sumPriceList);
		resultMap.put("totalPrice", totalPrice);
		
		return resultMap;
	}
			
}
