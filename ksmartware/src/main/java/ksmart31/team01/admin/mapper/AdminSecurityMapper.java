package ksmart31.team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ksmart31.team01.member.domain.AdminLevel;

@Mapper
public interface AdminSecurityMapper {


	public int updateAdminLevel(Map<String, Object> map); // 관리자 권한부여 수정 매서드

	public List<AdminLevel> adminLevel(); // 보안관리 관리자 권한부여 리스트 출력 매서드
	
	public AdminLevel loginSecurity(String memberId); // 로그인시 관리자 메뉴 사용권한
	
	
	
}
