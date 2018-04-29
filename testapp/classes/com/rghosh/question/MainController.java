package com.rghosh.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainController {

	public static void main(String[] args) {
		SpringApplication.run(MainController.class, args);

	}
	/*
	@RequestMapping("/hello")
	@ResponseBody
	public String helloSpring(){
		
		return "Spring boot: Hello";
	}
*/
}
