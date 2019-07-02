package ksmart31.team02.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.DraftDocument;
import ksmart31.team02.document.mapper.DraftDocumentMapper;

@Service
public class DocumentFormService {
	@Autowired private DraftDocumentMapper draftDocumentMapper;
	
	// 지출결의서 작성폼
	

	// 휴가신청서 작성폼
	public List<DraftDocument> getLeaveApplicationForm() {
		System.out.println("[DocumentFormService] getLeaveApplicationForm() 실행");

		List<DraftDocument> list = draftDocumentMapper.selectDraftDocument();
		System.out.println("[DocumentFormService] list:"+list);
		
		return list;
	}
}
