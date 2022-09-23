package com.solvd.laba.bank.models;

import java.util.List;

public class Account_service {
	private Integer id;
	private String name;
	
	private List<Integer> account_numbers;
	
	public Account_service() {
	}
	public Account_service(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Account_service [id=" + id + ", name=" + name + "]";
	}
	
}
