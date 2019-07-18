package ksmart31.team01.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberEducation;

@Mapper
public interface MemberMyEducationMapper {
	
	public int addmyEducation(Map<String, Object> map);	// 모달창으로 비동기 입력
	
	public List<MemberEducation> myEducation(String memberId); // 출력
	
}
