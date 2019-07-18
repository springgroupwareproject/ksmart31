package ksmart31.team01.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.admin.mapper.AdminSecurityMapper;
import ksmart31.team01.member.domain.AdminLevel;
import ksmart31.team01.member.domain.Member;

@Service
@Transactional
public class AdminSecurityService {
	/* 조직원 인사설정(관리자 영역)클래스  */
	
	@Autowired private AdminSecurityMapper AdminSecurityMapper;
	
	
		public void modifyAdminLevel(List<AdminLevel> adminLevelList, Member member) { // 수정 매서드(); 수정데이터와 수정자정보
			System.out.println("AdminSecurityService adminLevelList : " + adminLevelList + " Member : " + member);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("adminLevelList", adminLevelList);
			map.put("member", member);
		
			int result = AdminSecurityMapper.updateAdminLevel(map);
			
			if(result == 0) {
				System.out.println("수정실패");
			} else {
				System.out.println("수정성공");
			}
		}
	
		public List<AdminLevel> adminLevel(){ // 보안관리에 뿌려줄 리스트
			return AdminSecurityMapper.adminLevel();
		}
	
	
}
