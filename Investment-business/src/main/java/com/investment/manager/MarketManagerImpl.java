package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.MarketDao;
import com.investment.entity.Market;

@Service
public class MarketManagerImpl implements MarketManager{

	@Autowired 
	private MarketDao marketDao = null;
	
	@Override
	public boolean insert(Market entity) throws Exception {
		boolean inserted = false;
		try {
			marketDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Market entyty) {
		boolean updated = false;
		try {
			marketDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Market entity) {
		boolean deleted = false;
		try {
			deleted = marketDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Market findById(int id) throws Exception {
		return marketDao.findById(id);
	}

	@Override
	public Market findByEmail(String email) {
		return marketDao.findByEmail(email);
	}

	@Override
	public List<Market> getAllRecords() throws Exception {
		List<Market> marketList = null;
		try {
			marketList = marketDao.getAllRecords();
		} catch (Exception e) {
			return marketList;
		}
		return marketList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			marketDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}







