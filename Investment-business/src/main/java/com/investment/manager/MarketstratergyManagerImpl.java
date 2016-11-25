package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.MarketstratergyDao;
import com.investment.entity.Marketstratergy;

@Service
public class MarketstratergyManagerImpl implements  MarketstratergyManager{

	@Autowired
	private MarketstratergyDao marketstratergyDao = null; 
	
	@Override
	public boolean insert(Marketstratergy entity) throws Exception {
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
	public boolean update(Marketstratergy entyty) {
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
	public boolean delete(Marketstratergy entity) {
		boolean deleted = false;
		try {
			deleted = marketstratergyDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Marketstratergy findById(int id) throws Exception {
		return marketstratergyDao.findById(id);
	}

	@Override
	public Marketstratergy findByEmail(String email) {
		return marketstratergyDao.findByEmail(email);
	}

	@Override
	public List<Marketstratergy> getAllRecords() throws Exception {
		List<Marketstratergy> marketStratergyList = null;
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
