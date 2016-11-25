package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.CampaignTypeDao;
import com.investment.entity.CampaignType;

@Service
public class CampaignTypeManagerImpl implements CampaignTypeManager {

	@Autowired
	private CampaignTypeDao campaignTypeDao = null;

	@Override
	public boolean insert(CampaignType entity) throws Exception {
		boolean inserted = false;
		try {
			campaignTypeDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(CampaignType entyty) {
		boolean updated = false;
		try {
			campaignTypeDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(CampaignType entity) {
		boolean deleted = false;
		try {
			deleted = campaignTypeDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public CampaignType findById(int id) throws Exception {
		return campaignTypeDao.findById(id);
	}

	@Override
	public CampaignType findByEmail(String email) {
		return campaignTypeDao.findByEmail(email);
	}

	@Override
	public List<CampaignType> getAllRecords() throws Exception {
		List<CampaignType> currencyList = null;
		try {
			currencyList = campaignTypeDao.getAllRecords();
		} catch (Exception e) {
			return currencyList;
		}
		return currencyList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			campaignTypeDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}
