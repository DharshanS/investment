package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.TeamDetailDao;
import com.investment.entity.TeamDetail;

@Service
public class TeamDetailManagerImpl implements TeamDetailManager {

	@Autowired
	TeamDetailDao teamdetailsDao = null;

	@Override
	public boolean insert(TeamDetail entity) throws Exception {
		boolean inserted = false;
		try {
			teamdetailsDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(TeamDetail entyty) {
		boolean updated = false;
		try {
			teamdetailsDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(TeamDetail entity) {
		boolean deleted = false;
		try {
			deleted = teamdetailsDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public TeamDetail findById(int id) throws Exception {
		return teamdetailsDao.findById(id);
	}

	@Override
	public TeamDetail findByEmail(String email) {
		return teamdetailsDao.findByEmail(email);
	}

	@Override
	public List<TeamDetail> getAllRecords() throws Exception {
		List<TeamDetail> teamdetailsList = null;
		try {
			teamdetailsList = teamdetailsDao.getAllRecords();
		} catch (Exception e) {
			return teamdetailsList;
		}
		return teamdetailsList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			teamdetailsDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}
}



















