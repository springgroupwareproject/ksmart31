package ksmart31.team02.finance.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team02.finance.domain.DisbursementDocument;
import ksmart31.team02.finance.mapper.DisbursementDocumentMapper;

@Service
@Transactional
public class DisbursementDocumentService {
	@Autowired private DisbursementDocumentMapper disbursementDocumentMapper;
	
	// 지출결의서 리스트
	public List<DisbursementDocument> getDisbursementDocumentList(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		return disbursementDocumentMapper.selectDisbursementDocumentList(map);
		
	}
	
	// 지출 금액
	public Map<String, Object> getDisbursementDocumentPriceSort(){
		Map<String, Object> map = new HashMap<String, Object>();
		// 지출 금액  > 계정과목별 합산금액 
		List<DisbursementDocument> sumPriceList = disbursementDocumentMapper.selectDisbursementDocumentPrice(map);
		System.out.println("sumPriceList : "+ sumPriceList);
		// 지출 금액  > 총 금액 합계
		int totalPrice = disbursementDocumentMapper.selectDisbursementDocumentTotalPrice();
		// map에 셋팅
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("sumPriceList", sumPriceList);
		resultMap.put("totalPrice", totalPrice);
		
		return resultMap;
	}
	
}
