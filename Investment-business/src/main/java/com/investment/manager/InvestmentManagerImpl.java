package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.InvestmentDao;
import com.investment.entity.Investment;

@Service
public class InvestmentManagerImpl implements InvestmentManager{

	@Autowired
	private InvestmentDao invesmentDao = null;
	
	@Override
	public boolean insert(Investment entity) throws Exception {
		boolean inserted = false;
		try {
			invesmentDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Investment entyty) {
		boolean updated = false;
		try {
			invesmentDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Investment entity) {
		boolean deleted = false;
		try {
			deleted = invesmentDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Investment findById(int id) throws Exception {
		return invesmentDao.findById(id);
	}

	@Override
	public Investment findByEmail(String email) {
		return invesmentDao.findByEmail(email);
	}

	@Override
	public List<Investment> getAllRecords() throws Exception {
		List<Investment> invesmentList = null;
		try {
			invesmentList = invesmentDao.getAllRecords();
		} catch (Exception e) {
			return invesmentList;
		}
		return invesmentList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			invesmentDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}















