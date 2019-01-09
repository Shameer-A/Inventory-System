package com.java.sasha.inventory.dao.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.sasha.inventory.dao.api.BaseDao;
import com.java.sasha.inventory.dao.model.BaseModel;

public abstract class BaseDaoImpl <Model extends BaseModel, ID extends Serializable> 
	implements BaseDao<Model , ID>, InitializingBean {

	@Autowired
	private CustomSessionFactory customSf;
	
	public Model getById(Serializable id) {
		return (Model) customSf.getSession().get(getEntityClass(), id);
	}

	public List getAll() {
		return customSf.getCriteria(getEntityClass()).list();
	}

	public long getCountAll() {
		return 0;
	}

	public Serializable save(BaseModel model) {
		
		Session session = customSf.getTransactionalSession();
		model.setCreationDate(new Date());
		return session.save(model);
		
	}

	public void delete(BaseModel model) {
		
	}

	public void flush() {
		
	}

	public boolean lockWait(BaseModel model) {
		return false;
	}

	public boolean lockNoWait(BaseModel model) {
		return false;
	}

	public void evict(BaseModel model) {
	}

	public void refresh(BaseModel model) {
	}

	public BaseModel update(BaseModel model) {
		return null;
	}

	public BaseModel saveOrUpdate(BaseModel model) {
		return null;
	}

	public CustomSessionFactory getCustomSf() {
		return customSf;
	}

	public void setCustomSf(CustomSessionFactory customSf) {
		this.customSf = customSf;
	}

}
