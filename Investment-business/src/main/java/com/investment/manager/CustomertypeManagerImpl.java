package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.CustomertypeDao;
import com.investment.entity.Customertype;

@Service
public class CustomertypeManagerImpl implements CustomertypeManager {

	@Autowired
	private CustomertypeDao customertypeDao;

	@Override
	public boolean insert(Customertype entity) throws Exception {
		boolean inserted = false;
		try {
			customertypeDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Customertype entyty) {
		boolean updated = false;
		try {
			customertypeDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Customertype entity) {
		boolean deleted = false;
		try {
			deleted = customertypeDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Customertype findById(int id) throws Exception {
		return customertypeDao.findById(id);
	}

	@Override
	public Customertype findByEmail(String email) {
		return customertypeDao.findByEmail(email);
	}

	@Override
	public List<Customertype> getAllRecords() throws Exception {
		List<Customertype> customertypes = null;
		try {
			customertypes = customertypeDao.getAllRecords();
		} catch (Exception e) {
			return customertypes;
		}
		return customertypes;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try{
			customertypeDao.deleteAllRecords();
			deleted = true;
			return deleted;
		}catch(Exception e){
			return deleted;
		}
	}

}





















