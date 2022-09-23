package com.solvd.laba.bank.models;

public class Current_manager {
	private Integer account_ac_no;
	private Integer account_service_id;
	
	public Current_manager() {
	}
	public Current_manager(Integer account_ac_no, Integer account_service_id) {
		this.account_ac_no = account_ac_no;
		this.account_service_id = account_service_id;
	}
	
	public Integer getAccount_ac_no() {
		return account_ac_no;
	}
	public void setAccount_ac_no(Integer account_ac_no) {
		this.account_ac_no = account_ac_no;
	}
	public Integer getAccount_service_id() {
		return account_service_id;
	}
	public void setAccount_service_id(Integer account_service_id) {
		this.account_service_id = account_service_id;
	}
}
