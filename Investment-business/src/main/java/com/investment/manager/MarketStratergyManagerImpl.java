package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.MarketStratergyDao;
import com.investment.entity.MarketStratergy;

@Service
public class MarketStratergyManagerImpl implements  MarketStratergyManager{

	@Autowired
	private MarketStratergyDao marketstratergyDao = null; 
	
	@Override
	public boolean insert(MarketStratergy entity) throws Exception {
		boolean inserted = false;
		try {
			marketstratergyDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(MarketStratergy entyty) {
		boolean updated = false;
		try {
			marketstratergyDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(MarketStratergy entity) {
		boolean deleted = false;
		try {
			deleted = marketstratergyDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public MarketStratergy findById(int id) throws Exception {
		return marketstratergyDao.findById(id);
	}

	@Override
	public MarketStratergy findByEmail(String email) {
		return marketstratergyDao.findByEmail(email);
	}

	@Override
	public List<MarketStratergy> getAllRecords() throws Exception {
		List<MarketStratergy> marketStratergyList = null;
		try {
			marketStratergyList = marketstratergyDao.getAllRecords();
		} catch (Exception e) {
			return marketStratergyList;
		}
		return marketStratergyList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			marketstratergyDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}
