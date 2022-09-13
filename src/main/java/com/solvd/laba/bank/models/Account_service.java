package com.solvd.laba.bank.models;

public class Account_service {
	private Long id;
	private String name;
	
	public Account_service() {
	}
	public Account_service(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
