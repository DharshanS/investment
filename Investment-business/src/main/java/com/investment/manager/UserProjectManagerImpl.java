package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.UserProjectDao;
import com.investment.entity.UserProject;

@Service
public class UserProjectManagerImpl implements UserProjectManager {

	@Autowired
	private UserProjectDao userprojectDao = null;

	@Override
	public boolean insert(UserProject entity) throws Exception {
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
	public boolean update(UserProject entyty) {
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
	public boolean delete(UserProject entity) {
		boolean deleted = false;
		try {
			deleted = userprojectDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public UserProject findById(int id) throws Exception {
		return userprojectDao.findById(id);
	}

	@Override
	public UserProject findByEmail(String email) {
		return userprojectDao.findByEmail(email);
	}

	@Override
	public List<UserProject> getAllRecords() throws Exception {
		List<UserProject> userProjectList = null;
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
