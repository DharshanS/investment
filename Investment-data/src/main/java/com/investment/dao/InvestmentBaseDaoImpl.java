package com.investment.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("investmentBaseDaoImpl")
public class InvestmentBaseDaoImpl<T> implements InvestmentBaseDao<T> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public T findById(Integer id) {
		return null;
	}

	@Override
	public T findByEmail(String email) {
		return null;
	}

	@Override
	public T persist(T message) {

		return null;
	}

	@Override
	public void delete(T entity) {

	}

	@Override
	public void update(T entyty) {

	}

	@Override
	public List<T> getAllRecords() {
		return null;
		
	}

}










