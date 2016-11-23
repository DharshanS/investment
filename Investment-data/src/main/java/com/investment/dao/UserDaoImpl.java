package com.investment.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.investment.entity.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User findById(Integer id) {
		return null;
	}

	@Override
	public User findByEmail(String email) {

		return null;
	}

	@Override
	public User persist(User message) {

		return null;
	}

	@Override
	public void delete(User entity) {

	}

	@Override
	public void update(User entyty) {

	}

	@Override
	public List<User> getAllRecords() {
		final Session session = sessionFactory.openSession();
		final Criteria criteria = session.createCriteria(User.class);
		return criteria.list();

	}

}



