package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.DesignationsDao;
import com.investment.entity.Designations;

@Service
public class DesignationManagerImpl implements DesignationManager {

	@Autowired
	private DesignationsDao designationDao = null;

	@Override
	public boolean insert(Designations entity) throws Exception {
		boolean inserted = false;
		try {
			designationDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Designations entyty) {
		boolean updated = false;
		try {
			designationDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Designations entity) {
		boolean deleted = false;
		try {
			deleted = designationDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Designations findById(int id) throws Exception {
		return designationDao.findById(id);
	}

	@Override
	public Designations findByEmail(String email) {
		return designationDao.findByEmail(email);
	}

	@Override
	public List<Designations> getAllRecords() throws Exception {
		List<Designations> designationsList = null;
		try {
			designationsList = designationDao.getAllRecords();
		} catch (Exception e) {
			return designationsList;
		}
		return designationsList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			designationDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}
