package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.ProjectDao;
import com.investment.entity.Project;

@Service
public class ProjectManagerImpl implements ProjectManager{

	@Autowired
	private ProjectDao pojectDao = null;
	
	@Override
	public boolean insert(Project entity) throws Exception {
		boolean inserted = false;
		try {
			pojectDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Project entyty) {
		boolean updated = false;
		try {
			pojectDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Project entity) {
		boolean deleted = false;
		try {
			deleted = pojectDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Project findById(int id) throws Exception {
		return pojectDao.findById(id);
	}

	@Override
	public Project findByEmail(String email) {
		return pojectDao.findByEmail(email);
	}

	@Override
	public List<Project> getAllRecords() throws Exception {
		List<Project> projectList = null;
		try {
			projectList = pojectDao.getAllRecords();
		} catch (Exception e) {
			return projectList;
		}
		return projectList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			pojectDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}
