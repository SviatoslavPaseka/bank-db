package com.solvd.laba.bank.models;

public class Debit_in_card {
	private Long card_id;
	private Long debit_id;
	public Debit_in_card(Long card_id, Long debit_id) {
		super();
		this.card_id = card_id;
		this.debit_id = debit_id;
	}
	public Debit_in_card() {
		super();
	}
	public Long getCard_id() {
		return card_id;
	}
	public void setCard_id(Long card_id) {
		this.card_id = card_id;
	}
	public Long getDebit_id() {
		return debit_id;
	}
	public void setDebit_id(Long debit_id) {
		this.debit_id = debit_id;
	}
	
	
}
