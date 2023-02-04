package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp1")
public class Employee {

	@Id
	@Column(name = "ENO")
	private int eNo;

	@Column(name = "ENAME")
	private String eName;

	@Column(name = "EADDR")
	private String eAddr;

	@Column(name = "ESAL")
	private int eSalary;

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public Employee(int eNo, String eName,int eSalary, String eAddr ) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.eAddr = eAddr;
		this.eSalary = eSalary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
