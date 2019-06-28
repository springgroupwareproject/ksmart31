package ksmart31.team01.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberEducation;

@Mapper
public interface MemberMyEducationMapper {

	public String memberFilesCode(String memberId);
	
	public List<MemberEducation> myEducation(Map<Object, String> map);
	
	
}
