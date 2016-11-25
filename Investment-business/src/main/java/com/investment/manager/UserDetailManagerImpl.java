package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.UserDetailDao;
import com.investment.entity.UserDetail;

@Service
public class UserDetailManagerImpl implements UserDetailManager{

	@Autowired
	private UserDetailDao userdetailDao = null;
	
	@Override
	public boolean insert(UserDetail entity) throws Exception {
		boolean inserted = false;
		try {
			userdetailDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(UserDetail entyty) {
		boolean updated = false;
		try {
			userdetailDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(UserDetail entity) {
		boolean deleted = false;
		try {
			deleted = userdetailDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public UserDetail findById(int id) throws Exception {
		return userdetailDao.findById(id);
	}

	@Override
	public UserDetail findByEmail(String email) {
		return userdetailDao.findByEmail(email);
	}

	@Override
	public List<UserDetail> getAllRecords() throws Exception {
		List<UserDetail> userdetailsList = null;
		try {
			userdetailsList = userdetailDao.getAllRecords();
		} catch (Exception e) {
			return userdetailsList;
		}
		return userdetailsList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			userdetailDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}
