package com.solvd.laba.bank.models;

public class Current_manager {
	private Long account_ac_no;
	private Long account_service_id;
	
	public Current_manager() {
	}
	public Current_manager(Long account_ac_no, Long account_service_id) {
		this.account_ac_no = account_ac_no;
		this.account_service_id = account_service_id;
	}
	
	public Long getAccount_ac_no() {
		return account_ac_no;
	}
	public void setAccount_ac_no(Long account_ac_no) {
		this.account_ac_no = account_ac_no;
	}
	public Long getAccount_service_id() {
		return account_service_id;
	}
	public void setAccount_service_id(Long account_service_id) {
		this.account_service_id = account_service_id;
	}
}
