package ksmart31.team02lsj.document.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team02lsj.document.service.DocumentManagementService;
// 관리자매뉴  문서통합관리 - 문서관리 -문서삭제 
@RestController
public class DocumentMangementRestController {
	@Autowired
	private DocumentManagementService documentManagementService;
	//관리자 문서삭제(비동기)
	@PostMapping("/documentManagement/delete")
	public  void removeDocument(@RequestParam(value = "ck[]")String[] ckDocument) {
		System.out.println("(C) removeDocument");
		documentManagementService.removeDocument(ckDocument);
		
	}

}
