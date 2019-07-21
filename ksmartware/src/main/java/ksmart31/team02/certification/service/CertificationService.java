package ksmart31.team02.certification.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02.certification.domain.Certification;
import ksmart31.team02.certification.domain.CertificationCommon;
import ksmart31.team02.certification.mapper.CertificationMapper;

@Service
@Transactional
public class CertificationService {
	@Autowired private CertificationMapper certificationMapper;
	
	// 증명서 발급 > 1. 증명서 신청 > 증명서 목록과 사용자 정보
	public Map<String, Object> applyCertification(String memberId, String documentFormCategoryName) {
		System.out.println("CertificationService.applyCertification [GET] 로그인한 ID : "+memberId);
		Map<String, Object> returnMap = null;
		// 회원 정보
		Member memberInfo = certificationMapper.getMemberInfo(memberId);
		// 증명서 리스트
		List<Certification> certificationList = certificationMapper.selectCertificationList(documentFormCategoryName);
		
		System.out.println("memberInfo : " + memberInfo);
		System.out.println("certificationList : " + certificationList);
		
		returnMap = new HashMap<String, Object>();
		returnMap.put("memberInfo", memberInfo);
		returnMap.put("certificationList", certificationList);
		
		return returnMap;
	}
	// 증명서 발급 > 3. 증명서 신청
	public void insertCertification(CertificationCommon certificationCommon) {
		System.out.println("CertificationService.insertCertification 메서드 호출");
		System.out.println("CertificationService.insertCertification 증명서 신청정보 :" + certificationCommon);
		int result = certificationMapper.insertCertification(certificationCommon);
		if(result != 0) {
			System.out.println("정상적으로 신청됨 ");
		} else {
			System.out.println("신청되지 않음 ");
		}
		
	}
			

}
