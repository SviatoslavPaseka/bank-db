package com.solvd.laba.bank.models;

import java.util.List;

public class Credit_control_system {
	private Integer id;
	private String name;
	private Integer manager_id;
	private Double max_credit_value;
	
	private List<Integer> credit_ids;
	
	public Credit_control_system(Integer id, String name, Integer manager_id, Double max_credit_value) {
		this.id = id;
		this.name = name;
		this.manager_id = manager_id;
		this.max_credit_value = max_credit_value;
	}
	public Credit_control_system() {
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
	public Double getMax_credit_value() {
		return max_credit_value;
	}
	public void setMax_credit_value(Double max_credit_value) {
		this.max_credit_value = max_credit_value;
	}
	
}
