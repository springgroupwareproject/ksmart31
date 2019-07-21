package ksmart31.team02.finance.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.finance.domain.DisbursementDocument;

@Mapper
public interface DisbursementDocumentMapper {
	// 지출결의서 리스트
	public List<DisbursementDocument> selectDisbursementDocumentList(Map<String, Object> map);
	// 지출 금액  > 계정과목별 합산금액
	public List<DisbursementDocument> selectDisbursementDocumentPrice(Map<String, Object> map);
	// 지출 금액  > 총 금액 합계
	public int selectDisbursementDocumentTotalPrice();
	
}
