
package com.investment.dao;

import java.util.List;

public interface BaseDao<T> {

	public T findById(Integer id);

	public T findByEmail(String email);

	public boolean persist(T message);

	public boolean delete(T entity);

	public boolean update(T entyty);

	public List<T> getAllRecords();
	
	void deleteAllRecords();

	void clear();

	void flush();

	

}



