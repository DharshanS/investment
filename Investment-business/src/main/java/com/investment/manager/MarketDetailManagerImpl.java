package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.MarketDetailsDao;
import com.investment.entity.MarketDetails;

@Service
public class MarketDetailManagerImpl implements MarketDetailManager {

	@Autowired
	private MarketDetailsDao marketdetailsDao = null;

	@Override
	public boolean insert(MarketDetails entity) throws Exception {
		boolean inserted = false;
		try {
			marketdetailsDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(MarketDetails entyty) {
		boolean updated = false;
		try {
			marketdetailsDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(MarketDetails entity) {
		boolean deleted = false;
		try {
			deleted = marketdetailsDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public MarketDetails findById(int id) throws Exception {
		return marketdetailsDao.findById(id);
	}

	@Override
	public MarketDetails findByEmail(String email) {
		return marketdetailsDao.findByEmail(email);
	}

	@Override
	public List<MarketDetails> getAllRecords() throws Exception {
		List<MarketDetails> marketDetailsList = null;
		try {
			marketDetailsList = marketdetailsDao.getAllRecords();
		} catch (Exception e) {
			return marketDetailsList;
		}
		return marketDetailsList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			marketdetailsDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}





