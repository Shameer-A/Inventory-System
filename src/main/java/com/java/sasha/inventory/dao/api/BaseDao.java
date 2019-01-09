package com.java.sasha.inventory.dao.api;

import java.io.Serializable;
import java.util.List;

import com.java.sasha.inventory.dao.model.BaseModel;

public interface BaseDao <Model extends BaseModel, ID extends Serializable> {

	public abstract Class<Model> getEntityClass();

	  public abstract Model getById(ID id);

	  public abstract List<Model> getAll();

	  public abstract long getCountAll();

	  public abstract Serializable save(Model model);

	  public abstract void delete(Model model);

	  public abstract void flush();

	  public abstract boolean lockWait(Model model);

	  public abstract boolean lockNoWait(Model model);

	  public abstract void evict(Model model);

	  public abstract void refresh(Model model);
	  
	  //public abstract Model update(Model model);

	  //public abstract Model saveOrUpdate(Model model);

}
