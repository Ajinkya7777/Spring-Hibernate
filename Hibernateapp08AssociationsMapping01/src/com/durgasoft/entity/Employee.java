package com.durgasoft.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee1")
public class Employee {
	@Id
	@Column(name = "eid", length = 10)
	private int eId;
	@Column(name = "ename", length = 10)
	private String eName;
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String eName, int eId, Account account) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.account = account;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
