package ksmart31.team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.domain.MemberPosition;
import ksmart31.team01.member.domain.PersonnelStandard;

@Mapper
public interface PersonnelSettingMapper {

	public int insertAdminSetting(MemberPosition memberPosition);

	public List<MemberPosition> adminSetting(); // 직위/직책 값 출력 매서드
	
	public PersonnelStandard getPersonnelStandardSetting();
}
