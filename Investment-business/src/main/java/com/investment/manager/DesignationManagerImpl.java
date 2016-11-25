package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.DesignationDao;
import com.investment.entity.Designation;

@Service
public class DesignationManagerImpl implements DesignationManager {

	@Autowired
	private DesignationDao designationDao = null;

	@Override
	public boolean insert(Designation entity) throws Exception {
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
	public boolean update(Designation entyty) {
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
	public boolean delete(Designation entity) {
		boolean deleted = false;
		try {
			deleted = designationDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Designation findById(int id) throws Exception {
		return designationDao.findById(id);
	}

	@Override
	public Designation findByEmail(String email) {
		return designationDao.findByEmail(email);
	}

	@Override
	public List<Designation> getAllRecords() throws Exception {
		List<Designation> designationsList = null;
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
