package com.met.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.met.model.Register;
import com.met.service.ServiceLayer;

@Controller
@RequestMapping("/student")
public class DetailsControllers {
	
	@Autowired
	private ServiceLayer serviceLayer;
	
	@GetMapping
	public ModelAndView getRequest()
	{
		ModelAndView mv = new ModelAndView();
		 
		Register register = new Register();
		mv.addObject("reg" , register);
		mv.setViewName("index");
		return mv;
	    
	}
	
	
	@PostMapping
	public ModelAndView postRequest(@ModelAttribute Register reg)
	{
		System.out.println("In post");
		serviceLayer.save(reg);
		ModelAndView mv = new ModelAndView();
		 
		Register register = new Register();
		mv.addObject("reg" , register);
		mv.setViewName("index");
		return mv;
		
		
	}
}
