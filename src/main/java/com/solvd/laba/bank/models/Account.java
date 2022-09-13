package com.solvd.laba.bank.models;

public class Account {
	private Long ac_no;
	private Double balance;
	private String ac_type;
	private Long user_id;
	
	public Account() {
	}
	public Account(Long ac_no, Double balance, String ac_type, Long user_id) {
		this.ac_no = ac_no;
		this.balance = balance;
		this.ac_type = ac_type;
		this.user_id = user_id;
	}
	public Long getAc_no() {
		return ac_no;
	}
	public void setAc_no(Long ac_no) {
		this.ac_no = ac_no;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getAc_type() {
		return ac_type;
	}
	public void setAc_type(String ac_type) {
		this.ac_type = ac_type;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Account [ac_no=" + ac_no + ", balance=" + balance + ", ac_type=" + ac_type + ", user_id=" + user_id
				+ "]";
	}
	
}
