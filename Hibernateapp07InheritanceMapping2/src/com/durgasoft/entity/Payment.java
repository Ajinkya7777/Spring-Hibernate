package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment {
		
	@Id
	@Column(name = "tid")
	private int tid;
	@Column(name = "pdate")
	private String pDate;
	@Column(name = "pamt")
	private String pAmt;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(int tid, String pDate, String pAmt) {
		super();
		this.tid = tid;
		this.pDate = pDate;
		this.pAmt = pAmt;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getpDate() {
		return pDate;
	}

	public void setpDate(String pDate) {
		this.pDate = pDate;
	}

	public String getpAmt() {
		return pAmt;
	}

	public void setpAmt(String pAmt) {
		this.pAmt = pAmt;
	}
	
}
