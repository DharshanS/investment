package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.RoleDao;
import com.investment.entity.Role;

@Service
public class RoleManagerImpl implements RoleManager{

	@Autowired
	private RoleDao roleDao = null;
	
	@Override
	public boolean insert(Role entity) throws Exception {
		boolean inserted = false;
		try {
			roleDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Role entyty) {
		boolean updated = false;
		try {
			roleDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Role entity) {
		boolean deleted = false;
		try {
			deleted = roleDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Role findById(int id) throws Exception {
		return roleDao.findById(id);
	}

	@Override
	public Role findByEmail(String email) {
		return roleDao.findByEmail(email);
	}

	@Override
	public List<Role> getAllRecords() throws Exception {
		List<Role> rollList = null;
		try {
			rollList = roleDao.getAllRecords();
		} catch (Exception e) {
			return rollList;
		}
		return rollList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			roleDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}



