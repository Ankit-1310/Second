package com.anku.logging.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MessageController {
	
	private Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		logger.info("Welcome() Exicution Strated");
		String msg = "Welcome To Spring Boot";
		
		logger.info("Welcome() Exicution ended");
		return msg;
	}
	@GetMapping("/greet")
	public String greetMessage() {
		logger.info("Greet() Exicution Strated");
		String msg = "good morning";
		logger.info("Greet() Exicution Ended ");
		return msg;
	}
}
