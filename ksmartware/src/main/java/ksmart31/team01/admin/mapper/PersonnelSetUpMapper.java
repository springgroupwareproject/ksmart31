package ksmart31.team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ksmart31.team01.member.domain.AdminLevel;

@Mapper
public interface PersonnelSetUpMapper {

	public List<AdminLevel> adminLevel(); // 보안관리 관리자 권한부여 리스트 출력 매서드
	
	
	
	
	
	
}
