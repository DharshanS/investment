package com.investment.manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.investment.dao.UserDao;
import com.investment.entity.User;

@Service
public class UserManagerImpl implements UserManager {

	@Autowired
	protected UserDao userDao = null;

	@Override
	public boolean insert(User entity) throws Exception {
		boolean inserted = false;
		try {
			userDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public List<User> getAllRecords() throws Exception {
		List<User> users = null;
		try {
			users = userDao.getAllRecords();
		} catch (Exception e) {
			return users;
		}
		return users;
	}

	@Override
	public User findById(int id) throws Exception {
		return userDao.findById(id);
	}

	@Override
	public boolean update(User entyty) {
		boolean updated = false;
		try{
			userDao.update(entyty);
			updated = true;
			return updated;
		}catch(Exception e){
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(User entity) {
		boolean deleted = false;
		try {
			deleted = userDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try{
			userDao.deleteAllRecords();
			deleted = true;
			return deleted;
		}catch(Exception e){
			return deleted;
		}
	}

}






