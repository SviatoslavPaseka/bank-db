package com.solvd.laba.bank.models;

public class Credit_in_card {
	private Integer card_id;
	private Integer credit_id;
	
	public Credit_in_card() {
		super();
	}

	public Credit_in_card(Integer card_id, Integer credit_id) {
		super();
		this.card_id = card_id;
		this.credit_id = credit_id;
	}

	public Integer getCard_id() {
		return card_id;
	}

	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}

	public Integer getCredit_id() {
		return credit_id;
	}

	public void setCredit_id(Integer credit_id) {
		this.credit_id = credit_id;
	}
	
	
}
