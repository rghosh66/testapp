package com.rghosh.question;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class testController {
	
	
	@RequestMapping("/test")
	public String testHi() {
		
		
		return "Hi Git";
	}
	
			

}
