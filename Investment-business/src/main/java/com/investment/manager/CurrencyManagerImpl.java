package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.CurrencyDao;
import com.investment.entity.Currency;

@Service
public class CurrencyManagerImpl implements CurrencyManager{

	@Autowired
	protected CurrencyDao currencyDao = null;
	
	@Override
	public Currency insert(Currency entity) throws Exception {
		
		return null;
	}

	@Override
	public List<Currency> getAllRecords() throws Exception {
		return currencyDao.getAllRecords();
	}

	@Override
	public Currency findById(int id) throws Exception {

		return null;
	}

}



