package com.java.sasha.inventory.dao.api;

import java.util.List;

import com.java.sasha.inventory.dao.model.RolesModel;

public interface IRolesDao extends BaseDao<RolesModel, Long> {
	
	public List<RolesModel> getAllRoles();

}
