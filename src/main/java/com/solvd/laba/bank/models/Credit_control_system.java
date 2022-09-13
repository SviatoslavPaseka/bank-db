package com.solvd.laba.bank.models;

public class Credit_control_system {
	private Long id;
	private String name;
	private Long manager_id;
	private Double max_credit_value;
	
	public Credit_control_system(Long id, String name, Long manager_id, Double max_credit_value) {
		this.id = id;
		this.name = name;
		this.manager_id = manager_id;
		this.max_credit_value = max_credit_value;
	}
	public Credit_control_system() {
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
	public Double getMax_credit_value() {
		return max_credit_value;
	}
	public void setMax_credit_value(Double max_credit_value) {
		this.max_credit_value = max_credit_value;
	}
	
}
