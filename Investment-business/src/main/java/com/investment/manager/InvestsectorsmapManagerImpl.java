package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.InvestsectorsmapDao;
import com.investment.entity.Investsectorsmap;

@Service
public class InvestsectorsmapManagerImpl implements InvestsectorsmapManager {

	@Autowired
	private InvestsectorsmapDao investsectorsmapDao = null;

	@Override
	public boolean insert(Investsectorsmap entity) throws Exception {
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
	public boolean update(Investsectorsmap entyty) {
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
	public boolean delete(Investsectorsmap entity) {
		boolean deleted = false;
		try {
			deleted = investsectorsmapDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Investsectorsmap findById(int id) throws Exception {
		return investsectorsmapDao.findById(id);
	}

	@Override
	public Investsectorsmap findByEmail(String email) {
		return investsectorsmapDao.findByEmail(email);
	}

	@Override
	public List<Investsectorsmap> getAllRecords() throws Exception {
		List<Investsectorsmap> investSectorsMapList = null;
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








