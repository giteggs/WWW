package com.app.service;

import java.util.List;

import com.app.model.Prashanth;

public interface PrashanthService {
	public void savePrashanth(Prashanth p);
	public void updatePrashanth(Prashanth p);
	public void deletPrashanth(Integer id);
	public Prashanth getPrashanth(Integer id);
	public List<Prashanth> getAllPrashanth();
	

}
