package com.java.sasha.inventory.communication.model;

import java.util.Date;
import java.util.List;

public class User {
	
	private String name;
	
	private String doj;
	
	private String msisdn;
	
	private String userName;
	
	private String password;
	
	private Address address;
	
	private List<String> roleList;
	
	
	public String toString(){
		return "Name :"+name+" Doj:"+doj+" Msisdn:"+msisdn+" User Name:"+userName+" Address"+address+""
				+" Roles :"+roleList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}
	

}
