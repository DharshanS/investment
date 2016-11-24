package com.investment.manager;

import java.util.List;

public interface BaseManager<T> {

	public boolean insert(T entity) throws Exception;
	
	public boolean update(T entyty);
	
	public boolean delete(T entity);
	
	public T findById(int id) throws Exception;

	public T findByEmail(String email);

    public List<T> getAllRecords() throws Exception;

	boolean deleteAllRecords();

}









