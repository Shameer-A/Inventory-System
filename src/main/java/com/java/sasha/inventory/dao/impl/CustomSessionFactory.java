package com.java.sasha.inventory.dao.impl;

import junit.framework.Assert;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomSessionFactory implements InitializingBean{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void afterPropertiesSet() throws Exception {
		
		Assert.assertNotNull("Session Factory to be set", sessionFactory);
	}
	
	 public Session getSession() {
		     return sessionFactory.openSession();
	}
	 
	 public Criteria getCriteria(Class modelClass){
		 return getSession().createCriteria(modelClass);
	 }
	 
	 public Session getTransactionalSession() {
		 Session session= sessionFactory.openSession();
		 session.beginTransaction();
	     return session;
	 }

	
}
