package com.investment.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("investmentBaseDaoImp")
public class InvestmentBaseDaoImp implements InvestmentBaseDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public <T> Object findById(int id){
		// TODO Auto-generated method stub
	
			sessionFactory.getCurrentSession().beginTransaction();
		
		return null;
	}

	public <T> Object findByEmail(String email) {
		// TODO Auto-generated method stub
		
		
		return null;
	}
@Transactional
	public <T> Object insert(T object) {
		//sessionFactory.getCurrentSession().saveOrUpdate(object);
		return sessionFactory.getCurrentSession().merge(object);
	}



	public <T> List<T> viewAll(String table) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> Object findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
