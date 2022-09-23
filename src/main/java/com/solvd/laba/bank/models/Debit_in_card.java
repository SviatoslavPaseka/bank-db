package com.solvd.laba.bank.models;

public class Debit_in_card {
	private Integer card_id;
	private Integer debit_id;
	public Debit_in_card(Integer card_id, Integer debit_id) {
		super();
		this.card_id = card_id;
		this.debit_id = debit_id;
	}
	public Debit_in_card() {
		super();
	}
	public Integer getCard_id() {
		return card_id;
	}
	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}
	public Integer getDebit_id() {
		return debit_id;
	}
	public void setDebit_id(Integer debit_id) {
		this.debit_id = debit_id;
	}
	
	
}
