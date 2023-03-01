package com.met.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Component
@RequestMapping("/hello")
public class HelloController {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView hello() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		//setting model data
		modelAndView.addObject("welMsg", "Welcome to Spring MVC");			//request.setAttribute();
		modelAndView.addObject("balance", 50000);
		
		//setting view english name
		modelAndView.setViewName("welcome");
		
		
		return modelAndView;
	}

}
