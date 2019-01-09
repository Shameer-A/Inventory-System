package com.java.sasha.inventory.dao.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
@AttributeOverride(name = "id", column = @Column(name = "ROLE_ID"))
public class RolesModel extends BaseModel{
	
	private static final long serialVersionUID = 1L;

	@Column(name="STR_ROLE")
	private String strRole;
	
	@Column(name="ROLE_DESC")
	private String roleDescription;

	public String getStrRole() {
		return strRole;
	}

	public void setStrRole(String strRole) {
		this.strRole = strRole;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
}
