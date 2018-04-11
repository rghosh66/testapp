package com.rghosh.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ComponentScan
@EnableAutoConfiguration
public class MainController {

	public static void main(String[] args) {
		SpringApplication.run(MainController.class, args);

	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String helloSpring(){
		
		return "Spring boot: Hello";
	}

}
