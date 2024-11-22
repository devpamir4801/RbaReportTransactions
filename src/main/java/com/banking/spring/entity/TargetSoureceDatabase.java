package com.banking.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TargetSoureceDatabase {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Double id;
	public Double getId() {
		return id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	private Double moneyIN;
	public Double getMoneyIN() {
		return moneyIN;
	}
	public void setMoneyIN(Double moneyIN) {
		this.moneyIN = moneyIN;
	}
}
