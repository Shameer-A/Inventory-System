package com.java.sasha.inventory.utils;

import java.util.ArrayList;
import java.util.List;

import com.java.sasha.inventory.dao.model.RolesModel;

public class Converter {

	public com.java.sasha.inventory.communication.model.Roles fromModel(RolesModel dbRole){
		
		com.java.sasha.inventory.communication.model.Roles role = 
				new com.java.sasha.inventory.communication.model.Roles();
		
		role.setRole(dbRole.getStrRole());
		role.setRoleId(dbRole.getId());
		role.setRoleDescription(dbRole.getRoleDescription());
		
		return role;
	}
	
	public List<com.java.sasha.inventory.communication.model.Roles> fromModel(List<RolesModel> dbRoleList){
		
		ArrayList<com.java.sasha.inventory.communication.model.Roles> roleList = 
				new ArrayList<com.java.sasha.inventory.communication.model.Roles>();

		if(CommonUtils.exists(dbRoleList)){
			for (RolesModel dbRole : dbRoleList) {
				com.java.sasha.inventory.communication.model.Roles role = 
						new com.java.sasha.inventory.communication.model.Roles();
				role.setRole(dbRole.getStrRole());
				role.setRoleId(dbRole.getId());
				role.setRoleDescription(dbRole.getRoleDescription());
				
				roleList.add(role);
			}
		}

		return roleList;
	}
}
