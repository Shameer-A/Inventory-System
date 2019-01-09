package com.java.sasha.inventory.communication.model;

import java.io.Serializable;

public class Roles implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long roleId;
	private String role;
	private String roleDescription;
	
	public String toString(){
		return roleId+":"+role;
	}
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
}
