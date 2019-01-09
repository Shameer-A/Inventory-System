package com.java.sasha.inventory.logic.impl;

import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.sasha.inventory.communication.model.Roles;
import com.java.sasha.inventory.dao.api.IRolesDao;
import com.java.sasha.inventory.dao.api.IUserDao;
import com.java.sasha.inventory.logic.api.IUserLogic;
import com.java.sasha.inventory.utils.Converter;

public class UserLogic implements IUserLogic, InitializingBean {

	private static final Logger LOG = Logger.getLogger(UserLogic.class);
	
	@Autowired
	private IUserDao userDao;
	@Autowired
	private IRolesDao rolesDao;
	
	@Autowired
	private Converter converter;
	
	public void afterPropertiesSet() throws Exception {
		Assert.assertNotNull("User Dao is not set", userDao);
		Assert.assertNotNull("Roles Dao is not set", rolesDao);
		Assert.assertNotNull("Converter is not set", converter);
	}
	
	public List<Roles> getRoles() {
		LOG.debug("User Logic : Get All Roles ");
		
		return converter.fromModel(rolesDao.getAll());
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public IRolesDao getRolesDao() {
		return rolesDao;
	}

	public void setRolesDao(IRolesDao rolesDao) {
		this.rolesDao = rolesDao;
	}

	public Converter getConverter() {
		return converter;
	}

	public void setConverter(Converter converter) {
		this.converter = converter;
	}


}
