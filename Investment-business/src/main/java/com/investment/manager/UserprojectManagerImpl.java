package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.UserprojectDao;
import com.investment.entity.Userproject;

@Service
public class UserprojectManagerImpl implements UserprojectManager {

	@Autowired
	private UserprojectDao userprojectDao = null;

	@Override
	public boolean insert(Userproject entity) throws Exception {
		boolean inserted = false;
		try {
			userprojectDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Userproject entyty) {
		boolean updated = false;
		try {
			userprojectDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Userproject entity) {
		boolean deleted = false;
		try {
			deleted = userprojectDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Userproject findById(int id) throws Exception {
		return userprojectDao.findById(id);
	}

	@Override
	public Userproject findByEmail(String email) {
		return userprojectDao.findByEmail(email);
	}

	@Override
	public List<Userproject> getAllRecords() throws Exception {
		List<Userproject> userProjectList = null;
		try {
			userProjectList = userprojectDao.getAllRecords();
		} catch (Exception e) {
			return userProjectList;
		}
		return userProjectList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			userprojectDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}
