package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee extends Person {
	
	@Column(name = "eid")
	private String eid;
	@Column(name = "esal")
	private int sal;
	
	 public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String eid, int sal) {
		super();
		this.eid = eid;
		this.sal = sal;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	 
}
