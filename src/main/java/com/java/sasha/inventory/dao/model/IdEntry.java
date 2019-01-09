package com.java.sasha.inventory.dao.model;

import java.io.Serializable;

public abstract interface IdEntry<ID extends Serializable>
{
  public abstract ID getId();

  public abstract boolean isSetId();
}
