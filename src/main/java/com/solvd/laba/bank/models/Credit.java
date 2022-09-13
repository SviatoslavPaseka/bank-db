package com.solvd.laba.bank.models;

public class Credit {
	private Long id;
	private Double value;
	private Long credit_control_system_id;
	private Long credit_control_system_manager_id;

	public Credit(Long id, Double value, Long credit_control_system_id, Long credit_control_system_manager_id) {
		this.id = id;
		this.value = value;
		this.credit_control_system_id = credit_control_system_id;
		this.credit_control_system_manager_id = credit_control_system_manager_id;
	}
	public Credit() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Long getCredit_control_system_id() {
		return credit_control_system_id;
	}
	public void setCredit_control_system_id(Long credit_control_system_id) {
		this.credit_control_system_id = credit_control_system_id;
	}
	public Long getCredit_control_system_manager_id() {
		return credit_control_system_manager_id;
	}
	public void setCredit_control_system_manager_id(Long credit_control_system_manager_id) {
		this.credit_control_system_manager_id = credit_control_system_manager_id;
	}
	
	
}
