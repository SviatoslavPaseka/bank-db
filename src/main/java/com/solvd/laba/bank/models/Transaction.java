package com.solvd.laba.bank.models;

import java.time.LocalDate;

public class Transaction {
	private Integer id;
	private Double value;
	private LocalDate date;
//	private Integer account_ac_no;
	
	public Transaction() {
		super();
	}
	public Transaction(Integer id, Double value, LocalDate date) {
		super();
		this.id = id;
		this.value = value;
		this.date = date;
//		this.account_ac_no = account_ac_no;
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
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
//	public Integer getAccount_ac_no() {
//		return account_ac_no;
//	}
//	public void setAccount_ac_no(Integer account_ac_no) {
//		this.account_ac_no = account_ac_no;
//	}
}
