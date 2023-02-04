package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp4")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eno")
	private int eNo;

	@Column(name = "ename")
	private String eName;

	@Column(name = "eaddr")
	private String eAddr;

	@Column(name = "esal")
	private int eSal;

	@Embedded   ////HAS - A property in a database
	//@Column(name = "accNo")
	Account acc;

	@Embedded 	//HAS - A property in a database
	//@Column(name = "addrsStr")
	Address addrs;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String eName, String eAddr, int eSal, Account acc, Address addrs) {
		super();
		// this.eNo = eNo;
		this.eName = eName;
		this.eAddr = eAddr;
		this.eSal = eSal;
		this.acc = acc;
		this.addrs = addrs;
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

	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public int geteSal() {
		return eSal;
	}

	public void seteSal(int eSal) {
		this.eSal = eSal;
	}
}
