package ksmart31.team01.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.MemberProjectMemberFiles;
import ksmart31.team01.member.mapper.MemberMyProjectMapper;


@Service
@Transactional
public class MemberMyProjectService {

	@Autowired MemberMyProjectMapper memberMyProjectMapper;
	
		public List<MemberProjectMemberFiles> myProject (String memberId) {
			System.out.println("MemberMyProjectService.myProject 실행");
			
			String memberFileCode = memberMyProjectMapper.memberFilesCode(memberId);
			
			Map<Object, String> map = new HashMap<Object, String>();
			map.put("memberId", memberId);
			map.put("memberFileCode", memberFileCode);
			
			
			List<MemberProjectMemberFiles> myProject = memberMyProjectMapper.myProject(map);
			
			return myProject;
		}

}
