package ksmart31.team02.certification.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.Member;
import ksmart31.team02.certification.domain.Certification;
import ksmart31.team02.certification.domain.CertificationCommon;

@Mapper
public interface CertificationMapper {
	// 증명서 발급 > 1. 증명서 리스트
	public List<Certification> selectCertificationList(String documentFormCategoryName);
	// 증명서 발급 > 2. 회원 정보 
	public Member getMemberInfo(String memberId);
	// 증명서 발급 > 3. 증명서 신청
	public int insertCertification(CertificationCommon certificationCommon);
	// 증명서 발급 > 4. 신청내역 조회
	public List<CertificationCommon> selectCertificationHistoryList(String memberId);
	
}


