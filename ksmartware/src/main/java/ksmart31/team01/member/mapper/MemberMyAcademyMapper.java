package ksmart31.team01.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberAcademy;

@Mapper
public interface MemberMyAcademyMapper {

	public String memberFilesCode(String memberId);
	
	public List<MemberAcademy> myAcademy(Map<Object, String> map);
	
}
