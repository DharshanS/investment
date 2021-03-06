package com.investment.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository("investmentBaseDaoImpl")
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

	@Autowired
	private SessionFactory sessionFactory;

	private final Class<T> entityClass;

	public BaseDaoImpl() {
		this.entityClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	protected Session getSession() {
		return this.sessionFactory.openSession();
	}

	@Override
	public T findById(Integer id) {
		return (T) getSession().get(this.entityClass, id);
	}

	@Override
	public T findByEmail(String email) {
		return (T) getSession().createCriteria(this.entityClass).add(Restrictions.like("email", email)).uniqueResult();
	}

	@Override
	public boolean persist(T entity) {
		boolean inserted = false;
		try {
			getSession().save(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean delete(T entity) {
		boolean deleted  = false;
		try{
			getSession().delete(entity);
			deleted = true;
			return deleted;
		}catch(Exception e){
			return deleted;
		}
	}

	@Override
	public boolean update(T entity) {
		try {
			getSession().saveOrUpdate(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<T> getAllRecords() {
		return getSession().createCriteria(this.entityClass).list();
	}

	@Override
	public void deleteAllRecords() {
		List<T> entities = getAllRecords();
		for (T entity : entities) {
			getSession().delete(entity);
		}
	}

	@Override
	public void clear() {
		getSession().clear();

	}

	@Override
	public void flush() {
		getSession().flush();

	}
	
}




