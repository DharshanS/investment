package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.CurrencyDao;
import com.investment.entity.Currency;

@Service
public class CurrencyManagerImpl implements CurrencyManager {

	@Autowired
	protected CurrencyDao currencyDao = null;

	@Override
	public boolean insert(Currency entity) throws Exception {
		boolean inserted = false;
		try {
			currencyDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Currency entyty) {
		boolean updated = false;
		try {
			currencyDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Currency entity) {
		boolean deleted = false;
		try {
			deleted = currencyDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Currency findById(int id) throws Exception {
		return currencyDao.findById(id);
	}

	@Override
	public Currency findByEmail(String email) {
		return currencyDao.findByEmail(email);
	}

	@Override
	public List<Currency> getAllRecords() throws Exception {
		List<Currency> currencyList = null;
		try {
			currencyList = currencyDao.getAllRecords();
		} catch (Exception e) {
			return currencyList;
		}
		return currencyList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			currencyDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}
}








