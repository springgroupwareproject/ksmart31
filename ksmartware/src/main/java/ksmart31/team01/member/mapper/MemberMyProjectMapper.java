package ksmart31.team01.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberProjectMemberFiles;


@Mapper
public interface MemberMyProjectMapper {
	
	public String memberFilesCode(String memberId);
	
	public List<MemberProjectMemberFiles> myProject(Map<Object, String> map);
	
}
