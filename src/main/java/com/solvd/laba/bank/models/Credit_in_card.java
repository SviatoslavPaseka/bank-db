package com.solvd.laba.bank.models;

public class Credit_in_card {
	private Long card_id;
	private Long credit_id;
	
	public Credit_in_card() {
		super();
	}

	public Credit_in_card(Long card_id, Long credit_id) {
		super();
		this.card_id = card_id;
		this.credit_id = credit_id;
	}

	public Long getCard_id() {
		return card_id;
	}

	public void setCard_id(Long card_id) {
		this.card_id = card_id;
	}

	public Long getCredit_id() {
		return credit_id;
	}

	public void setCredit_id(Long credit_id) {
		this.credit_id = credit_id;
	}
	
	
}
