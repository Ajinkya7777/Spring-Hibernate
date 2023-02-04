package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "emp6")
@DiscriminatorValue("emp")
public class Employee extends Account {
	
	@Column(name = "Eid")
	private String eId;
	@Column(name = "Esal")
	private int sal;
	@Column(name = "Eaddrs")
	private String eAddrs;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String eId, int sal, String eAddrs) {
		super();
		this.eId = eId;
		this.sal = sal;
		this.eAddrs = eAddrs;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getEAddrs() {
		return eAddrs;
	}

	public void setEAddrs(String eAddrs) {
		this.eAddrs = eAddrs;
	}

}
