package com.app.implService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PrashanthDao;
import com.app.model.Prashanth;
import com.app.service.PrashanthService;
@Service
public class PrashanthServiceImpl implements PrashanthService {
	@Autowired
	private PrashanthDao dao;

	@Transactional
	public void savePrashanth(Prashanth p) {
		dao.savePrashanth(p);

	}

	@Transactional
	public void updatePrashanth(Prashanth p) {
		// TODO Auto-generated method stub
		dao.updatePrashanth(p);

	}

	@Transactional
	public void deletPrashanth(Integer id) {
		// TODO Auto-generated method stub
       dao.deletPrashanth(id);
	}

	@Transactional
	public Prashanth getPrashanth(Integer id) {
		// TODO Auto-generated method stub
		return dao.getPrashanth(id);
	}

	@Transactional
	public List<Prashanth> getAllPrashanth() {
		// TODO Auto-generated method stub
		return dao.getAllPrashanth();
	}

}
