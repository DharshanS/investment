package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.AnalyticsDao;
import com.investment.entity.Analytics;

@Service
public class AnalyticManagerImpl implements AnalyticManager {

	@Autowired
	private AnalyticsDao analyticsDao = null;

	@Override
	public boolean insert(Analytics entity) throws Exception {
		boolean inserted = false;
		try {
			analyticsDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Analytics entyty) {
		boolean updated = false;
		try {
			analyticsDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Analytics entity) {
		boolean deleted = false;
		try {
			deleted = analyticsDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Analytics findById(int id) throws Exception {
		return analyticsDao.findById(id);
	}

	@Override
	public Analytics findByEmail(String email) {
		return analyticsDao.findByEmail(email);
	}

	@Override
	public List<Analytics> getAllRecords() throws Exception {
		List<Analytics> analyticsList = null;
		try {
			analyticsList = analyticsDao.getAllRecords();
		} catch (Exception e) {
			return analyticsList;
		}
		return analyticsList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			analyticsDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}



