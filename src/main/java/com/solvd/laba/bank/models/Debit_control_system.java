package com.solvd.laba.bank.models;

import java.util.List;

public class Debit_control_system {
	private Integer id;
	private String name;
	private Integer manager_id;
	
	private List<Integer> debit_ids;
	
	public Debit_control_system() {
	}
	public Debit_control_system(Integer id, String name, Integer manager_id) {
		this.id = id;
		this.name = name;
		this.manager_id = manager_id;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getManager_id() {
		return manager_id;
	}
	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}
	
	
}
