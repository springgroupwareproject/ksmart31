package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberLicense;

@Mapper
public interface MemberMyLicenseMapper {

	public List<MemberLicense> myLicense(String memberId);
	
}
