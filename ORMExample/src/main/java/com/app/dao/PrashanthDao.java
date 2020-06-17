package com.app.dao;

import java.util.List;

import com.app.model.Prashanth;

public interface PrashanthDao {
	public void savePrashanth(Prashanth p);
	public void updatePrashanth(Prashanth p);
	public void deletPrashanth(Integer id);
	public Prashanth getPrashanth(Integer id);
	public List<Prashanth> getAllPrashanth();
	

}
