package com.anku.logging.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRequestController {
	
	private Logger logger= LoggerFactory.getLogger(MsgRequestController.class);
	@GetMapping("/")
	public String getWelcomeMsg() {
		logger.debug("this debug msg from Welcome()");
		logger.info("this is Welcome() Started");
		logger.warn("this  Warning from welcom() ");
		
		try {
			int i=10/0;
			
		} catch (Exception e) {
			logger.error("Exception Occures ::"+e.getMessage());
		}
		String msg="welcome to Ankits world";
		logger.info("this is Welcome() ended");
	
		return msg;
	}

}
