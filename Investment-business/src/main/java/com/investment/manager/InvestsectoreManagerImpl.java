package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.InvestsectoreDao;
import com.investment.entity.Investsectores;

@Service
public class InvestsectoreManagerImpl implements InvestsectoreManager {

	@Autowired
	private InvestsectoreDao investsectoreDao = null;

	@Override
	public boolean insert(Investsectores entity) throws Exception {
		boolean inserted = false;
		try {
			investsectoreDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Investsectores entyty) {
		boolean updated = false;
		try {
			investsectoreDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Investsectores entity) {
		boolean deleted = false;
		try {
			deleted = investsectoreDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Investsectores findById(int id) throws Exception {
		return investsectoreDao.findById(id);
	}

	@Override
	public Investsectores findByEmail(String email) {
		return investsectoreDao.findByEmail(email);
	}

	@Override
	public List<Investsectores> getAllRecords() throws Exception {
		List<Investsectores> investSectorsList = null;
		try {
			investSectorsList = investsectoreDao.getAllRecords();
		} catch (Exception e) {
			return investSectorsList;
		}
		return investSectorsList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			investsectoreDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}



