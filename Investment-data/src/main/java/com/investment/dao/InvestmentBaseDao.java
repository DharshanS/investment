
package com.investment.dao;

import java.util.List;

public interface InvestmentBaseDao<T> {

	public T findById(Integer id);

	public T findByEmail(String email);

	public T persist(T message);

	public void delete(T entity);

	public void update(T entyty);

	public List<T> getAllRecords();

}
