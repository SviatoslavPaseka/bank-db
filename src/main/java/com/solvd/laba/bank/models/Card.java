package com.solvd.laba.bank.models;

public class Card {
	private Long id;
	private String card_type;
	private Long account_ac_no;
	
	public Card() {
	}
	public Card(Long id, String card_type, Long account_ac_no) {
		this.id = id;
		this.card_type = card_type;
		this.account_ac_no = account_ac_no;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public Long getAccount_ac_no() {
		return account_ac_no;
	}
	public void setAccount_ac_no(Long account_ac_no) {
		this.account_ac_no = account_ac_no;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", card_type=" + card_type + ", account_ac_no=" + account_ac_no + "]";
	}
	
}
