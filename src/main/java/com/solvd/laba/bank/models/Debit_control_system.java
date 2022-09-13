package com.solvd.laba.bank.models;

public class Debit_control_system {
	private Long id;
	private String name;
	private Long manager_id;
	
	public Debit_control_system() {
	}
	public Debit_control_system(Long id, String name, Long manager_id) {
		this.id = id;
		this.name = name;
		this.manager_id = manager_id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getManager_id() {
		return manager_id;
	}
	public void setManager_id(Long manager_id) {
		this.manager_id = manager_id;
	}
	
	
}
