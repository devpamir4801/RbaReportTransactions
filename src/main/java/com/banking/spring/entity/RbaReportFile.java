package com.banking.spring.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class RbaReportFile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "RbaReport_Target", joinColumns = @JoinColumn(name = "rba_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "target_id", referencedColumnName = "id"))
	private List<Targetdb> TRDB;

	public RbaReportFile() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RbaReportFile(Long id, String TransactionDate, String BankName, String BankAddress, Double BankPhoneNo,
			String AccountHolderName, String AccountHolderAddress, String AccountHolderPhoneNo, String AccountHolderSsn,
			String TypeofAccount, Double RoutingNo, String AccountNo, String OpenningBalance, String ClosingBalance,
			Double InterestRate, String LastStatementDate, String Discription, Double RefChequeno, String MoneyIn,
			String MoneyOut, String TransactionAmount, String TransactionType, Double TransactionId,
			String TransactionParticular, String SourceCountry, String DestinationCountry) {
		super();
		this.id = id;
		this.AccountHolderAddress = AccountHolderAddress;
		this.AccountHolderName = AccountHolderName;
		this.AccountHolderPhoneNo = AccountHolderPhoneNo;
		this.AccountHolderSsn = AccountHolderSsn;
		this.AccountNo = AccountNo;
		this.BankAddress = BankAddress;
		this.BankName = BankName;
		this.BankPhoneNo = BankPhoneNo;
		this.ClosingBalance = ClosingBalance;
		this.DestinationCountry = DestinationCountry;
		this.Discription = Discription;
		this.InterestRate = InterestRate;
		this.LastStatementDate = LastStatementDate;
		this.TypeofAccount = TypeofAccount;
		this.MoneyIn = MoneyIn;
		this.MoneyOut = MoneyOut;
		this.TransactionAmount = TransactionAmount;
		this.TransactionDate = TransactionDate;
		this.TransactionId = TransactionId;
		this.TransactionParticular = TransactionParticular;
		this.RoutingNo = RoutingNo;
		this.SourceCountry = SourceCountry;
		this.DestinationCountry = DestinationCountry;
		this.OpenningBalance = OpenningBalance;
		this.RefChequeno = RefChequeno;

		/*
		 * this.name = name; this.amount = amount; this.number = number;
		 * this.receivedDate = receivedDate;
		 */
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
}
