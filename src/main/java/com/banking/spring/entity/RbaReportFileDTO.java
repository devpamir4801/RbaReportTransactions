package com.banking.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RbaReportFileDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long DTO;
	private Long id;

	public RbaReportFileDTO() {
		
	}
	public RbaReportFileDTO(Long dTO, Long id, String transactionDate, String bankName, String bankAddress,
			Double bankPhoneNo, String accountHolderName, String accountHolderAddress, String accountHolderPhoneNo,
			String accountHolderSsn, String typeofAccount, Double routingNo, String accountNo, String openningBalance,
			String closingBalance, Double interestRate, String lastStatementDate, String discription,
			Double refChequeno, String moneyIn, String moneyOut, String transactionAmount, String transactionType,
			Double transactionId, String transactionParticular, String sourceCountry, String destinationCountry) {
		super();
		DTO = dTO;
		this.id = id;
		this.TransactionDate = transactionDate;
		this.BankName = bankName;
		this.BankAddress = bankAddress;
		this.BankPhoneNo = bankPhoneNo;
		this.AccountHolderName = accountHolderName;
		this.AccountHolderAddress = accountHolderAddress;
		this.AccountHolderPhoneNo = accountHolderPhoneNo;
		this.AccountHolderSsn = accountHolderSsn;
		this.TypeofAccount = typeofAccount;
		this.RoutingNo = routingNo;
		this.AccountNo = accountNo;
		this.OpenningBalance = openningBalance;
		this.ClosingBalance = closingBalance;
		this.InterestRate = interestRate;
		this.LastStatementDate = lastStatementDate;
		this.Discription = discription;
		this.RefChequeno = refChequeno;
		this.MoneyIn = moneyIn;
		this.MoneyOut = moneyOut;
		this.TransactionAmount = transactionAmount;
		this.TransactionType = transactionType;
		this.TransactionId = transactionId;
		this.TransactionParticular = transactionParticular;
		this.SourceCountry = sourceCountry;
		this.DestinationCountry = destinationCountry;
	}
	public Long getDTO() {
		return DTO;
	}
	public void setDTO(Long dTO) {
		DTO = dTO;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBankAddress() {
		return BankAddress;
	}
	public void setBankAddress(String bankAddress) {
		BankAddress = bankAddress;
	}
	public Double getBankPhoneNo() {
		return BankPhoneNo;
	}
	public void setBankPhoneNo(Double bankPhoneNo) {
		BankPhoneNo = bankPhoneNo;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	public String getAccountHolderAddress() {
		return AccountHolderAddress;
	}
	public void setAccountHolderAddress(String accountHolderAddress) {
		AccountHolderAddress = accountHolderAddress;
	}
	public String getAccountHolderPhoneNo() {
		return AccountHolderPhoneNo;
	}
	public void setAccountHolderPhoneNo(String accountHolderPhoneNo) {
		AccountHolderPhoneNo = accountHolderPhoneNo;
	}
	public String getAccountHolderSsn() {
		return AccountHolderSsn;
	}
	public void setAccountHolderSsn(String accountHolderSsn) {
		AccountHolderSsn = accountHolderSsn;
	}
	public String getTypeofAccount() {
		return TypeofAccount;
	}
	public void setTypeofAccount(String typeofAccount) {
		TypeofAccount = typeofAccount;
	}
	public Double getRoutingNo() {
		return RoutingNo;
	}
	public void setRoutingNo(Double routingNo) {
		RoutingNo = routingNo;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public String getOpenningBalance() {
		return OpenningBalance;
	}
	public void setOpenningBalance(String openningBalance) {
		OpenningBalance = openningBalance;
	}
	public String getClosingBalance() {
		return ClosingBalance;
	}
	public void setClosingBalance(String closingBalance) {
		ClosingBalance = closingBalance;
	}
	public Double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(Double interestRate) {
		InterestRate = interestRate;
	}
	public String getLastStatementDate() {
		return LastStatementDate;
	}
	public void setLastStatementDate(String lastStatementDate) {
		LastStatementDate = lastStatementDate;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
	public Double getRefChequeno() {
		return RefChequeno;
	}
	public void setRefChequeno(Double refChequeno) {
		RefChequeno = refChequeno;
	}
	public String getMoneyIn() {
		return MoneyIn;
	}
	public void setMoneyIn(String moneyIn) {
		MoneyIn = moneyIn;
	}
	public String getMoneyOut() {
		return MoneyOut;
	}
	public void setMoneyOut(String moneyOut) {
		MoneyOut = moneyOut;
	}
	public String getTransactionAmount() {
		return TransactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		TransactionAmount = transactionAmount;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	public Double getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(Double transactionId) {
		TransactionId = transactionId;
	}
	public String getTransactionParticular() {
		return TransactionParticular;
	}
	public void setTransactionParticular(String transactionParticular) {
		TransactionParticular = transactionParticular;
	}
	public String getSourceCountry() {
		return SourceCountry;
	}
	public void setSourceCountry(String sourceCountry) {
		SourceCountry = sourceCountry;
	}
	public String getDestinationCountry() {
		return DestinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		DestinationCountry = destinationCountry;
	}
	private String TransactionDate;
	private String BankName;
	private String BankAddress;
	private Double BankPhoneNo;
	private String AccountHolderName;
	private String AccountHolderAddress;
	private String AccountHolderPhoneNo;
	private String AccountHolderSsn;
	private String TypeofAccount;
	private Double RoutingNo;
	private String AccountNo;
	private String OpenningBalance;
	private String ClosingBalance;
	private Double InterestRate;
	private String LastStatementDate;
	private String Discription;
	private Double RefChequeno;
	private String MoneyIn;
	private String MoneyOut;
	private String TransactionAmount;
	private String TransactionType;
	private Double TransactionId;
	private String TransactionParticular;
	private String SourceCountry;
	private String DestinationCountry;
	

}

