package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account1")
public class Account {

	@Id
	@Column(name = "accNo", length = 10)
	private int accNo;
	@Column(name = "Type", length = 10)
	private String accType;
	@Column(name = "balance", length = 10)
	private int balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String accType, int balance) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
