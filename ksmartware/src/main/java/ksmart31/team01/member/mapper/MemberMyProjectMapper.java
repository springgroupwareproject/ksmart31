package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberProjectMemberFiles;


@Mapper
public interface MemberMyProjectMapper {
	//19-06-30리스트로 리턴해야됨
	public String memberFilesCode(String memberId);
	
	public List<MemberProjectMemberFiles> myProject(String memberId);
	
}
