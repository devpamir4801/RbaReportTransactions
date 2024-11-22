package com.banking.spring.entity;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Targetdb {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getMoneyIn() {
		return MoneyIn;
	}

	public void setMoneyIn(Double moneyIn) {
		MoneyIn = moneyIn;
	}

	private Double MoneyIn;
	private Double TransactionId;
    
    public Double getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(Double transactionId) {
		TransactionId = transactionId;
	}

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "TRDB")
	private List<RbaReportFile> rbareports;

}



