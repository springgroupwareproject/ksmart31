package ksmart31.team02.document.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import ksmart31.team01.member.mapper.MemberLoginMapper;
import ksmart31.team02.document.mapper.DocumentFormMapper;

@Service
public class DocumentFormService {
	@Autowired private DocumentFormMapper documentFormMapper;
	//@Autowired private MemberLoginMapper memberLoginMapper;
	
	// 휴가신청서 작성폼
	public Map<String, Object> getLeaveApplicationForm() {
		System.out.println("(S) getLeaveApplicationForm() 실행");
		
		// select 문서양식 이름 
		return null;
	}
}
