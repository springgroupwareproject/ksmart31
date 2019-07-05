package ksmart31.team01.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.admin.mapper.AdminSecurityMapper;
import ksmart31.team01.member.domain.AdminLevel;

@Service
@Transactional
public class AdminSecurityService {
	/* 조직원 인사설정(관리자 영역)클래스  */
	
	@Autowired private AdminSecurityMapper AdminSecurityMapper;
	
		public List<AdminLevel> adminLevel(){ // 보안관리에 뿌려줄 리스트
			return AdminSecurityMapper.adminLevel();
		}
	
	
}
