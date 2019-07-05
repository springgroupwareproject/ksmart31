package ksmart31;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {
	
	
	@GetMapping("/test")
	public String calendarBasicEx() {
		return "calendarBasicEx";
	}
	
	@GetMapping("/test2")
	public String calendarAdvEx() {
		return "calendarAdvEx";
	}
}
