package com.investment.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.dao.MemberDao;
import com.investment.entity.Member;

@Service
public class MemberManagerImpl implements MemberManager{

	@Autowired
	private MemberDao memberDao = null;
	
	@Override
	public boolean insert(Member entity) throws Exception {
		boolean inserted = false;
		try {
			memberDao.persist(entity);
			inserted = true;
			return inserted;
		} catch (Exception e) {
			return inserted;
		}
	}

	@Override
	public boolean update(Member entyty) {
		boolean updated = false;
		try {
			memberDao.update(entyty);
			updated = true;
			return updated;
		} catch (Exception e) {
			updated = false;
			return updated;
		}
	}

	@Override
	public boolean delete(Member entity) {
		boolean deleted = false;
		try {
			deleted = memberDao.delete(entity);
		} catch (Exception e) {
			return deleted;
		}
		return deleted;
	}

	@Override
	public Member findById(int id) throws Exception {
		return memberDao.findById(id);
	}

	@Override
	public Member findByEmail(String email) {
		return memberDao.findByEmail(email);
	}

	@Override
	public List<Member> getAllRecords() throws Exception {
		List<Member> memberList = null;
		try {
			memberList = memberDao.getAllRecords();
		} catch (Exception e) {
			return memberList;
		}
		return memberList;
	}

	@Override
	public boolean deleteAllRecords() {
		boolean deleted = false;
		try {
			memberDao.deleteAllRecords();
			deleted = true;
			return deleted;
		} catch (Exception e) {
			return deleted;
		}
	}

}

















