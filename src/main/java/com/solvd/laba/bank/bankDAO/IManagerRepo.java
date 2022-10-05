package com.solvd.laba.bank.bankDAO;

import java.util.List;

import com.solvd.laba.bank.models.Manager;

public interface IManagerRepo {
	Manager findById(Integer id);
	List<Manager> findAll();
	void createManager(Manager manager);
	void updateManager(Manager manager);
	void deleteById(Integer id);
}
