package com.java.sasha.inventory.dao.impl;


import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.Logger;

import com.java.sasha.inventory.dao.api.IRolesDao;
import com.java.sasha.inventory.dao.model.RolesModel;

public class RolesDaoImpl extends BaseDaoImpl<RolesModel, Long> implements IRolesDao {

	private static final Logger LOG = Logger.getLogger(RolesDaoImpl.class);
	
	public void afterPropertiesSet() throws Exception {

		Assert.assertNotNull("Custom Session Factory to be set", RolesDaoImpl.super.getCustomSf());
	}
	
	public Class<RolesModel> getEntityClass() {
		return RolesModel.class;
	}

	public List<RolesModel> getAllRoles(){
		LOG.debug("Get All roles in the system");
		return getAll();
	}


}
