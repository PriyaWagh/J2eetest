package com.met.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.met.model.Register;

@Repository
public class RegisterDao {
	
	@Autowired
	
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public void saveUsingJDBCTemplate(Register register) {
		
////		jdbcTemplate.update("insert into register values(?, ?, ?, ?)", 
////					new Object[] {employee.getId(), employee.getName(), employee.getDesignation(),
////							employee.getEmailId()}
//				);
		
		jdbcTemplate.update("insert into register values(?, ?, ?, ? ,?,?)", 
			new Object[] { register.getName(),register.getEmail(),register.getMobileNo(),
					register.getAddress(),register.getPass(),register.getConfPass()});
					
			}
	
		
	}
	


