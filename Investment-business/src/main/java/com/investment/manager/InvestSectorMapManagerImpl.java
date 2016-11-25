package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.InvestSectorMapDao;
import com.investment.entity.InvestSectorMap;

@Service
public class InvestSectorMapManagerImpl implements InvestSectorMapManager {

	@Autowired
	private InvestSectorMapDao investsectorsmapDao = null;

	@Override
	public boolean insert(InvestSectorMap entity) throws Exception {
		boolean inserted = false;
		try {
			investsectorsmapDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(InvestSectorMap entyty) {
		boolean updated = false;
		try {
			investsectorsmapDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(InvestSectorMap entity) {
		boolean deleted = false;
		try {
			deleted = investsectorsmapDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public InvestSectorMap findById(int id) throws Exception {
		return investsectorsmapDao.findById(id);
	}

	@Override
	public InvestSectorMap findByEmail(String email) {
		return investsectorsmapDao.findByEmail(email);
	}

	@Override
	public List<InvestSectorMap> getAllRecords() throws Exception {
		List<InvestSectorMap> investSectorsMapList = null;
		try {
			investSectorsMapList = investsectorsmapDao.getAllRecords();
		} catch (Exception e) {
			return investSectorsMapList;
		}
		return investSectorsMapList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			investsectorsmapDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}








