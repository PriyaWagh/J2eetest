package com.met.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.met.dao.RegisterDao;
import com.met.model.Register;

@org.springframework.stereotype.Service
public class ServiceLayer {
	@Autowired
	private RegisterDao registerDao;
	
	
	
	public void save( Register reg)
	{
	  registerDao.saveUsingJDBCTemplate(reg);
		
	}
	
	
	
	

}
