package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.CompanyDao;
import com.investment.entity.Company;

@Service
public class CompanyMangerImpl implements CompanyManger {

	@Autowired
	protected CompanyDao companyDao = null;

	@Override
	public boolean insert(Company entity) throws Exception {
		boolean inserted = false;
		try {
			companyDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Company entyty) {
		boolean updated = false;
		try {
			companyDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Company entity) {
		boolean deleted = false;
		try {
			deleted = companyDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Company findById(int id) throws Exception {
		return companyDao.findById(id);
	}

	@Override
	public Company findByEmail(String email) {
		return companyDao.findByEmail(email);
	}

	@Override
	public List<Company> getAllRecords() throws Exception {
		List<Company> companyList = null;
		try {
			companyList = companyDao.getAllRecords();
		} catch (Exception e) {
			return companyList;
		}
		return companyList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			companyDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}
}




