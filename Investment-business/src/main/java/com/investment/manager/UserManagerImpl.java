package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.UserDao;
import com.investment.entity.User;

@Service
public class UserManagerImpl implements UserManager{
	
	@Autowired
	protected UserDao userDao = null;

	@Override
	public User insert(User entity) throws Exception {
		return null;
	}

	@Override
	public List<User> getAllRecords() throws Exception {
		return userDao.getAllRecords();
	}

	@Override
	public User findById(int id) throws Exception {
		return null;
	}

}


