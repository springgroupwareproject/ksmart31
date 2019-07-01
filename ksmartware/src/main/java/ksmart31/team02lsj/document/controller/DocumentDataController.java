package ksmart31.team02lsj.document.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentDataController {
	@GetMapping("/documentData")
	public String DocumentDataMain() {
		return "/member/documentData/documentData";
		
	}
	

}
