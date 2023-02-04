package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")

public class Customer extends Person {
	@Column(name = "cid")
	private String cid;
	@Column(name = "customerMob")
	private String mobileNo;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cid, String mobileNo) {
		super();
		this.cid = cid;
		this.mobileNo = mobileNo;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}

