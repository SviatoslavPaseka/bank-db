package com.solvd.laba.bank.models;

import java.util.List;

public class Card {
	private Integer id;
	private String card_type;
//	private Integer account_ac_no;
	
	private List<Integer> credit_ids;
	private List<Integer> debit_ids;
	
	public Card() {
	}
	public Card(Integer id, String card_type) {
		this.id = id;
		this.card_type = card_type;
//		this.account_ac_no = account_ac_no;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
//	public Integer getAccount_ac_no() {
//		return account_ac_no;
//	}
//	public void setAccount_ac_no(Integer account_ac_no) {
//		this.account_ac_no = account_ac_no;
//	}
}
