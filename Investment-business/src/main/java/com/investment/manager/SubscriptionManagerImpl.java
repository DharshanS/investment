package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.SubscriptionDao;
import com.investment.entity.Subscription;

@Service
public class SubscriptionManagerImpl implements SubscriptionManager{
	
	@Autowired
	private SubscriptionDao subscriptionDao = null;
	
	@Override
	public boolean insert(Subscription entity) throws Exception {
		boolean inserted = false;
		try {
			subscriptionDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Subscription entyty) {
		boolean updated = false;
		try {
			subscriptionDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Subscription entity) {
		boolean deleted = false;
		try {
			deleted = subscriptionDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Subscription findById(int id) throws Exception {
		return subscriptionDao.findById(id);
	}

	@Override
	public Subscription findByEmail(String email) {
		return subscriptionDao.findByEmail(email);
	}

	@Override
	public List<Subscription> getAllRecords() throws Exception {
		List<Subscription> subscriptionList = null;
		try {
			subscriptionList = subscriptionDao.getAllRecords();
		} catch (Exception e) {
			return subscriptionList;
		}
		return subscriptionList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			subscriptionDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}
