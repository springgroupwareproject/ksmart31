package ksmart31.team01.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.admin.mapper.PersonnelSettingMapper;
import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberPosition;

@Service
@Transactional
public class PersonnelSettingService {

	@Autowired private PersonnelSettingMapper personnelSettingMapper;

		
		public void addAdminSetting(Member member, MemberPosition memberPosition) { // 직위/직책 입력 매서드
			System.out.println("PersonnelSettingService 입력데이터 Member : " + member + " , MemberPosition : " + memberPosition);
			
			memberPosition.setPersonnelStandardFinalModifierId(member.getMemberId());
			memberPosition.setPersonnelStandardFinalModifierName(member.getMemberName());
			
			System.out.println("입력할 memberPosition 값 : " + memberPosition);
			
			int result = personnelSettingMapper.insertAdminSetting(memberPosition);
			if (result != 0) {
				System.out.println("입력성공 : " + result);
			}else{
				System.out.println("입력실패 : " + result);
			}
			
			
		}
	
		public List<MemberPosition> getadminSetting(){ // 출력되는 매서드
		System.out.println("PersonnelSettingService");
			return personnelSettingMapper.adminSetting();
		}

}
