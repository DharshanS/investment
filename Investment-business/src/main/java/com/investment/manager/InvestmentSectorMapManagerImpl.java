package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.InvestmentSectorMapDao;
import com.investment.entity.InvestmentSectorMap;

@Service
public class InvestmentSectorMapManagerImpl implements InvestmentSectorMapManager {

	@Autowired
	private InvestmentSectorMapDao investsectorsmapDao = null;

	@Override
	public boolean insert(InvestmentSectorMap entity) throws Exception {
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
	public boolean update(InvestmentSectorMap entyty) {
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
	public boolean delete(InvestmentSectorMap entity) {
		boolean deleted = false;
		try {
			deleted = investsectorsmapDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public InvestmentSectorMap findById(int id) throws Exception {
		return investsectorsmapDao.findById(id);
	}

	@Override
	public InvestmentSectorMap findByEmail(String email) {
		return investsectorsmapDao.findByEmail(email);
	}

	@Override
	public List<InvestmentSectorMap> getAllRecords() throws Exception {
		List<InvestmentSectorMap> investSectorsMapList = null;
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








