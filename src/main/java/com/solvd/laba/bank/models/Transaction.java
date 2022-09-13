package com.solvd.laba.bank.models;

import java.time.LocalDate;

public class Transaction {
	private Long id;
	private Double value;
	private LocalDate date;
	private Long account_ac_no;
	
	public Transaction() {
		super();
	}
	public Transaction(Long id, Double value, LocalDate date, Long account_ac_no) {
		super();
		this.id = id;
		this.value = value;
		this.date = date;
		this.account_ac_no = account_ac_no;
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
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Long getAccount_ac_no() {
		return account_ac_no;
	}
	public void setAccount_ac_no(Long account_ac_no) {
		this.account_ac_no = account_ac_no;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", value=" + value + ", date=" + date + ", account_ac_no=" + account_ac_no
				+ "]";
	}
	
}
