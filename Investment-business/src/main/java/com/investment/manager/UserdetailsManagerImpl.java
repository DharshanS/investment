package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.UserdetailsDao;
import com.investment.entity.Userdetails;

@Service
public class UserdetailsManagerImpl implements UserdetailManager{

	@Autowired
	private UserdetailsDao userdetailDao = null;
	
	@Override
	public boolean insert(Userdetails entity) throws Exception {
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
	public boolean update(Userdetails entyty) {
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
	public boolean delete(Userdetails entity) {
		boolean deleted = false;
		try {
			deleted = userdetailDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Userdetails findById(int id) throws Exception {
		return userdetailDao.findById(id);
	}

	@Override
	public Userdetails findByEmail(String email) {
		return userdetailDao.findByEmail(email);
	}

	@Override
	public List<Userdetails> getAllRecords() throws Exception {
		List<Userdetails> userdetailsList = null;
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
