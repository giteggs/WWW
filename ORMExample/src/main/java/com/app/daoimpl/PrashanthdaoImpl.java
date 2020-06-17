package com.app.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.PrashanthDao;
import com.app.model.Prashanth;
@Repository
public class PrashanthdaoImpl implements PrashanthDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public void savePrashanth(Prashanth p) {
		ht.save(p);

	}

	@Override
	public void updatePrashanth(Prashanth p) {
		 ht.update(p);

	}

	@Override
	public void deletPrashanth(Integer id) {
		Prashanth p=new Prashanth();
		p.setPrsId(id);
	 ht.delete(id);

	}

	@Override
	public Prashanth getPrashanth(Integer id) {
		// TODO Auto-generated method stub
		return ht.get(Prashanth.class, id);
	}

	@Override
	public List<Prashanth> getAllPrashanth() {
		// TODO Auto-generated method stub
		return ht.loadAll(Prashanth.class);
	}

}
