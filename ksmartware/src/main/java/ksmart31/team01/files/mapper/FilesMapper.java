package ksmart31.team01.files.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberFiles;

@Mapper
public interface FilesMapper {

	public int insertFiles (MemberFiles memberFiles); // 파일첨부 매서드

	
}
