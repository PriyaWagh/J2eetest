package com.met.model;

import org.springframework.stereotype.Service;

@Service
public class Register {
	
	private String name;
	private String email;
	private int mobileNo;
	
	private String address;
	
	 private String  pass;
	 private String confPass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getConfPass() {
		return confPass;
	}
	public void setConfPass(String confPass) {
		this.confPass = confPass;
	}
	
	
	public Register() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println(" model object created");
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", pass=" + pass + ", confPass=" + confPass + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getMobileNo()=" + getMobileNo() + ", getAddress()=" + getAddress() + ", getPass()="
				+ getPass() + ", getConfPass()=" + getConfPass() + "]";
	}
	 
	 
	 

}
