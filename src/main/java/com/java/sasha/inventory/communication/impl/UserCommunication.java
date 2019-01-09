package com.java.sasha.inventory.communication.impl;

import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.sasha.inventory.communication.api.IUserCommunication;
import com.java.sasha.inventory.communication.model.Roles;
import com.java.sasha.inventory.logic.api.IUserLogic;

public class UserCommunication implements IUserCommunication, InitializingBean {
	
	private static final Logger LOG = Logger.getLogger(UserCommunication.class);

	@Autowired
	private IUserLogic userLogic; 
	
	public void afterPropertiesSet() throws Exception {
		
		Assert.assertNotNull("User Logic is to be set", userLogic);
		
	}
	
	public List<Roles> getRoles() {
		
		LOG.debug("Communication : Get All Roles ");
		
		return userLogic.getRoles();
	}


	public IUserLogic getUserLogic() {
		return userLogic;
	}


	public void setUserLogic(IUserLogic userLogic) {
		this.userLogic = userLogic;
	}

}
