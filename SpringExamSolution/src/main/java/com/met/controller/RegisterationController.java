package com.met.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.met.model.Register;
import com.met.service.ServiceLayer;



/*

@Controller
@RequestMapping("/register")

public class RegisterationController {
	
	@Autowired
    private ServiceLayer serviceLayer;

	@GetMapping
	public ModelAndView initialize() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		Register register = new Register();
		
		modelAndView.addObject("reg",register );
		
			modelAndView.setViewName("register");
		
		return modelAndView;
		
	}
	*/
	
	/*
	
	//@RequestMapping( method=RequestMethod.POST)
	@PostMapping
	public ModelAndView getDeatils( @ModelAttribute Register reg)
	{
		
	     ModelAndView modelAndView = new ModelAndView();
		
		System.out.println(reg);
		
		serviceLayer.save(reg);
		
		
         Register register = new Register();
		
		modelAndView.addObject("reg",register );
		
			modelAndView.setViewName("register");
		
		
		return modelAndView;
		
	}
	
	*/
	/*
	@PostMapping
	public ModelAndView saveEmployee(@ModelAttribute Register reg) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println(reg);
		
		serviceLayer.save(reg);
		
		
		
		
								//redirect:/emp
       Register register = new Register();
		
		modelAndView.addObject("reg",register);
		
			modelAndView.setViewName("register");
		
		
	//	 Employee defEmp = new Employee();
		  
		 //modelAndView.addObject("emp", emp);
		 
		// modelAndView.addObject("emp", defEmp);
		 
		
		return modelAndView;
	}
	

	public RegisterationController() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println(" controller object created");
	}
	
	
	*/
	


