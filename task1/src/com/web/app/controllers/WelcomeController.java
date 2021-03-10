package com.web.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.app.services.WelcomeService;

public class WelcomeController {
	
	private WelcomeService welcomeService;
	
	public void setWelcomeService(WelcomeService welcomeService)
	{
		this.welcomeService = welcomeService;
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		
		String welcomeMsg = welcomeService.getWelcome()
;		return new ModelAndView("/home.jsp", "welcomeMsg", welcomeMsg);
	}
	
	

}
