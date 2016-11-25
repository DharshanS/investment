package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.MarketdetailsDao;
import com.investment.entity.Marketdetails;

@Service
public class MarketdetailsManagerImpl implements MarketdetailManager {

	@Autowired
	private MarketdetailsDao marketdetailsDao = null;

	@Override
	public boolean insert(Marketdetails entity) throws Exception {
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
	public boolean update(Marketdetails entyty) {
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
	public boolean delete(Marketdetails entity) {
		boolean deleted = false;
		try {
			deleted = marketdetailsDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Marketdetails findById(int id) throws Exception {
		return marketdetailsDao.findById(id);
	}

	@Override
	public Marketdetails findByEmail(String email) {
		return marketdetailsDao.findByEmail(email);
	}

	@Override
	public List<Marketdetails> getAllRecords() throws Exception {
		List<Marketdetails> marketDetailsList = null;
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





