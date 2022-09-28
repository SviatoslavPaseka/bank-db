package com.solvd.laba.bank.models;

import java.util.List;

public class Credit {
	private Integer id;
	private Double value;
//	private Integer credit_control_system_id;
//	private Integer credit_control_system_manager_id;

	private List<Integer> card_ids;
	
	public Credit(Integer id, Double value) {
		this.id = id;
		this.value = value;
//		this.credit_control_system_id = credit_control_system_id;
//		this.credit_control_system_manager_id = credit_control_system_manager_id;
	}
	public Credit() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
//	public Integer getCredit_control_system_id() {
//		return credit_control_system_id;
//	}
//	public void setCredit_control_system_id(Integer credit_control_system_id) {
//		this.credit_control_system_id = credit_control_system_id;
//	}
//	public Integer getCredit_control_system_manager_id() {
//		return credit_control_system_manager_id;
//	}
//	public void setCredit_control_system_manager_id(Integer credit_control_system_manager_id) {
//		this.credit_control_system_manager_id = credit_control_system_manager_id;
//	}
	@Override
	public String toString() {
		return "Credit [id=" + id + ", value=" + value + "]";
	}
}
