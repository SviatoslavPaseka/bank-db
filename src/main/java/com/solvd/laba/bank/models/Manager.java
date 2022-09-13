package com.solvd.laba.bank.models;

public class Manager {
	private Long id;
	private String name;
	private Double salary;
	private String hirerarghy;
	private Double month_income;
	
	public Manager() {
	}
	public Manager(Long id, String name, Double salary, String hirerarghy, Double month_income) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hirerarghy = hirerarghy;
		this.month_income = month_income;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getHirerarghy() {
		return hirerarghy;
	}
	public void setHirerarghy(String hirerarghy) {
		this.hirerarghy = hirerarghy;
	}
	public Double getMonth_income() {
		return month_income;
	}
	public void setMonth_income(Double month_income) {
		this.month_income = month_income;
	}
}
