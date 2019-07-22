package ksmart31.team02.finance.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.finance.domain.PurchaseRequisition;

@Mapper
public interface PurchaseRequisitionMapper {
	// 구매요청서리스트
	public List<PurchaseRequisition> selectPurchaseRequisitionList(Map<String, Object> map);
	// 구매 요청 금액  > 품목별 합산금액
	public List<PurchaseRequisition> selectPurchaseRequisitionPrice(Map<String, Object> map);
	// 구매 요청 금액  > 총 금액 합계
	public int selectPurchaseRequisitionTotalPrice();
}
