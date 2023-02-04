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

	@Column(name = "ESAL")
	private int Salary;

	@Column(name = "EADDR")
	private String eAddr;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eNo, String eName, int salary, String eAddr) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		Salary = salary;
		this.eAddr = eAddr;
	}

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

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

}
