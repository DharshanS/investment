package com.investment.manager;

import java.util.List;

public interface BaseManager<T> {

	public T insert(T entity) throws Exception;

    public List<T> getAllRecords() throws Exception;

    public T findById(int id) throws Exception;
	
}
