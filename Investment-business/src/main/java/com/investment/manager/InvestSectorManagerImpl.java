package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.InvestSectorDao;
import com.investment.entity.InvestSector;

@Service
public class InvestSectorManagerImpl implements InvestSectorManager {

	@Autowired
	private InvestSectorDao investsectoreDao = null;

	@Override
	public boolean insert(InvestSector entity) throws Exception {
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
	public boolean update(InvestSector entyty) {
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
	public boolean delete(InvestSector entity) {
		boolean deleted = false;
		try {
			deleted = investsectoreDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public InvestSector findById(int id) throws Exception {
		return investsectoreDao.findById(id);
	}

	@Override
	public InvestSector findByEmail(String email) {
		return investsectoreDao.findByEmail(email);
	}

	@Override
	public List<InvestSector> getAllRecords() throws Exception {
		List<InvestSector> investSectorsList = null;
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



