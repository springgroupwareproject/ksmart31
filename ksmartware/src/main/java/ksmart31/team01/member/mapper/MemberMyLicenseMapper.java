package ksmart31.team01.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberLicense;

@Mapper
public interface MemberMyLicenseMapper {

	public String memberFilesCode(String memberId);
	
	public List<MemberLicense> myLicense(Map<Object, String> map);
	
}
